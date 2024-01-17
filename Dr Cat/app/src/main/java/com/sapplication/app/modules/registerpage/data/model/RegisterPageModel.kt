package com.sapplication.app.modules.registerpage.`data`.model

import com.sapplication.app.R
import com.sapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeOnboard: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_onboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTellusabouty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_about_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldFourValue: String? = null
)
