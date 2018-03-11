package com.modulearchitecture.dashboard.di

import com.modulearchitecture.dashboard.MainActivityFactory
import com.modulearchitecture.dashboard_contract.DashboardIntentFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DashboardIntentFactoryModule {

    @Provides
    @Singleton
    fun provideDashboardIntent(): DashboardIntentFactory {
        return MainActivityFactory()
    }
}
