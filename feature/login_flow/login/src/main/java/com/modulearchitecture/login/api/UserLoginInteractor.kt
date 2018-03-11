package com.modulearchitecture.login.api


interface UserLoginInteractor {

    fun login(user: String, password: String): Boolean

    fun saveUser(user: String, password: String)

}