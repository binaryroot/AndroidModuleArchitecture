package com.modulearchitecture.login.api

import javax.inject.Inject

class UserLoginOrchestratorImpl @Inject constructor(
        private val userLoginInteractor: UserLoginInteractor)
    : UserLoginOrchestrator {

    override fun login(userName: String, password: String) : Boolean {
        val result = userLoginInteractor.login(userName, password)
        userLoginInteractor.saveUser(userName, password)
        return result
    }
}