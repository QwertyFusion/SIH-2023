package com.sapplication.app.modules.startingpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.startingpage.`data`.model.StartingPageModel
import org.koin.core.KoinComponent

class StartingPageVM : ViewModel(), KoinComponent {
  val startingPageModel: MutableLiveData<StartingPageModel> = MutableLiveData(StartingPageModel())

  var navArguments: Bundle? = null
}
