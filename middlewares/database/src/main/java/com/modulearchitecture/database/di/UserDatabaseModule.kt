package com.modulearchitecture.database.di

import com.modulearchitecture.dashboard.api.DashboardUserInteractor
import com.modulearchitecture.database.user.DashboardUserInteractorImpl
import com.modulearchitecture.database.user.UserLoginInteractorImpl
import com.modulearchitecture.login.api.UserLoginInteractor
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserDatabaseModule {

    @Binds
    @Singleton
    abstract fun bindUserLoginInteractor(interactor: UserLoginInteractorImpl) : UserLoginInteractor

    @Binds
    @Singleton
    abstract fun bindDashboardUserLoginInteractor(interactorImpl: DashboardUserInteractorImpl) : DashboardUserInteractor

}