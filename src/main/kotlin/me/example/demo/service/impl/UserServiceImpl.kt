package me.example.demo.service.impl

import me.example.demo.domain.Profile
import me.example.demo.domain.User
import me.example.demo.domain.repo.UserRepository
import me.example.demo.dto.ProfileData
import me.example.demo.dto.ResponseUser
import me.example.demo.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(val repository: UserRepository) : UserService {

    val toResponse: (User) -> ResponseUser = { (id, username, _, profile, roleList) ->
        val profileMapper: (Profile) -> ProfileData =
            { (_, firstName, lastName, age, description) -> ProfileData(firstName, lastName, age, description) }
        ResponseUser(id.toString(), username, profileMapper(profile), roleList.map { role -> role.name })
    }

    override fun getAll() = repository.findAll().map { user -> toResponse(user) }.toList()

    override fun getById(id: UUID): Optional<ResponseUser> = repository.findById(id).map { user -> toResponse(user) }

    //todo: implement invalid body catching
    override fun update(user: User): ResponseUser = (repository.save(user) to toResponse(user)).second

    override fun remove(id: UUID) = repository.deleteById(id)


}