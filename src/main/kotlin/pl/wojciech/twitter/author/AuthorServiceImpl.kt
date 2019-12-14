package pl.wojciech.twitter.author

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import pl.wojciech.twitter.role.RoleRepository

import java.util.*

@Service
class AuthorServiceImpl(private val authorRepository: AuthorRepository, private val roleRepository: RoleRepository,
                        private val passwordEncoder: BCryptPasswordEncoder) : AuthorService {

    override fun findByAuthorNick(nick: String): Author {
        return authorRepository.findByNick(nick)
    }

    override fun saveAuthor(author: Author) {
        author.password = passwordEncoder.encode(author.password)
        author.enabled = 1
        val authorRole = roleRepository.findByName("ROLE_USER")
        author.roles = HashSet(listOf(authorRole))
        authorRepository.save(author)
    }

}
