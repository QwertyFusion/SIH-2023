package com.sapplication.app.modules.medicinehospitalpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.medicinehospitalpage.`data`.model.Listrectanglenine1RowModel
import com.sapplication.app.modules.medicinehospitalpage.`data`.model.MedicineHospitalPageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MedicineHospitalPageVM : ViewModel(), KoinComponent {
  val medicineHospitalPageModel: MutableLiveData<MedicineHospitalPageModel> =
      MutableLiveData(MedicineHospitalPageModel())

  var navArguments: Bundle? = null

  val listrectanglenineList: MutableLiveData<MutableList<Listrectanglenine1RowModel>> =
      MutableLiveData(mutableListOf())
}
