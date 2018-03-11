package com.com.modulearchitecture

import android.app.Activity
import android.app.Application
import com.com.modulearchitecture.di.AppConfigurationModule
import com.com.modulearchitecture.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class App : Application(), HasActivityInjector {
    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()


        DaggerAppComponent
                .builder().appConfigurationModule(AppConfigurationModule(this))
                .build()
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector
}
