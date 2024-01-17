package com.sapplication.app.modules.accountpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.accountpage.`data`.model.AccountPageModel
import org.koin.core.KoinComponent

class AccountPageVM : ViewModel(), KoinComponent {
  val accountPageModel: MutableLiveData<AccountPageModel> = MutableLiveData(AccountPageModel())

  var navArguments: Bundle? = null
}
