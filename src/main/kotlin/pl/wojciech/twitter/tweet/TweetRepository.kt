package pl.wojciech.twitter.tweet

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pl.wojciech.twitter.author.Author

@Repository
interface TweetRepository: JpaRepository<Tweet, Long> {

    fun findAllByAuthor(author: Author): List<Tweet>
}