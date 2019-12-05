package pl.wojciech.twitter.author

import org.springframework.security.core.GrantedAuthority

class CurrentUser(nick: String, password: String,
                  authorities: Collection<GrantedAuthority>,
                  val author: Author) : org.springframework.security.core.userdetails.User(nick, password, authorities)
