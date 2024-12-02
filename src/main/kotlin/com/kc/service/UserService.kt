package com.kc.service

import com.kc.model.User
import com.kc.repository.UserRepository
import java.util.*

class UserService(
    private val userRepository: UserRepository
) {

    fun findAll(): List<User> = userRepository.findAll()

    fun findById(id: String): User? = userRepository.findById(id = UUID.fromString(id))

    fun findByUsername(name: String): User? = userRepository.findByUsername(name)

    fun save(user: User): User? {
        val foundUser = findByUsername(user.username)

        return if(foundUser == null) {
            userRepository.save(user)
            user
        } else null
    }
}