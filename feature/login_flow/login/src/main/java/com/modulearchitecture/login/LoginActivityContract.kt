package com.modulearchitecture.login

object LoginActivityContract {

    interface View {

        fun openDashboardActivity()

        fun showLoginError();
    }

    interface Presenter {

        fun bind(view: View)

        fun login(user: String, password: String)

    }
}