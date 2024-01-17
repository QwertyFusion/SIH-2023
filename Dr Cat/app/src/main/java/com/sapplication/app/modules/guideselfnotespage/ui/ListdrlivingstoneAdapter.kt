package com.sapplication.app.modules.guideselfnotespage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sapplication.app.R
import com.sapplication.app.databinding.RowListdrlivingstoneBinding
import com.sapplication.app.modules.guideselfnotespage.`data`.model.ListdrlivingstoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListdrlivingstoneAdapter(
  var list: List<ListdrlivingstoneRowModel>
) : RecyclerView.Adapter<ListdrlivingstoneAdapter.RowListdrlivingstoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListdrlivingstoneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listdrlivingstone,parent,false)
    return RowListdrlivingstoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListdrlivingstoneVH, position: Int) {
    val listdrlivingstoneRowModel = ListdrlivingstoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listdrlivingstoneRowModel = list[position]
    holder.binding.listdrlivingstoneRowModel = listdrlivingstoneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListdrlivingstoneRowModel>) {
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
      item: ListdrlivingstoneRowModel
    ) {
    }
  }

  inner class RowListdrlivingstoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListdrlivingstoneBinding = RowListdrlivingstoneBinding.bind(itemView)
  }
}
