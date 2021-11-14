package me.example.demo.dto

data class ResponseUser(val id: String, val username: String, val profileData: ProfileData, val roles: List<String>)
data class ProfileData(val firstName: String, val lastName: String, val age: Int, val description: String?)