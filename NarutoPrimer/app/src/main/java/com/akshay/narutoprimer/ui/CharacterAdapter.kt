package com.akshay.narutoprimer.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.akshay.narutoprimer.R
import com.akshay.narutoprimer.data.Characters
import com.akshay.narutoprimer.databinding.ItemCharacterBinding


/**
 * Created by akshaynandwana on
 * 12, April, 2020
 **/
class CharacterAdapter(private val characterList: ArrayList<Characters>) :
    ListAdapter<Characters, CharacterAdapter.CharacterViewHolder>(ListDiffCallback<Characters>()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharacterViewHolder = CharacterViewHolder.create(parent)

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) =
        holder.bind(characterList[position])

    class CharacterViewHolder constructor(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(character: Characters) {
            binding.character = character
            binding.executePendingBindings()
        }

        companion object {
            fun create(parent: ViewGroup): CharacterViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_character, parent, false)
                val binding = ItemCharacterBinding.bind(view)
                return CharacterViewHolder(binding)
            }
        }
    }
}