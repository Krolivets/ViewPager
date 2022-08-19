package com.hfad.viewpager.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.hfad.viewpager.R
import com.hfad.viewpager.adapters.FirstAdapter
import com.hfad.viewpager.databinding.FragmentFirstBinding
import com.hfad.viewpager.model.ItemViewModel

class FirstFragment : Fragment(R.layout.fragment_first) {

    private val binding by viewBinding(FragmentFirstBinding::bind)
    lateinit var adapter: FirstAdapter
    lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvFirstItems.layoutManager = LinearLayoutManager(context)
        binding.rvFirstItems.addItemDecoration(DividerItemDecoration(context, 1))

        initial()
    }

    private fun initial() {
        recyclerView = binding.rvFirstItems
        adapter = FirstAdapter()
        recyclerView.adapter = adapter
        adapter.setList(myItem())
    }
    private fun myItem(): ArrayList<ItemViewModel> {
        val itemList = ArrayList<ItemViewModel>()

        val item1 = ItemViewModel("King", "Rabbit")
        itemList.add(item1)
        val item2 = ItemViewModel("King", "Rabbit")
        itemList.add(item2)
        val item3 = ItemViewModel("King", "Rabbit")
        itemList.add(item3)
        val item4 = ItemViewModel("King", "Rabbit")
        itemList.add(item4)
        val item5 = ItemViewModel("King", "Rabbit")
        itemList.add(item5)
        val item6 = ItemViewModel("King", "Rabbit")
        itemList.add(item6)

        return itemList
    }
}
