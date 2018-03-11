package com.modulearchitecture.database.user.repository


interface UserRepository {

    fun isUserExist(user: String): Boolean

    fun saveUser(user: String, password: String)

    fun getLoggedUserName() : String

}