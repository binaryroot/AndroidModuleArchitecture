package com.modulearchitecture.login.di

import com.modulearchitecture.login.LoginIntentFactory
import com.modulearchitecture.login_flow.contract.LoginFlowIntentFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LoginIntentFactoryModule {
    @Provides
    @Singleton
    fun provideIntentFactory(): LoginFlowIntentFactory {
        return LoginIntentFactory()
    }
}