package com.sapplication.app.modules.doctorpagecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityDoctorPageContainerBinding
import com.sapplication.app.extensions.loadFragment
import com.sapplication.app.modules.accountpage.ui.AccountPageActivity
import com.sapplication.app.modules.doctorpage.ui.DoctorPageFragment
import com.sapplication.app.modules.doctorpagecontainer.`data`.viewmodel.DoctorPageContainerVM
import com.sapplication.app.modules.forumpage.ui.ForumPageActivity
import com.sapplication.app.modules.guideselfnotespage.ui.GuideSelfNotesPageActivity
import com.sapplication.app.modules.medicinehospitalpage.ui.MedicineHospitalPageActivity
import kotlin.String
import kotlin.Unit

class DoctorPageContainerActivity :
    BaseActivity<ActivityDoctorPageContainerBinding>(R.layout.activity_doctor_page_container) {
  private val viewModel: DoctorPageContainerVM by viewModels<DoctorPageContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.doctorPageContainerVM = viewModel
    val destFragment = DoctorPageFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = DoctorPageFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.imageLock.setOnClickListener {
      val destIntent = AccountPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageLock.setOnClickListener {
      val destFragment = DoctorPageFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = DoctorPageFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.frameFAQButton.setOnClickListener {
      val destIntent = GuideSelfNotesPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameWebButton.setOnClickListener {
      val destIntent = ForumPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameHospitalButton.setOnClickListener {
      val destIntent = MedicineHospitalPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DOCTOR_PAGE_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DoctorPageContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
