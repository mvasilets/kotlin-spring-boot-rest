package me.example.demo.domain.entity

import javax.persistence.*

@Entity
@Table(name = "profiles")
data class Profile(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "profile_id") val id: Int,
    var firstName: String,
    var lastName: String,
    var age: Int,
    var description: String
)
