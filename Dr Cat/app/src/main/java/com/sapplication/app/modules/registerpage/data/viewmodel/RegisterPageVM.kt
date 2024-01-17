package com.sapplication.app.modules.registerpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.registerpage.`data`.model.RegisterPageModel
import org.koin.core.KoinComponent

class RegisterPageVM : ViewModel(), KoinComponent {
  val registerPageModel: MutableLiveData<RegisterPageModel> = MutableLiveData(RegisterPageModel())

  var navArguments: Bundle? = null
}
