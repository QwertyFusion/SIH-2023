package com.sapplication.app.modules.doctorpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.doctorpage.`data`.model.DoctorPageModel
import com.sapplication.app.modules.doctorpage.`data`.model.ListrectanglefourteenRowModel
import com.sapplication.app.modules.doctorpage.`data`.model.ListrectanglenineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DoctorPageVM : ViewModel(), KoinComponent {
  val doctorPageModel: MutableLiveData<DoctorPageModel> = MutableLiveData(DoctorPageModel())

  var navArguments: Bundle? = null

  val listrectanglenineList: MutableLiveData<MutableList<ListrectanglenineRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglefourteenList: MutableLiveData<MutableList<ListrectanglefourteenRowModel>> =
      MutableLiveData(mutableListOf())
}
