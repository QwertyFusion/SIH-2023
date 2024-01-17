package com.sapplication.app.modules.medicinehospitalpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityMedicineHospitalPageBinding
import com.sapplication.app.modules.accountpage.ui.AccountPageActivity
import com.sapplication.app.modules.doctorpagecontainer.ui.DoctorPageContainerActivity
import com.sapplication.app.modules.forumpage.ui.ForumPageActivity
import com.sapplication.app.modules.guideselfnotespage.ui.GuideSelfNotesPageActivity
import com.sapplication.app.modules.medicinehospitalpage.`data`.model.Listrectanglenine1RowModel
import com.sapplication.app.modules.medicinehospitalpage.`data`.viewmodel.MedicineHospitalPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MedicineHospitalPageActivity :
    BaseActivity<ActivityMedicineHospitalPageBinding>(R.layout.activity_medicine_hospital_page) {
  private val viewModel: MedicineHospitalPageVM by viewModels<MedicineHospitalPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglenineAdapter =
    ListrectanglenineAdapter(viewModel.listrectanglenineList.value?:mutableListOf())
    binding.recyclerListrectanglenine.adapter = listrectanglenineAdapter
    listrectanglenineAdapter.setOnItemClickListener(
    object : ListrectanglenineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglenine1RowModel) {
        onClickRecyclerListrectanglenine(view, position, item)
      }
    }
    )
    viewModel.listrectanglenineList.observe(this) {
      listrectanglenineAdapter.updateData(it)
    }
    binding.medicineHospitalPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameWebButton.setOnClickListener {
      val destIntent = ForumPageActivity.getIntent(this, null)
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

  fun onClickRecyclerListrectanglenine(
    view: View,
    position: Int,
    item: Listrectanglenine1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MEDICINE_HOSPITAL_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MedicineHospitalPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
