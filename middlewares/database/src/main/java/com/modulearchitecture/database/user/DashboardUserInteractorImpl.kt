package com.modulearchitecture.database.user

import com.modulearchitecture.dashboard.api.DashboardUserInteractor
import com.modulearchitecture.database.user.repository.UserRepository
import javax.inject.Inject

class DashboardUserInteractorImpl @Inject constructor(
        private val userRepository: UserRepository)
    : DashboardUserInteractor {

    override fun getLoggedUser(): String {
        return userRepository.getLoggedUserName()
    }

}