package com.sapplication.app.modules.forumpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityForumPageBinding
import com.sapplication.app.modules.accountpage.ui.AccountPageActivity
import com.sapplication.app.modules.doctorpagecontainer.ui.DoctorPageContainerActivity
import com.sapplication.app.modules.forumpage.`data`.viewmodel.ForumPageVM
import com.sapplication.app.modules.guideselfnotespage.ui.GuideSelfNotesPageActivity
import com.sapplication.app.modules.medicinehospitalpage.ui.MedicineHospitalPageActivity
import kotlin.String
import kotlin.Unit

class ForumPageActivity : BaseActivity<ActivityForumPageBinding>(R.layout.activity_forum_page) {
  private val viewModel: ForumPageVM by viewModels<ForumPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forumPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameHospitalButton.setOnClickListener {
      val destIntent = MedicineHospitalPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameDoctorButton.setOnClickListener {
      val destIntent = DoctorPageContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLock.setOnClickListener {
      val destIntent = AccountPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameFAQButton.setOnClickListener {
      val destIntent = GuideSelfNotesPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORUM_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForumPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
