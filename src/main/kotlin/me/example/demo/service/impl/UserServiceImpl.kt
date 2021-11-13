package me.example.demo.service.impl

import me.example.demo.domain.repo.UserRepository
import me.example.demo.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val repository: UserRepository) : UserService