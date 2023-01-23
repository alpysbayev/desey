package com.company.desey.services

import com.company.desey.dtos.UserDTO
import com.company.desey.entities.UserEntity

interface UserService {

    fun getAllUsers(): List<UserDTO>

    fun createUser(userDTO: UserDTO): UserEntity
}