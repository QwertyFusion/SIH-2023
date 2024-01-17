package com.sapplication.app.modules.forumpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.forumpage.`data`.model.ForumPageModel
import org.koin.core.KoinComponent

class ForumPageVM : ViewModel(), KoinComponent {
  val forumPageModel: MutableLiveData<ForumPageModel> = MutableLiveData(ForumPageModel())

  var navArguments: Bundle? = null
}
