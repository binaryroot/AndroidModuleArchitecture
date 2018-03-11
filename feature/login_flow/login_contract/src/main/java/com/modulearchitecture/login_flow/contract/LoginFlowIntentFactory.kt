package com.modulearchitecture.login_flow.contract

import android.content.Context
import android.content.Intent

interface LoginFlowIntentFactory {

    fun createIntent(context: Context) : Intent

}