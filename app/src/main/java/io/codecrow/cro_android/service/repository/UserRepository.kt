package io.codecrow.cro_android.service.repository

import io.codecrow.cro_android.model.User
import io.codecrow.cro_android.service.api.UserService

class UserRepository(
    private val userService: UserService
) {
    suspend fun getUser(): User = userService.getUser()
}