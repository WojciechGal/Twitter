package pl.wojciech.twitter.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import pl.wojciech.twitter.author.SpringDataUserDetailsService

@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .antMatchers("/**").permitAll()
                .and().formLogin()
                .loginPage("/login").defaultSuccessUrl("/messages").failureUrl("/login?error=fail")
                .and().logout().logoutSuccessUrl("/").permitAll()
    }

    @Bean
    fun passwordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun customUserDetailsService(): SpringDataUserDetailsService {
        return SpringDataUserDetailsService()
    }
}
