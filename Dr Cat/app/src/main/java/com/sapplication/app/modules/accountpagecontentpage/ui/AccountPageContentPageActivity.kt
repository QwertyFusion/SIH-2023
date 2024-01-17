package com.sapplication.app.modules.accountpagecontentpage.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAccountPageContentPageBinding
import com.sapplication.app.modules.accountpagecontentpage.`data`.viewmodel.AccountPageContentPageVM
import kotlin.String
import kotlin.Unit

class AccountPageContentPageActivity :
    BaseActivity<ActivityAccountPageContentPageBinding>(R.layout.activity_account_page_content_page)
    {
  private val viewModel: AccountPageContentPageVM by viewModels<AccountPageContentPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountPageContentPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_PAGE_CONTENT_PAGE_ACTIVITY"

  }
}
