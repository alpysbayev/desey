package com.company.desey.repositories

import com.company.desey.entities.RoleEntity
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<RoleEntity, Int> {

    fun findByName(roleName: String): RoleEntity
}