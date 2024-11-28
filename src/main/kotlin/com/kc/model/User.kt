package com.kc.model

import java.util.UUID

data class User(
    val id: UUID,
    val username: String,
    val password: String
)
