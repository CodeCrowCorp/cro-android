package io.codecrow.cro_android.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.codecrow.cro_android.service.api.UserService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson =
        GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson): Retrofit.Builder =
        Retrofit.Builder()
            .baseUrl("https://api.codecrow.io/")
            .addConverterFactory(GsonConverterFactory.create(gson))

    @Singleton
    @Provides
    fun provideUserService(retrofit: Retrofit.Builder): UserService =
        retrofit
            .build()
            .create(UserService::class.java)
}