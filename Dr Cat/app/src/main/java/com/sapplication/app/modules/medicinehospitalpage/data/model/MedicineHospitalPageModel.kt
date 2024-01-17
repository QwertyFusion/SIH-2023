package com.sapplication.app.modules.medicinehospitalpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MedicineHospitalPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBhubaneswarCounter: String? =
      MyApp.getInstance().resources.getString(R.string.msg_751024_bhubane)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchstores: String? = MyApp.getInstance().resources.getString(R.string.msg_search_stores)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_distance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)

)
