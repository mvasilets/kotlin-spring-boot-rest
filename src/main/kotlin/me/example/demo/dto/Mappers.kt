package me.example.demo.dto

import me.example.demo.domain.Role
import me.example.demo.domain.User

fun mapUserToResponse(user: User): ResponseUser {
    val (_, firstName, lastName, age, description) = user.profile
    val (id, username) = user
    return ResponseUser(
        username = username,
        id = id.toString(),
        profileData = ProfileData(firstName, lastName, age, description),
        roles = user.roles.map { role: Role -> role.name }.toList()
    )
}
