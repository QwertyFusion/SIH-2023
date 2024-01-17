package com.sapplication.app.modules.guideselfnotespage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListdrlivingstoneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDrLivingstone: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dr_livingstone)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTherapistBoo: String? = MyApp.getInstance().resources.getString(R.string.msg_therapist_boo)

)
