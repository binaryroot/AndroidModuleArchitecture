package com.com.modulearchitecture.di

import com.com.modulearchitecture.App
import com.modulearchitecture.dashboard.di.DashboardFeatureModule
import com.modulearchitecture.database.di.DatabaseModule
import com.modulearchitecture.login.di.LoginFeatureModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
        AndroidInjectionModule::class,
        AndroidSupportInjectionModule::class,
        AppConfigurationModule::class,
        LoginFeatureModule::class,
        DashboardFeatureModule::class,
        IntentFactoryModule::class,
        DatabaseModule::class
        ]
)
interface AppComponent {
    fun inject(app: App)
}
