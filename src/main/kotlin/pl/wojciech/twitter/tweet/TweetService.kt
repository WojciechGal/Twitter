package pl.wojciech.twitter.tweet

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import pl.wojciech.twitter.author.Author

@Service
@Transactional
class TweetService {

    @Autowired
    private val tweetRepository: TweetRepository? = null

    fun sendTweet(tweet: Tweet) {
        tweetRepository!!.save(tweet)
    }

    fun lookAtAllTweets(): List<Tweet> {
        return tweetRepository!!.findAll();
    }

    fun lookAtYourTweets(author: Author): List<Tweet> {
        return tweetRepository!!.findAllByAuthor(author)
    }
}