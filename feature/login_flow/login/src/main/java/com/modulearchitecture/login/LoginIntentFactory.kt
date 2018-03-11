package com.modulearchitecture.login

import android.content.Context
import android.content.Intent
import com.modulearchitecture.login_flow.contract.LoginFlowIntentFactory

class LoginIntentFactory : LoginFlowIntentFactory {
    override fun createIntent(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }
}