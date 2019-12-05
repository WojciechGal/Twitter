package pl.wojciech.twitter.author

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<Author, Long> {

    fun findByNick(email: String): Author

}
