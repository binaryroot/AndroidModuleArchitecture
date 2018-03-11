package com.modulearchitecture.database.user.repository

import com.modulearchitecture.preferences.Preferences
import javax.inject.Inject


class SPUserRepository @Inject constructor(
        private var preferences: Preferences)
    : UserRepository {
    override fun isUserExist(user: String): Boolean {
        return preferences.isContains("user")
    }

    override fun saveUser(user: String, password: String) {
        preferences.save("user", user+" "+password)
    }

    override fun getLoggedUserName() : String {
        return preferences.get("user").split(" ")[0]
    }
}