package com.sapplication.app.modules.scanpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ScanPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_adam_steve_ema)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScantogiveyo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_scan_to_give_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSharebuttonValue: String? = null
)
