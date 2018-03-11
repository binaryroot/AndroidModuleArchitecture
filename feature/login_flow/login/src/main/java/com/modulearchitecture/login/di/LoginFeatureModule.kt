package com.modulearchitecture.login.di

import com.modulearchitecture.dashboard.di.scope.ActivityScope
import com.modulearchitecture.dashboard.di.scope.PerModuleScope
import com.modulearchitecture.login.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LoginFeatureModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginFlowModule::class])
    abstract fun bindLoginActivity(): LoginActivity

}