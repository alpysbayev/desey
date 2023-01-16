package com.company.desey.dtos

data class UserDTO (
    val id: Int? = null, // это ID-шка nullable потому что при принятии запроса оно будет пустая но БД самостоятельно поставит значение

    val username: String = "",
    val email: String = "",
    var password: String = "",
    val confirmPassword: String = "",

    val roles: List<RoleDTO> = emptyList(),

    val firstname: String = "",
    val lastname: String = "",

    val bio: String? = "",
    val birthday: String = "",
    val phone: String = ""
)