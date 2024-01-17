package com.sapplication.app.modules.doctorpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DoctorPageModel(
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
  var txtSearchdoctors: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_doctors)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopDoctorProf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_doctor_prof)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrDanFury: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_dan_fury)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_pediatrician)

)
