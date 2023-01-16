package com.company.desey.services

import com.company.desey.dtos.UserDTO

interface UserService {

    fun getAllUsers(): List<UserDTO>
}