package io.codecrow.cro_android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.codecrow.cro_android.service.api.UserService
import io.codecrow.cro_android.service.repository.UserRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideUserRepository(
        userService: UserService
    ): UserRepository =
        UserRepository(userService)
}