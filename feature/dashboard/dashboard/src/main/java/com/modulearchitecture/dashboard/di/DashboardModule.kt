package com.modulearchitecture.dashboard.di

import com.modulearchitecture.dashboard.MainActivityContract
import com.modulearchitecture.dashboard.MainActivityPresenter
import com.modulearchitecture.dashboard.di.scope.ActivityScope
import dagger.Binds
import dagger.Module

@Module
abstract class DashboardModule {

    @Binds
    @ActivityScope
    abstract fun bindMainActivityPresenter(presenter: MainActivityPresenter): MainActivityContract.Presenter

}