package com.sapplication.app.modules.medicinehospitalpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sapplication.app.R
import com.sapplication.app.databinding.RowListrectanglenine1Binding
import com.sapplication.app.modules.medicinehospitalpage.`data`.model.Listrectanglenine1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglenineAdapter(
  var list: List<Listrectanglenine1RowModel>
) : RecyclerView.Adapter<ListrectanglenineAdapter.RowListrectanglenine1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglenine1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglenine1,parent,false)
    return RowListrectanglenine1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglenine1VH, position: Int) {
    val listrectanglenine1RowModel = Listrectanglenine1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglenine1RowModel = list[position]
    holder.binding.listrectanglenine1RowModel = listrectanglenine1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglenine1RowModel>) {
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
      item: Listrectanglenine1RowModel
    ) {
    }
  }

  inner class RowListrectanglenine1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglenine1Binding = RowListrectanglenine1Binding.bind(itemView)
  }
}
