package com.akshay.narutoprimer.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.MergeAdapter
import com.akshay.narutoprimer.R
import com.akshay.narutoprimer.data.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var jutsuAdapter: JutsuAdapter
    private lateinit var characterAdapter: CharacterAdapter
    private lateinit var mergeAdapter: MergeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        jutsuAdapter = JutsuAdapter(DataSource.getJutsu())
        characterAdapter = CharacterAdapter(DataSource.getCharacter())
        mergeAdapter = MergeAdapter(characterAdapter, jutsuAdapter)
        rvNaruto.adapter = mergeAdapter
    }
}
