package com.modulearchitecture.login

import android.os.Bundle
import android.widget.Toast
import com.modulearchitecture.activities.BaseActivity
import com.modulearchitecture.dashboard_contract.DashboardIntentFactory
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject


class LoginActivity : BaseActivity(), LoginActivityContract.View {

    @Inject
    lateinit var dashboard: DashboardIntentFactory

    @Inject
    lateinit var presenter: LoginActivityContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        presenter.bind(this)
        email_sign_in_button.setOnClickListener {
            presenter.login(email.text.toString(), password.text.toString())
        }
    }

    override fun openDashboardActivity() {
        startActivity(dashboard.createIntent(this))
        finish()
    }

    override fun showLoginError() {
        Toast.makeText(this, "Username or password can not be empty", Toast.LENGTH_LONG).show()
    }
}
