package com.modulearchitecture.login.di

import com.modulearchitecture.dashboard.di.scope.ActivityScope
import com.modulearchitecture.login.LoginActivityContract
import com.modulearchitecture.login.LoginActivityPresenter
import com.modulearchitecture.login.api.UserLoginOrchestrator
import com.modulearchitecture.login.api.UserLoginOrchestratorImpl
import dagger.Binds
import dagger.Module


@Module
abstract class LoginFlowModule {

    @Binds
    @ActivityScope
    abstract fun bindLoginActivityPresenter(presenter: LoginActivityPresenter): LoginActivityContract.Presenter

    @Binds
    @ActivityScope
    abstract fun bindUserLoginOrchestrator(userLoginOrchestratorImpl: UserLoginOrchestratorImpl): UserLoginOrchestrator

}