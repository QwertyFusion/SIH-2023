package com.sapplication.app.modules.guideselfnotespage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sapplication.app.R
import com.sapplication.app.databinding.RowListrectanglenine2Binding
import com.sapplication.app.modules.guideselfnotespage.`data`.model.Listrectanglenine2RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglenineAdapter(
  var list: List<Listrectanglenine2RowModel>
) : RecyclerView.Adapter<ListrectanglenineAdapter.RowListrectanglenine2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglenine2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglenine2,parent,false)
    return RowListrectanglenine2VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglenine2VH, position: Int) {
    val listrectanglenine2RowModel = Listrectanglenine2RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglenine2RowModel = list[position]
    holder.binding.listrectanglenine2RowModel = listrectanglenine2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglenine2RowModel>) {
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
      item: Listrectanglenine2RowModel
    ) {
    }
  }

  inner class RowListrectanglenine2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglenine2Binding = RowListrectanglenine2Binding.bind(itemView)
  }
}
