package com.company.desey.services.impl

import com.company.desey.dtos.RoleDTO
import com.company.desey.dtos.UserDTO
import com.company.desey.entities.RoleEntity
import com.company.desey.entities.UserEntity
import com.company.desey.repositories.RoleRepository
import com.company.desey.repositories.UserRepository
import com.company.desey.services.UserService
import org.springframework.stereotype.Service

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

@Service
class UserServiceImpl (
    private val userRepository: UserRepository,
    private val roleRepository: RoleRepository
) : UserService {
    override fun getAllUsers(): List<UserDTO> {
        return userRepository.findAllByOrderById().map { it.toDTO() }
    }

    override fun createUser(userDTO: UserDTO): UserEntity {
        val userEntity = userDTO.toEntity()

        val role = roleRepository.findByName("ROLE_USER")
        userEntity.roles.add(role)

        userEntity.hashedPassword = passwordEncoder().encode(userEntity.hashedPassword)

        return userRepository.save(userEntity)
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

    private fun UserDTO.toEntity(): UserEntity = UserEntity (
        id = 0,
        username = this.username,
        hashedPassword = this.password,
        roles = this.roles.map { RoleEntity(id = 0, name = it.name) }.toMutableList(),
        firstname = this.firstname,
        lastname = this.lastname,
        bio = this.bio,
        birthday = this.birthday,
        email = this.email,
        phone = this.phone
    )

    private fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

}