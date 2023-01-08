package com.company.desey.repositories

import com.company.desey.entities.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserEntity, Int> {

}