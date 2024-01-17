package com.sapplication.app.modules.startingpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourPersonalH: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_personal_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
