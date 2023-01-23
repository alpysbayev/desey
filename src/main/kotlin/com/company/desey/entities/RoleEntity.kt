package com.company.desey.entities

import javax.persistence.*

@Entity
@Table(name = "roles")
class RoleEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "name")
    val name: String

)