package com.darylteo.vertx.ircbot.irc;

/**
 * Created by dteo on 7/03/2014.
 */
public enum CommandType {

  // misc
  _UNKNOWN("\0", "_UNKNOWN"),

  // basic command incoming
  ADMIN("ADMIN", "ADMIN"),
  AWAY("AWAY", "AWAY"),
  CONNECT("CONNECT", "CONNECT"),
  DIE("DIE", "DIE"),
  ERROR("ERROR", "ERROR"),
  INFO("INFO", "INFO"),
  INVITE("INVITE", "INVITE"),
  ISON("ISON", "ISON"),
  JOIN("JOIN", "JOIN"),
  KICK("KICK", "KICK"),
  KILL("KILL", "KILL"),
  LINKS("LINKS", "LINKS"),
  LIST("LIST", "LIST"),
  LUSERS("LUSERS", "LUSERS"),
  MODE("MODE", "MODE"),
  MOTD("MOTD", "MOTD"),
  NAMES("NAMES", "NAMES"),
  NICK("NICK", "NICK"),
  NOTICE("NOTICE", "NOTICE"),
  OPER("OPER", "OPER"),
  PART("PART", "PART"),
  PASS("PASS", "PASS"),
  PING("PING", "PING"),
  PONG("PONG", "PONG"),
  PRIVMSG("PRIVMSG", "PRIVMSG"),
  QUIT("QUIT", "QUIT"),
  REHASH("REHASH", "REHASH"),
  RESTART("RESTART", "RESTART"),
  SERVICE("SERVICE", "SERVICE"),
  SERVLIST("SERVLIST", "SERVLIST"),
  SQUERY("SQUERY", "SQUERY"),
  SQUIT("SQUIT", "SQUIT"),
  STATS("STATS", "STATS"),
  SUMMON("SUMMON", "SUMMON"),
  TIME("TIME", "TIME"),
  TOPIC("TOPIC", "TOPIC"),
  TRACE("TRACE", "TRACE"),
  USER("USER", "USER"),
  USERHOST("USERHOST", "USERHOST"),
  USERS("USERS", "USERS"),
  VERSION("VERSION", "VERSION"),
  WALLOPS("WALLOPS", "WALLOPS"),
  WHO("WHO", "WHO"),
  WHOIS("WHOIS", "WHOIS"),
  WHOWAS("WHOWAS", "WHOWAS"),

  // numeric command incoming
  RPL_WELCOME("001", "RPL_WELCOME"),
  RPL_YOURHOST("002", "RPL_YOURHOST"),
  RPL_CREATED("003", "RPL_CREATED"),
  RPL_MYINFO("004", "RPL_MYINFO"),
  RPL_BOUNCE("005", "RPL_BOUNCE"),
  RPL_USERHOST("302", "RPL_USERHOST"),
  RPL_ISON("303", "RPL_ISON"),
  RPL_AWAY("301", "RPL_AWAY"),
  RPL_UNAWAY("305", "RPL_UNAWAY"),
  RPL_NOWAWAY("306", "RPL_NOWAWAY"),
  RPL_WHOISUSER("311", "RPL_WHOISUSER"),
  RPL_WHOISSERVER("312", "RPL_WHOISSERVER"),
  RPL_WHOISOPERATOR("313", "RPL_WHOISOPERATOR"),
  RPL_WHOISIDLE("317", "RPL_WHOISIDLE"),
  RPL_ENDOFWHOIS("318", "RPL_ENDOFWHOIS"),
  RPL_WHOISCHANNELS("319", "RPL_WHOISCHANNELS"),
  RPL_WHOWASUSER("314", "RPL_WHOWASUSER"),
  RPL_ENDOFWHOWAS("369", "RPL_ENDOFWHOWAS"),
  RPL_LISTSTART("321", "RPL_LISTSTART"),
  RPL_LIST("322", "RPL_LIST"),
  RPL_LISTEND("323", "RPL_LISTEND"),
  RPL_UNIQOPIS("325", "RPL_UNIQOPIS"),
  RPL_CHANNELMODEIS("324", "RPL_CHANNELMODEIS"),
  RPL_NOTOPIC("331", "RPL_NOTOPIC"),
  RPL_TOPIC("332", "RPL_TOPIC"),
  RPL_INVITING("341", "RPL_INVITING"),
  RPL_SUMMONING("342", "RPL_SUMMONING"),
  RPL_INVITELIST("346", "RPL_INVITELIST"),
  RPL_ENDOFINVITELIST("347", "RPL_ENDOFINVITELIST"),
  RPL_EXCEPTLIST("348", "RPL_EXCEPTLIST"),
  RPL_ENDOFEXCEPTLIST("349", "RPL_ENDOFEXCEPTLIST"),
  RPL_VERSION("351", "RPL_VERSION"),
  RPL_WHOREPLY("352", "RPL_WHOREPLY"),
  RPL_ENDOFWHO("315", "RPL_ENDOFWHO"),
  RPL_NAMREPLY("353", "RPL_NAMREPLY"),
  RPL_ENDOFNAMES("366", "RPL_ENDOFNAMES"),
  RPL_LINKS("364", "RPL_LINKS"),
  RPL_ENDOFLINKS("365", "RPL_ENDOFLINKS"),
  RPL_BANLIST("367", "RPL_BANLIST"),
  RPL_ENDOFBANLIST("368", "RPL_ENDOFBANLIST"),
  RPL_INFO("371", "RPL_INFO"),
  RPL_ENDOFINFO("374", "RPL_ENDOFINFO"),
  RPL_MOTDSTART("375", "RPL_MOTDSTART"),
  RPL_MOTD("372", "RPL_MOTD"),
  RPL_ENDOFMOTD("376", "RPL_ENDOFMOTD"),
  RPL_YOUREOPER("381", "RPL_YOUREOPER"),
  RPL_REHASHING("382", "RPL_REHASHING"),
  RPL_YOURESERVICE("383", "RPL_YOURESERVICE"),
  RPL_TIME("391", "RPL_TIME"),
  RPL_USERSSTART("392", "RPL_USERSSTART"),
  RPL_USERS("393", "RPL_USERS"),
  RPL_ENDOFUSERS("394", "RPL_ENDOFUSERS"),
  RPL_NOUSERS("395", "RPL_NOUSERS"),
  RPL_TRACELINK("200", "RPL_TRACELINK"),
  RPL_TRACECONNECTING("201", "RPL_TRACECONNECTING"),
  RPL_TRACEHANDSHAKE("202", "RPL_TRACEHANDSHAKE"),
  RPL_TRACEUNKNOWN("203", "RPL_TRACEUNKNOWN"),
  RPL_TRACEOPERATOR("204", "RPL_TRACEOPERATOR"),
  RPL_TRACEUSER("205", "RPL_TRACEUSER"),
  RPL_TRACESERVER("206", "RPL_TRACESERVER"),
  RPL_TRACESERVICE("207", "RPL_TRACESERVICE"),
  RPL_TRACENEWTYPE("208", "RPL_TRACENEWTYPE"),
  RPL_TRACECLASS("209", "RPL_TRACECLASS"),
  RPL_TRACERECONNECT("210", "RPL_TRACERECONNECT"),
  RPL_TRACELOG("261", "RPL_TRACELOG"),
  RPL_TRACEEND("262", "RPL_TRACEEND"),
  RPL_STATSLINKINFO("211", "RPL_STATSLINKINFO"),
  RPL_STATSCOMMANDS("212", "RPL_STATSCOMMANDS"),
  RPL_ENDOFSTATS("219", "RPL_ENDOFSTATS"),
  RPL_STATSUPTIME("242", "RPL_STATSUPTIME"),
  RPL_STATSOLINE("243", "RPL_STATSOLINE"),
  RPL_UMODEIS("221", "RPL_UMODEIS"),
  RPL_SERVLIST("234", "RPL_SERVLIST"),
  RPL_SERVLISTEND("235", "RPL_SERVLISTEND"),
  RPL_LUSERCLIENT("251", "RPL_LUSERCLIENT"),
  RPL_LUSEROP("252", "RPL_LUSEROP"),
  RPL_LUSERUNKNOWN("253", "RPL_LUSERUNKNOWN"),
  RPL_LUSERCHANNELS("254", "RPL_LUSERCHANNELS"),
  RPL_LUSERME("255", "RPL_LUSERME"),
  RPL_ADMINME("256", "RPL_ADMINME"),
  RPL_ADMINLOC1("257", "RPL_ADMINLOC1"),
  RPL_ADMINLOC2("258", "RPL_ADMINLOC2"),
  RPL_ADMINEMAIL("259", "RPL_ADMINEMAIL"),
  RPL_TRYAGAIN("263", "RPL_TRYAGAIN"),
  ERR_NOSUCHNICK("401", "ERR_NOSUCHNICK"),
  ERR_NOSUCHSERVER("402", "ERR_NOSUCHSERVER"),
  ERR_NOSUCHCHANNEL("403", "ERR_NOSUCHCHANNEL"),
  ERR_CANNOTSENDTOCHAN("404", "ERR_CANNOTSENDTOCHAN"),
  ERR_TOOMANYCHANNELS("405", "ERR_TOOMANYCHANNELS"),
  ERR_WASNOSUCHNICK("406", "ERR_WASNOSUCHNICK"),
  ERR_TOOMANYTARGETS("407", "ERR_TOOMANYTARGETS"),
  ERR_NOSUCHSERVICE("408", "ERR_NOSUCHSERVICE"),
  ERR_NOORIGIN("409", "ERR_NOORIGIN"),
  ERR_NORECIPIENT("411", "ERR_NORECIPIENT"),
  ERR_NOTEXTTOSEND("412", "ERR_NOTEXTTOSEND"),
  ERR_NOTOPLEVEL("413", "ERR_NOTOPLEVEL"),
  ERR_WILDTOPLEVEL("414", "ERR_WILDTOPLEVEL"),
  ERR_BADMASK("415", "ERR_BADMASK"),
  ERR_UNKNOWNCOMMAND("421", "ERR_UNKNOWNCOMMAND"),
  ERR_NOMOTD("422", "ERR_NOMOTD"),
  ERR_NOADMININFO("423", "ERR_NOADMININFO"),
  ERR_FILEERROR("424", "ERR_FILEERROR"),
  ERR_NONICKNAMEGIVEN("431", "ERR_NONICKNAMEGIVEN"),
  ERR_ERRONEUSNICKNAME("432", "ERR_ERRONEUSNICKNAME"),
  ERR_NICKNAMEINUSE("433", "ERR_NICKNAMEINUSE"),
  ERR_NICKCOLLISION("436", "ERR_NICKCOLLISION"),
  ERR_UNAVAILRESOURCE("437", "ERR_UNAVAILRESOURCE"),
  ERR_USERNOTINCHANNEL("441", "ERR_USERNOTINCHANNEL"),
  ERR_NOTONCHANNEL("442", "ERR_NOTONCHANNEL"),
  ERR_USERONCHANNEL("443", "ERR_USERONCHANNEL"),
  ERR_NOLOGIN("444", "ERR_NOLOGIN"),
  ERR_SUMMONDISABLED("445", "ERR_SUMMONDISABLED"),
  ERR_USERSDISABLED("446", "ERR_USERSDISABLED"),
  ERR_NOTREGISTERED("451", "ERR_NOTREGISTERED"),
  ERR_NEEDMOREPARAMS("461", "ERR_NEEDMOREPARAMS"),
  ERR_ALREADYREGISTRED("462", "ERR_ALREADYREGISTRED"),
  ERR_NOPERMFORHOST("463", "ERR_NOPERMFORHOST"),
  ERR_PASSWDMISMATCH("464", "ERR_PASSWDMISMATCH"),
  ERR_YOUREBANNEDCREEP("465", "ERR_YOUREBANNEDCREEP"),
  ERR_YOUWILLBEBANNED("466", "ERR_YOUWILLBEBANNED"),
  ERR_KEYSET("467", "ERR_KEYSET"),
  ERR_CHANNELISFULL("471", "ERR_CHANNELISFULL"),
  ERR_UNKNOWNMODE("472", "ERR_UNKNOWNMODE"),
  ERR_INVITEONLYCHAN("473", "ERR_INVITEONLYCHAN"),
  ERR_BANNEDFROMCHAN("474", "ERR_BANNEDFROMCHAN"),
  ERR_BADCHANNELKEY("475", "ERR_BADCHANNELKEY"),
  ERR_BADCHANMASK("476", "ERR_BADCHANMASK"),
  ERR_NOCHANMODES("477", "ERR_NOCHANMODES"),
  ERR_BANLISTFULL("478", "ERR_BANLISTFULL"),
  ERR_NOPRIVILEGES("481", "ERR_NOPRIVILEGES"),
  ERR_CHANOPRIVSNEEDED("482", "ERR_CHANOPRIVSNEEDED"),
  ERR_CANTKILLSERVER("483", "ERR_CANTKILLSERVER"),
  ERR_RESTRICTED("484", "ERR_RESTRICTED"),
  ERR_UNIQOPPRIVSNEEDED("485", "ERR_UNIQOPPRIVSNEEDED"),
  ERR_NOOPERHOST("491", "ERR_NOOPERHOST"),
  ERR_UMODEUNKNOWNFLAG("501", "ERR_UMODEUNKNOWNFLAG"),
  ERR_USERSDONTMATCH("502", "ERR_USERSDONTMATCH");

  private String code;
  private String name;

  CommandType(String code, String name) {
    this.code = code;
    this.name = name;
  }

  public String code() {
    return this.code;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
