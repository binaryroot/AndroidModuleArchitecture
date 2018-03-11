package com.modulearchitecture.database.di

import com.modulearchitecture.database.user.repository.SPUserRepository
import com.modulearchitecture.database.user.repository.UserRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [UserDatabaseModule::class])
abstract class DatabaseModule {

    @Binds
    @Singleton
    abstract fun bindUserRepository(spUserRepository: SPUserRepository) : UserRepository

}