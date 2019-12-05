package pl.wojciech.twitter.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebAppConfig : WebMvcConfigurer{

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/login").setViewName("login")
    }
}
