package pl.wojciech.twitter.tweet

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import pl.wojciech.twitter.author.Author
import pl.wojciech.twitter.author.CurrentUser
import javax.validation.Valid

@Controller
class TweetController {

    @Autowired
    val tweetService: TweetService? = null

    @GetMapping("/sendTweet")
    fun sendTweet(@AuthenticationPrincipal currentUser: CurrentUser, model: Model): String {
        val thisTweet: Tweet = Tweet()
        thisTweet.author = currentUser.author
        model.addAttribute("tweet", thisTweet)
        return "sendTweet"
    }

    @PostMapping("/sendTweet")
    fun sendTweet(@Valid thisTweet: Tweet, result: BindingResult): String {
        if (result.hasErrors()) {
            return "sendTweet"
        }
        tweetService!!.sendTweet(thisTweet)
        return "tweetHasBeenPublicated"
    }

    @GetMapping("/allAuthorTweets")
    fun getAllAuthorTweets(@AuthenticationPrincipal currentUser: CurrentUser, model: Model): String {
        val author: Author = currentUser.author
        val tweetList: List<Tweet> = tweetService!!.lookAtYourTweets(author)
        model.addAttribute("tweets", tweetList)
        return "allAuthorTweets"
    }

    @GetMapping("/allTweets")
    fun getAllTweets(model: Model): String {
        model.addAttribute("tweets", tweetService!!.lookAtAllTweets())
        return "allTweets"
    }
}