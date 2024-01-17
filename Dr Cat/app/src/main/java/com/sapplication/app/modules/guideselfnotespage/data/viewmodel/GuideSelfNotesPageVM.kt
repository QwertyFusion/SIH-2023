package com.sapplication.app.modules.guideselfnotespage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sapplication.app.modules.guideselfnotespage.`data`.model.GuideSelfNotesPageModel
import com.sapplication.app.modules.guideselfnotespage.`data`.model.ListdrlivingstoneRowModel
import com.sapplication.app.modules.guideselfnotespage.`data`.model.ListlanguageOneRowModel
import com.sapplication.app.modules.guideselfnotespage.`data`.model.Listrectanglenine2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GuideSelfNotesPageVM : ViewModel(), KoinComponent {
  val guideSelfNotesPageModel: MutableLiveData<GuideSelfNotesPageModel> =
      MutableLiveData(GuideSelfNotesPageModel())

  var navArguments: Bundle? = null

  val listdrlivingstoneList: MutableLiveData<MutableList<ListdrlivingstoneRowModel>> =
      MutableLiveData(mutableListOf())

  val listlanguageOneList: MutableLiveData<MutableList<ListlanguageOneRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglenineList: MutableLiveData<MutableList<Listrectanglenine2RowModel>> =
      MutableLiveData(mutableListOf())
}
