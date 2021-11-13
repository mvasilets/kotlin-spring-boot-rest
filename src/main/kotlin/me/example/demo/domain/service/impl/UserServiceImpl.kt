package me.example.demo.domain.service.impl

import me.example.demo.domain.repo.UserRepository
import me.example.demo.domain.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val repository: UserRepository) : UserService