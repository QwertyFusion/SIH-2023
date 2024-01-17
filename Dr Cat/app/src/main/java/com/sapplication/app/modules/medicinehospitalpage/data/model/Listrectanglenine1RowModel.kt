package com.sapplication.app.modules.medicinehospitalpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectanglenine1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicineStores: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_medicine_stores)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTestLabs: String? = MyApp.getInstance().resources.getString(R.string.lbl_test_labs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMindsetCoaches: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mindset_coaches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHospitals: String? = MyApp.getInstance().resources.getString(R.string.lbl_hospitals)

)
