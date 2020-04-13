package com.akshay.narutoprimer.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.akshay.narutoprimer.R
import com.akshay.narutoprimer.data.Jutsu
import com.akshay.narutoprimer.databinding.ItemJutsuBinding

/**
 * Created by akshaynandwana on
 * 12, April, 2020
 **/
class JutsuAdapter(private val jutsuList: ArrayList<Jutsu>) :
    ListAdapter<Jutsu, JutsuAdapter.JutsuViewHolder>(ListDiffCallback<Jutsu>()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): JutsuViewHolder = JutsuViewHolder.create(parent)

    override fun getItemCount(): Int = jutsuList.size

    override fun onBindViewHolder(holder: JutsuViewHolder, position: Int) =
        holder.bind(jutsuList[position])

    class JutsuViewHolder constructor(private val binding: ItemJutsuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(jutsu: Jutsu) {
            binding.jutsu = jutsu
            binding.executePendingBindings()
        }

        companion object {
            fun create(parent: ViewGroup): JutsuViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_jutsu, parent, false)
                val binding = ItemJutsuBinding.bind(view)
                return JutsuViewHolder(binding)
            }
        }
    }
}