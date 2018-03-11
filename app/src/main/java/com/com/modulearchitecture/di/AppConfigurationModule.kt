package com.com.modulearchitecture.di


import android.content.Context
import com.com.modulearchitecture.preferences.SPWrapper
import com.modulearchitecture.configuration.AppConfiguration
import com.modulearchitecture.configuration.Configurator
import com.modulearchitecture.preferences.Preferences

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppConfigurationModule constructor(private var context: Context) {

    @Provides
    @Singleton
    fun provideAppConfiguration(): AppConfiguration {
        return Configurator()
    }

    @Provides
    @Singleton
    fun provideSharePreferences(): Preferences {
        return SPWrapper(context)
    }
}