package io.codecrow.cro_android.service.api

import io.codecrow.cro_android.model.User
import retrofit2.http.GET

interface UserService {
    @GET("user")
    suspend fun getUser(): User
}