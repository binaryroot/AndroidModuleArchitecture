package com.modulearchitecture.dashboard

import android.os.Bundle
import com.inoxoft.dashboard.R

import com.modulearchitecture.activities.BaseActivity
import com.modulearchitecture.login_flow.contract.LoginFlowIntentFactory
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainActivityContract.View {

    @Inject
    lateinit var loginFlowIntentFactory: LoginFlowIntentFactory

    @Inject
    lateinit var presenter: MainActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.bind(this)
        logout.setOnClickListener {
            startActivity(loginFlowIntentFactory.createIntent(this))
            finish()
        }
    }

    override fun showLoggedUser(userName: String) {
        user_name.text = userName
    }
}