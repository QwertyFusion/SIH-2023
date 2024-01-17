package com.sapplication.app.modules.guideselfnotespage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectanglenine2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicineList: String? = MyApp.getInstance().resources.getString(R.string.lbl_medicine_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealthGuides: String? = MyApp.getInstance().resources.getString(R.string.lbl_health_guides)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMindsetGuides: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mindset_guides)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckUpHistor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_up_histor)

)
