package com.company.desey.convertations

import com.company.desey.dtos.UserDTO
import com.company.desey.entities.UserEntity


fun UserDTO.toEntity() : UserEntity =
    UserEntity(
        id = 0,
        username = this.username,
        hashedPassword = this.hashedPassword,
        firstname = this.firstname,
        lastname = this.lastname,
        bio = this.bio,
        birthday = this.birthday,
        email = this.email,
        phone = this.phone
    )

fun UserEntity.toDTO() : UserDTO =
    UserDTO(
        id = this.id,
        username = this.username,
        hashedPassword = this.hashedPassword,
        firstname = this.firstname,
        lastname = this.lastname,
        bio = this.bio,
        birthday = this.birthday,
        email = this.email,
        phone = this.phone
    )