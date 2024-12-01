package com.kc.service

import com.kc.model.User
import com.kc.repository.UserRepository
import java.util.*

class UserService(
    private val userRepository: UserRepository
) {

    fun findAll(): List<User> = userRepository.findAll()

    fun findById(id: String): User? = userRepository.findById(id = UUID.fromString(id))
}