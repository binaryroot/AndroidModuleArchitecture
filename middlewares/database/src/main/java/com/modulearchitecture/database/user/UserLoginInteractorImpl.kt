package com.modulearchitecture.database.user

import com.modulearchitecture.database.user.repository.UserRepository
import com.modulearchitecture.login.api.UserLoginInteractor
import javax.inject.Inject

class UserLoginInteractorImpl @Inject constructor(
        private val userRepository: UserRepository)
    : UserLoginInteractor {

    override fun login(user: String, password: String): Boolean {
        return true
    }

    override fun saveUser(user: String, password: String) {
        userRepository.saveUser(user, password)
    }
}