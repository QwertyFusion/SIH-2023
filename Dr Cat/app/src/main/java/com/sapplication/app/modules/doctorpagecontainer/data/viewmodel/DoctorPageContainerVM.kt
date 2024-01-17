package com.sapplication.app.modules.doctorpagecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.doctorpagecontainer.`data`.model.DoctorPageContainerModel
import org.koin.core.KoinComponent

class DoctorPageContainerVM : ViewModel(), KoinComponent {
  val doctorPageContainerModel: MutableLiveData<DoctorPageContainerModel> =
      MutableLiveData(DoctorPageContainerModel())

  var navArguments: Bundle? = null
}
