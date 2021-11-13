package me.example.demo.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "user_data")
data class User(
    @Id val id: UUID? = UUID.randomUUID(),
    val username: String,
    var password: String,
    @OneToOne @JoinColumn(name = "profile_id") var profile: Profile,
    @OneToMany(fetch = FetchType.EAGER) var roles: List<Role>
)

@Entity
@Table(name = "roles")
data class Role(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Int, val name: String)

@Entity
@Table(name = "profiles")
data class Profile(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "profile_id") val id: Int,
    var firstName: String,
    var lastName: String,
    var age: Int,
    var description: String
)