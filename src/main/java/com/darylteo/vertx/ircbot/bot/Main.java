package com.darylteo.vertx.ircbot.bot;

import com.darylteo.vertx.ircbot.bot.channels.Channel;
import com.darylteo.vertx.ircbot.bot.plugins.CommandListPlugin;
import com.darylteo.vertx.ircbot.irc.CommandType;
import com.darylteo.vertx.ircbot.irc.IRCClient;
import com.darylteo.vertx.ircbot.irc.messages.Message;
import org.vertx.java.platform.Verticle;
import rx.Observable;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by dteo on 6/03/2014.
 */
public class Main extends Verticle {
  private IRCClient client;

  private String nick = "vertxbot";
  private String name = "Daryl Teo";

  @Override
  public void start() {
    IRCClient _client = new IRCClient(this.vertx, nick, name, client -> {
      // join channels
      Observable<Message> motd = this.waitForMOTD(client);

      Observable<Channel> channels = motd
        .toList()
        .flatMap(messages -> this.joinChannels(client));

      channels.subscribe();
    });
  }

  @Override
  public void stop() {
    if (this.client != null) {
      this.client.quit("Shutting Down");
    }

    super.stop();
  }

  private Observable<Message> waitForMOTD(IRCClient client) {
    return client.stream()
      .takeWhile(message -> !message.isCommand(CommandType.RPL_ENDOFMOTD));
  }

  private Observable<Channel> joinChannels(IRCClient client) {
    List<Channel> channels = new LinkedList<>();

    Channel channel = new Channel(client, "vertxbot", "#vertxbot");
    channel.registerPlugin(new CommandListPlugin());

    channels.add(channel);

    return Observable.from(channels);
  }

}
