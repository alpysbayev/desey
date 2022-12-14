package com.company.desey.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@Configuration
@EnableWebSecurity
class SecurityConfiguration {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeRequests()
                .antMatchers("/", "/signup", "/login").permitAll()
                .anyRequest().authenticated()
            .and()
                .formLogin().loginPage("/login").permitAll()
            .and()
                .logout().logoutRequestMatcher(AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
            .and()

        return http.build()
    }
}











