package com.sapplication.app.modules.guideselfnotespage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseActivity
import com.sapplication.app.databinding.ActivityGuideSelfNotesPageBinding
import com.sapplication.app.modules.accountpage.ui.AccountPageActivity
import com.sapplication.app.modules.doctorpagecontainer.ui.DoctorPageContainerActivity
import com.sapplication.app.modules.forumpage.ui.ForumPageActivity
import com.sapplication.app.modules.guideselfnotespage.`data`.model.ListdrlivingstoneRowModel
import com.sapplication.app.modules.guideselfnotespage.`data`.model.ListlanguageOneRowModel
import com.sapplication.app.modules.guideselfnotespage.`data`.model.Listrectanglenine2RowModel
import com.sapplication.app.modules.guideselfnotespage.`data`.viewmodel.GuideSelfNotesPageVM
import com.sapplication.app.modules.medicinehospitalpage.ui.MedicineHospitalPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GuideSelfNotesPageActivity :
    BaseActivity<ActivityGuideSelfNotesPageBinding>(R.layout.activity_guide_self_notes_page) {
  private val viewModel: GuideSelfNotesPageVM by viewModels<GuideSelfNotesPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listdrlivingstoneAdapter =
    ListdrlivingstoneAdapter(viewModel.listdrlivingstoneList.value?:mutableListOf())
    binding.recyclerListdrlivingstone.adapter = listdrlivingstoneAdapter
    listdrlivingstoneAdapter.setOnItemClickListener(
    object : ListdrlivingstoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListdrlivingstoneRowModel) {
        onClickRecyclerListdrlivingstone(view, position, item)
      }
    }
    )
    viewModel.listdrlivingstoneList.observe(this) {
      listdrlivingstoneAdapter.updateData(it)
    }
    val listlanguageOneAdapter =
    ListlanguageOneAdapter(viewModel.listlanguageOneList.value?:mutableListOf())
    binding.recyclerListlanguageOne.adapter = listlanguageOneAdapter
    listlanguageOneAdapter.setOnItemClickListener(
    object : ListlanguageOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageOneRowModel) {
        onClickRecyclerListlanguageOne(view, position, item)
      }
    }
    )
    viewModel.listlanguageOneList.observe(this) {
      listlanguageOneAdapter.updateData(it)
    }
    val listrectanglenineAdapter =
    ListrectanglenineAdapter(viewModel.listrectanglenineList.value?:mutableListOf())
    binding.recyclerListrectanglenine.adapter = listrectanglenineAdapter
    listrectanglenineAdapter.setOnItemClickListener(
    object : ListrectanglenineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglenine2RowModel) {
        onClickRecyclerListrectanglenine(view, position, item)
      }
    }
    )
    viewModel.listrectanglenineList.observe(this) {
      listrectanglenineAdapter.updateData(it)
    }
    binding.guideSelfNotesPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameHospitalButton.setOnClickListener {
      val destIntent = MedicineHospitalPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
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
  }

  fun onClickRecyclerListdrlivingstone(
    view: View,
    position: Int,
    item: ListdrlivingstoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlanguageOne(
    view: View,
    position: Int,
    item: ListlanguageOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglenine(
    view: View,
    position: Int,
    item: Listrectanglenine2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "GUIDE_SELF_NOTES_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GuideSelfNotesPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
