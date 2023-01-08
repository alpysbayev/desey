package com.company.desey.services.impl

import com.company.desey.dtos.UserDTO
import com.company.desey.repositories.UserRepository
import com.company.desey.services.UserService
import com.company.desey.convertations.*

class UserServiceImpl (
    private val userRepository: UserRepository
) : UserService {

    override fun create(dto: UserDTO): Int {
        val userEntity = userRepository.save(dto.toEntity())
        return userEntity.id
    }



}