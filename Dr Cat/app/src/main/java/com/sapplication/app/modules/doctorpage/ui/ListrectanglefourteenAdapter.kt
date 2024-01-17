package com.sapplication.app.modules.doctorpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sapplication.app.R
import com.sapplication.app.databinding.RowListrectanglefourteenBinding
import com.sapplication.app.modules.doctorpage.`data`.model.ListrectanglefourteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefourteenAdapter(
  var list: List<ListrectanglefourteenRowModel>
) : RecyclerView.Adapter<ListrectanglefourteenAdapter.RowListrectanglefourteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefourteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefourteen,parent,false)
    return RowListrectanglefourteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefourteenVH, position: Int) {
    val listrectanglefourteenRowModel = ListrectanglefourteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefourteenRowModel = list[position]
    holder.binding.listrectanglefourteenRowModel = listrectanglefourteenRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglefourteenRowModel>) {
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
      item: ListrectanglefourteenRowModel
    ) {
    }
  }

  inner class RowListrectanglefourteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefourteenBinding = RowListrectanglefourteenBinding.bind(itemView)
  }
}
