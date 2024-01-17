package com.sapplication.app.modules.scanpage.ui

import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityScanPageBinding
import com.sapplication.app.modules.doctorpagecontainer.ui.DoctorPageContainerActivity
import com.sapplication.app.modules.forumpage.ui.ForumPageActivity
import com.sapplication.app.modules.guideselfnotespage.ui.GuideSelfNotesPageActivity
import com.sapplication.app.modules.medicinehospitalpage.ui.MedicineHospitalPageActivity
import com.sapplication.app.modules.scanpage.`data`.viewmodel.ScanPageVM
import kotlin.String
import kotlin.Unit

class ScanPageActivity : BaseActivity<ActivityScanPageBinding>(R.layout.activity_scan_page) {
  private val viewModel: ScanPageVM by viewModels<ScanPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scanPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
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
    const val TAG: String = "SCAN_PAGE_ACTIVITY"

  }
}
