package com.akshay.narutoprimer.ui

import androidx.recyclerview.widget.DiffUtil

/**
 * Created by akshaynandwana on
 * 13, April, 2020
 **/
class ListDiffCallback<T> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }

}