package com.sapplication.app.modules.startingpage.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityStartingPageBinding
import com.sapplication.app.modules.registerpage.ui.RegisterPageActivity
import com.sapplication.app.modules.startingpage.`data`.viewmodel.StartingPageVM
import kotlin.String
import kotlin.Unit

class StartingPageActivity :
    BaseActivity<ActivityStartingPageBinding>(R.layout.activity_starting_page) {
  private val viewModel: StartingPageVM by viewModels<StartingPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startingPageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = RegisterPageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnGetStarted.setOnClickListener {
        val destIntent = RegisterPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "STARTING_PAGE_ACTIVITY"

    }
  }
