package com.sapplication.app.modules.guideselfnotespage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sapplication.app.R
import com.sapplication.app.databinding.RowListlanguageOneBinding
import com.sapplication.app.modules.guideselfnotespage.`data`.model.ListlanguageOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageOneAdapter(
  var list: List<ListlanguageOneRowModel>
) : RecyclerView.Adapter<ListlanguageOneAdapter.RowListlanguageOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage_one,parent,false)
    return RowListlanguageOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageOneVH, position: Int) {
    val listlanguageOneRowModel = ListlanguageOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageOneRowModel = list[position]
    holder.binding.listlanguageOneRowModel = listlanguageOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListlanguageOneRowModel
    ) {
    }
  }

  inner class RowListlanguageOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageOneBinding = RowListlanguageOneBinding.bind(itemView)
  }
}
