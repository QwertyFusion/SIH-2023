package com.sapplication.app.modules.forumpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForumPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHellotheredo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_there_do2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNine: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
