package com.sapplication.app.modules.doctorpage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.sapplication.app.R
import com.sapplication.app.appcomponents.base.BaseFragment
import com.sapplication.app.databinding.FragmentDoctorPageBinding
import com.sapplication.app.modules.doctorpage.`data`.model.ListrectanglefourteenRowModel
import com.sapplication.app.modules.doctorpage.`data`.model.ListrectanglenineRowModel
import com.sapplication.app.modules.doctorpage.`data`.viewmodel.DoctorPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DoctorPageFragment : BaseFragment<FragmentDoctorPageBinding>(R.layout.fragment_doctor_page) {
  private val viewModel: DoctorPageVM by viewModels<DoctorPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectanglenineAdapter =
    ListrectanglenineAdapter(viewModel.listrectanglenineList.value?:mutableListOf())
    binding.recyclerListrectanglenine.adapter = listrectanglenineAdapter
    listrectanglenineAdapter.setOnItemClickListener(
    object : ListrectanglenineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglenineRowModel) {
        onClickRecyclerListrectanglenine(view, position, item)
      }
    }
    )
    viewModel.listrectanglenineList.observe(requireActivity()) {
      listrectanglenineAdapter.updateData(it)
    }
    val listrectanglefourteenAdapter =
    ListrectanglefourteenAdapter(viewModel.listrectanglefourteenList.value?:mutableListOf())
    binding.recyclerListrectanglefourteen.adapter = listrectanglefourteenAdapter
    listrectanglefourteenAdapter.setOnItemClickListener(
    object : ListrectanglefourteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefourteenRowModel) {
        onClickRecyclerListrectanglefourteen(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourteenList.observe(requireActivity()) {
      listrectanglefourteenAdapter.updateData(it)
    }
    binding.doctorPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglenine(
    view: View,
    position: Int,
    item: ListrectanglenineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefourteen(
    view: View,
    position: Int,
    item: ListrectanglefourteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DOCTOR_PAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): DoctorPageFragment {
      val fragment = DoctorPageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
