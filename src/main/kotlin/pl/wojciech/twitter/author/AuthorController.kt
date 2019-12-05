package pl.wojciech.twitter.author

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

import javax.validation.Valid

@Controller
class AuthorController(private val authorService: AuthorService) {

    @GetMapping("/register")
    fun createAuthor(model: Model): String {
        val author = Author()
        model.addAttribute("author", author)
        return "registration"
    }

    @PostMapping("/register")
    fun createAuthor(@Valid author: Author, result: BindingResult): String {

        if (result.hasErrors()) {
            return "registration"
        }

        authorService.saveAuthor(author)
        return "redirect:/login"
    }

}
