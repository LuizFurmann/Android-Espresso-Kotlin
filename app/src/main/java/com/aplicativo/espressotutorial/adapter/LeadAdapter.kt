package com.aplicativo.espressotutorial.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aplicativo.espressotutorial.databinding.CardItemBinding
import com.aplicativo.espressotutorial.model.Lead

class LeadAdapter : ListAdapter<Lead, LeadAdapter.LeadViewHolder>(LeadCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):LeadViewHolder {
        val view  = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LeadViewHolder(view)
    }

    override fun onBindViewHolder(holder:LeadViewHolder, position: Int) {
        val lead = getItem(position) //getItem método da interface listAdapter

        holder.name.text = lead.name
        holder.address.text = lead.address

    }

    class LeadViewHolder(binding: CardItemBinding): RecyclerView.ViewHolder(binding.root) {
        val name = binding.name
        val address = binding.address
    }

    //DiffUtil
    class LeadCallback : DiffUtil.ItemCallback<Lead>(){
        override fun areItemsTheSame(oldItem: Lead, newItem: Lead): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Lead, newItem: Lead): Boolean {
            return oldItem.name == newItem.name && oldItem.email == newItem.email &&
                    oldItem.phone == newItem.phone && oldItem.address == newItem.address
        }
    }
}