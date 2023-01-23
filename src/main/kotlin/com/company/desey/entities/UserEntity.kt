package com.company.desey.entities

import javax.persistence.*

@Entity
@Table(name = "users")
class UserEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,

    @Column(name = "username")
    var username: String = "",

    @Column(name = "hashed_password")
    var hashedPassword: String = "",

    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
        name = "users_roles",
        joinColumns = [JoinColumn(name = "user_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    var roles: MutableList<RoleEntity> = mutableListOf(),

    @Column(name = "firstname")
    var firstname: String = "",

    @Column(name = "lastname")
    var lastname: String = "",

    @Column(name = "bio")
    var bio: String = "",

    @Column(name = "birthday")
    var birthday: String = "",

    @Column(name = "email")
    var email: String = "",

    @Column(name = "phone")
    var phone: String = "",
)