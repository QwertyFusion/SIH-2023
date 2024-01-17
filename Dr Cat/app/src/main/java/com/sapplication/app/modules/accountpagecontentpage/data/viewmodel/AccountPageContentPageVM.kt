package com.sapplication.app.modules.accountpagecontentpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.accountpagecontentpage.`data`.model.AccountPageContentPageModel
import org.koin.core.KoinComponent

class AccountPageContentPageVM : ViewModel(), KoinComponent {
  val accountPageContentPageModel: MutableLiveData<AccountPageContentPageModel> =
      MutableLiveData(AccountPageContentPageModel())

  var navArguments: Bundle? = null
}
