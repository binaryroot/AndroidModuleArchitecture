package com.modulearchitecture.dashboard

import android.content.Context
import android.content.Intent
import com.modulearchitecture.dashboard_contract.DashboardIntentFactory
import javax.inject.Inject

class MainActivityFactory @Inject constructor(): DashboardIntentFactory {

    override fun createIntent(context: Context): Intent {
        return Intent(context, MainActivity::class.java)
    }
}