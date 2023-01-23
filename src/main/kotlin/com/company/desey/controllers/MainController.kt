package com.company.desey.controllers

import com.company.desey.dtos.UserDTO
import com.company.desey.entities.UserEntity
import com.company.desey.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class MainController (
    private val userService: UserService
) {

    @GetMapping()
    fun helloWorld(): String = "Hello, World!"

    @GetMapping("/users")
    fun users(): List<UserDTO> {
        return userService.getAllUsers()
    }

    @PostMapping("/users")
    fun createUser(
        @RequestBody userDTO: UserDTO
    ): UserEntity {
        return userService.createUser(userDTO)
    }



}