package com.sapplication.app.modules.scanpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.scanpage.`data`.model.ScanPageModel
import org.koin.core.KoinComponent

class ScanPageVM : ViewModel(), KoinComponent {
  val scanPageModel: MutableLiveData<ScanPageModel> = MutableLiveData(ScanPageModel())

  var navArguments: Bundle? = null
}
