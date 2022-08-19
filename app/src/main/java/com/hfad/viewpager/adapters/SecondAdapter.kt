package com.hfad.viewpager.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.viewpager.databinding.RecyclerviewItemBinding
import com.hfad.viewpager.model.ItemViewModel

class SecondAdapter :
    RecyclerView.Adapter<SecondAdapter.ItemViewHolder>() {

    private var itemList = emptyList<ItemViewModel>()

    class ItemViewHolder(private val binding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ItemViewModel) {
            with(binding) {
                tvLastName.text = item.lastName
                tvFirstName.text = item.firstName
            }
        }
    }

    override fun getItemCount() = itemList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            RecyclerviewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<ItemViewModel>) {
        itemList = list
        notifyDataSetChanged()
    }
}
