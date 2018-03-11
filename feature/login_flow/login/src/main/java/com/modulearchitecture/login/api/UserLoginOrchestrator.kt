package com.modulearchitecture.login.api

interface UserLoginOrchestrator {

    fun login(userName: String, password: String) : Boolean

}