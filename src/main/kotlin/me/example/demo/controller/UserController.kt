package me.example.demo.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import me.example.demo.domain.User
import me.example.demo.dto.ResponseUser
import me.example.demo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@Api(tags = ["UserAPI"])
@RequestMapping("users")
class UserController(val service: UserService) {

    @GetMapping
    @ApiOperation(value = "Get list of all users")
    fun listAll() = ResponseEntity.ok(service.getAll())

    @GetMapping("{id}")
    @ApiOperation(value = "Get user by id")
    fun findById(@PathVariable("id") id: UUID): ResponseEntity<ResponseUser> =
        service.getById(id).map { user -> ResponseEntity.ok(user) }.orElse(ResponseEntity.noContent().build())

    @PutMapping
    @ApiOperation(value = "Save new user or update existing")
    fun update(@RequestBody user: User) = ResponseEntity.ok(service.update(user))

    @DeleteMapping("{id}")
    @ApiOperation(value = "Remove user by provided id")
    fun remove(@PathVariable("id") id: UUID) = service.remove(id)
}