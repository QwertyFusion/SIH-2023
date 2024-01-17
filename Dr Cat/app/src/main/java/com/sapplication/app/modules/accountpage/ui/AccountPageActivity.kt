package com.sapplication.app.modules.accountpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityAccountPageBinding
import com.sapplication.app.modules.accountpage.`data`.viewmodel.AccountPageVM
import com.sapplication.app.modules.doctorpagecontainer.ui.DoctorPageContainerActivity
import com.sapplication.app.modules.forumpage.ui.ForumPageActivity
import com.sapplication.app.modules.guideselfnotespage.ui.GuideSelfNotesPageActivity
import com.sapplication.app.modules.medicinehospitalpage.ui.MedicineHospitalPageActivity
import kotlin.String
import kotlin.Unit

class AccountPageActivity : BaseActivity<ActivityAccountPageBinding>(R.layout.activity_account_page)
    {
  private val viewModel: AccountPageVM by viewModels<AccountPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.accountPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameFAQButton.setOnClickListener {
      val destIntent = GuideSelfNotesPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameHospitalButton.setOnClickListener {
      val destIntent = MedicineHospitalPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameDoctorButton.setOnClickListener {
      val destIntent = DoctorPageContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameWebButton.setOnClickListener {
      val destIntent = ForumPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
