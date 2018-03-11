package com.modulearchitecture.login

import com.modulearchitecture.login.api.UserLoginInteractor
import com.modulearchitecture.login.api.UserLoginOrchestrator
import javax.inject.Inject

class LoginActivityPresenter @Inject constructor(private val userLoginOrchestrator: UserLoginOrchestrator) : LoginActivityContract.Presenter {

    lateinit var view: LoginActivityContract.View

    override fun bind(view: LoginActivityContract.View) {
        this.view = view
    }

    override fun login(user: String, password: String) {
        if(user.trim().isEmpty() || password.trim().isEmpty()) {
            view.showLoginError()
            return
        }

        val login = userLoginOrchestrator.login(user, password)
        if (login) {
            view.openDashboardActivity()
        }
    }
}