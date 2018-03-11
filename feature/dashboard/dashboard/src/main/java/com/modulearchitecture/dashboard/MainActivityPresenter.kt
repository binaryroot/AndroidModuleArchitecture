package com.modulearchitecture.dashboard

import com.modulearchitecture.dashboard.api.DashboardUserInteractor
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
        private var dashboardUserInteractor: DashboardUserInteractor)
    : MainActivityContract.Presenter {

    lateinit var view: MainActivityContract.View

    override fun bind(view: MainActivityContract.View) {
        this.view = view
        view.showLoggedUser(dashboardUserInteractor.getLoggedUser())
    }

}