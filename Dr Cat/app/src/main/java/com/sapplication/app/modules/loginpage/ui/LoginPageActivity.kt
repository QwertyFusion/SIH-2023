package com.sapplication.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityLoginPageBinding
import com.sapplication.app.modules.accountpage.ui.AccountPageActivity
import com.sapplication.app.modules.loginpage.`data`.viewmodel.LoginPageVM
import com.sapplication.app.modules.registerpage.ui.RegisterPageActivity
import kotlin.String
import kotlin.Unit

class LoginPageActivity : BaseActivity<ActivityLoginPageBinding>(R.layout.activity_login_page) {
  private val viewModel: LoginPageVM by viewModels<LoginPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtRegister.setOnClickListener {
      val destIntent = RegisterPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLogin.setOnClickListener {
      val destIntent = AccountPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
