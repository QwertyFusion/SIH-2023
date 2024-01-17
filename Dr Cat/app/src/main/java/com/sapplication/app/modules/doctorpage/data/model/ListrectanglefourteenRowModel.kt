package com.sapplication.app.modules.doctorpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglefourteenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrAliceThomp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dr_alice_thomp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_cardiologist)

)
