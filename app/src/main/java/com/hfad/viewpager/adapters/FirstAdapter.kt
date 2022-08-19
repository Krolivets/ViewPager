package com.hfad.viewpager.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.viewpager.R
import com.hfad.viewpager.model.ItemViewModel

class FirstAdapter() :
    RecyclerView.Adapter<FirstAdapter.ItemViewHolder>() {

    private var itemList = emptyList<ItemViewModel>()

    class ItemViewHolder(view: View) :
        RecyclerView.ViewHolder(view)

    override fun getItemCount() = itemList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.fragment_first, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemView.tvLastName.text = itemList[position].lastName
        holder.itemView.tvFirstName.text = itemList[position].firstName
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<ItemViewModel>) {
        itemList = list
        notifyDataSetChanged()
    }
}
