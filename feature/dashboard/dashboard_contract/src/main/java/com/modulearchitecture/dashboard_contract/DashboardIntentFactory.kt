package com.modulearchitecture.dashboard_contract

import android.content.Context
import android.content.Intent


interface DashboardIntentFactory {

    fun createIntent(context: Context): Intent

}