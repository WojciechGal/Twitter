package pl.wojciech.twitter.home

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    val homeView: String
        @GetMapping("/")
        get() = "home"
}
