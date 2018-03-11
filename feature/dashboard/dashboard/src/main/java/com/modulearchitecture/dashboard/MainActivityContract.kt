package com.modulearchitecture.dashboard

object MainActivityContract {

    interface View {

        fun showLoggedUser(userName : String)

    }


    interface Presenter {

        fun bind(view : View)

    }
}