package com.modulearchitecture.dashboard.di

import com.modulearchitecture.dashboard.MainActivity
import com.modulearchitecture.dashboard.di.scope.ActivityScope
import com.modulearchitecture.dashboard.di.scope.PerModuleScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class DashboardFeatureModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [DashboardModule::class])
    abstract fun bindMainActivity(): MainActivity
}