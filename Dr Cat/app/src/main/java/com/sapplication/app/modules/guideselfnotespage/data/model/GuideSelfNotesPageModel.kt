package com.sapplication.app.modules.guideselfnotespage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class GuideSelfNotesPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAlerts: String? = MyApp.getInstance().resources.getString(R.string.lbl_alerts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)

)
