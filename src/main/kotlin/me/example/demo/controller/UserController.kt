package me.example.demo.controller

import me.example.demo.domain.User
import me.example.demo.dto.ResponseUser
import me.example.demo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("users")
class UserController(val service: UserService) {

    @GetMapping
    fun listAll() = ResponseEntity.ok(service.getAll())

    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: UUID): ResponseEntity<ResponseUser> =
        service.getById(id).map { user -> ResponseEntity.ok(user) }.orElse(ResponseEntity.noContent().build())

    @PutMapping
    fun update(@RequestBody user: User) = ResponseEntity.ok(service.update(user))

    @DeleteMapping("{id}")
    fun remove(@PathVariable("id") id: UUID) = service.remove(id)
}