package me.example.demo.domain.entity

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
