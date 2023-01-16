package com.company.desey.repositories

import com.company.desey.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Int> {

    fun findAllByOrderById(): List<UserEntity>
}