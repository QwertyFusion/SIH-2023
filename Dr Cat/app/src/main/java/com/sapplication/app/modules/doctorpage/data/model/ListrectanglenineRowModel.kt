package com.sapplication.app.modules.doctorpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglenineRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFullbodycheck: String? =
      MyApp.getInstance().resources.getString(R.string.msg_full_body_check)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmergency: String? = MyApp.getInstance().resources.getString(R.string.lbl_emergency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomensHealth: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_women_s_health)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMensHealth: String? = MyApp.getInstance().resources.getString(R.string.lbl_men_s_health)

)
