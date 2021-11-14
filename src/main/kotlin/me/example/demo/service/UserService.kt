package me.example.demo.service

import me.example.demo.domain.User
import me.example.demo.dto.ResponseUser
import java.util.*

interface UserService {
    fun getAll(): List<ResponseUser>
    fun getById(id: UUID): Optional<ResponseUser>
    fun update(user: User): ResponseUser
    fun remove(id: UUID)
}