package com.sapplication.app.modules.accountpagecontentpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AccountPageContentPageModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonFive: String? = MyApp.getInstance().resources.getString(R.string.msg_manage_your_bad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonSix: String? = MyApp.getInstance().resources.getString(R.string.msg_review_your_doc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonSeven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_photo_id_proofs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataandPrivac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_and_privac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.msg_delete_your_inf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonEight: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_your_infor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonNine: String? = MyApp.getInstance().resources.getString(R.string.msg_close_your_dr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy_notice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogInOptions: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_log_in_options)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_switch_user)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonTwelve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_out_of_exis)

)
