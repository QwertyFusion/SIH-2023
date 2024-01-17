package com.sapplication.app.modules.guideselfnotespage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_diet_guide_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeaHealthy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_a_healthy)

)
