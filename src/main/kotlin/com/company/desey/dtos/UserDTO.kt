package com.company.desey.dtos

data class UserDTO(
    val id: Int? = null, // это ID-шка nullable потому что при принятии запроса оно будет пустая но БД самостоятельно поставит значение
    val username: String,
    val hashedPassword: String,
    val firstname: String,
    val lastname: String,
    val bio: String,
    val birthday: String,
    val email: String,
    val phone: String
)
