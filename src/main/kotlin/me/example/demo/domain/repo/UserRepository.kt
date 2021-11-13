package me.example.demo.domain.repo

import me.example.demo.domain.entity.User
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository : CrudRepository<User, UUID>