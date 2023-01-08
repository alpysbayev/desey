package com.company.desey.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class MainController {

    @GetMapping
    fun indexPage(): String = "views/index"

    @GetMapping("/about")
    fun aboutPage(): String = "views/about"

    @GetMapping("/contact")
    fun contactPage(): String = "views/contact"

    @GetMapping("/login")
    fun logInPage(): String = "views/login"

    @GetMapping("/signup")
    fun signUpPage(): String = "views/signup"

//    @PostMapping("/signup")
//    fun registerUser():

}