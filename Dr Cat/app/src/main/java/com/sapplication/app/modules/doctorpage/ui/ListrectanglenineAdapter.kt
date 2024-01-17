package com.sapplication.app.modules.doctorpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sapplication.app.R
import com.sapplication.app.databinding.RowListrectanglenineBinding
import com.sapplication.app.modules.doctorpage.`data`.model.ListrectanglenineRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglenineAdapter(
  var list: List<ListrectanglenineRowModel>
) : RecyclerView.Adapter<ListrectanglenineAdapter.RowListrectanglenineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglenineVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglenine,parent,false)
    return RowListrectanglenineVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglenineVH, position: Int) {
    val listrectanglenineRowModel = ListrectanglenineRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglenineRowModel = list[position]
    holder.binding.listrectanglenineRowModel = listrectanglenineRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglenineRowModel>) {
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
      item: ListrectanglenineRowModel
    ) {
    }
  }

  inner class RowListrectanglenineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglenineBinding = RowListrectanglenineBinding.bind(itemView)
  }
}
