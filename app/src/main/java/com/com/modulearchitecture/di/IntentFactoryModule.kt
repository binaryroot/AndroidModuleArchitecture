package com.com.modulearchitecture.di

import com.modulearchitecture.dashboard.di.DashboardIntentFactoryModule
import com.modulearchitecture.login.di.LoginIntentFactoryModule
import dagger.Module

@Module(includes = [
DashboardIntentFactoryModule::class,
LoginIntentFactoryModule::class])
object IntentFactoryModule