package com.sapplication.app.modules.accountpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloAdamSte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_adam_ste)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmergency: String? = MyApp.getInstance().resources.getString(R.string.lbl_emergency)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmbulanceButto: String? = MyApp.getInstance().resources.getString(R.string.lbl_ambulance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHospitalButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_hospital)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedicineStore: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_medicine_store)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccountSetting: String? =
      MyApp.getInstance().resources.getString(R.string.msg_account_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataButton: String? = MyApp.getInstance().resources.getString(R.string.msg_login_and_secur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFamilyButton: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_family_connect)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_manage_devices)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonFour: String? = MyApp.getInstance().resources.getString(R.string.msg_manage_your_pro)

)
