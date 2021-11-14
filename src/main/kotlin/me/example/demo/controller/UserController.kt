package me.example.demo.controller

import me.example.demo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users")
class UserController(val service: UserService) {

    @GetMapping
    fun listAll() = ResponseEntity.ok(service.getAll())

}