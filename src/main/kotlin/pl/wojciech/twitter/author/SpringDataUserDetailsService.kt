package pl.wojciech.twitter.author

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException

import java.util.HashSet

class SpringDataUserDetailsService : UserDetailsService {

    @Autowired
    private val authorService: AuthorService? = null

    override fun loadUserByUsername(nick: String): UserDetails {
        val author = authorService!!.findByAuthorNick(nick) ?: throw UsernameNotFoundException(nick)

        val grantedAuthorities = HashSet<GrantedAuthority>()
        author.roles!!.forEach { r -> grantedAuthorities.add(SimpleGrantedAuthority(r.name)) }
        return CurrentUser(author.nick!!, author.password!!,
                grantedAuthorities, author)
    }
}
