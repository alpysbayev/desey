package com.company.desey.services.impl

import com.company.desey.dtos.RoleDTO
import com.company.desey.dtos.UserDTO
import com.company.desey.entities.UserEntity
import com.company.desey.repositories.UserRepository
import com.company.desey.services.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl (
    private val userRepository: UserRepository
) : UserService {
    override fun getAllUsers(): List<UserDTO> {
        return userRepository.findAllByOrderById().map { it.toDTO() }
    }


    private fun UserEntity.toDTO() : UserDTO = UserDTO (
        id = this.id,
        username = this.username,
        password = this.hashedPassword,
        roles = this.roles.map { RoleDTO(it.id, it.name) },
        firstname = this.firstname,
        lastname = this.lastname,
        bio = this.bio,
        birthday = this.birthday,
        email = this.email,
        phone = this.phone
    )
}