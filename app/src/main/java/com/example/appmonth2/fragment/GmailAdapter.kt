package com.linh.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appmonth2.Gmail
import com.example.appmonth2.databinding.ItemGmailBinding

class NamesAdapter(val gmail: Gmail) : RecyclerView.Adapter<NamesAdapter.NameViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemGmailBinding.inflate(layoutInflater, parent, false)
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 1
    }

    class NameViewHolder(val binding: ItemGmailBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}