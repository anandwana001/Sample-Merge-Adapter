package com.akshay.narutoprimer.data

import com.akshay.narutoprimer.R

/**
 * Created by akshaynandwana on
 * 12, April, 2020
 **/
object DataSource {

    fun getJutsu(): ArrayList<Jutsu> {
        return ArrayList<Jutsu>().apply {
            add(Jutsu("Shadow Clone", "Naruto Uzomaki", R.drawable.naruto))
            add(Jutsu("Rasengan", "Naruto Uzomaki", R.drawable.naruto))
        }
    }

    fun getCharacter(): ArrayList<Characters> {
        return ArrayList<Characters>().apply {
            add(Characters("Kakashi Hatake", R.drawable.naruto))
            add(Characters("Naruto Uzumaki", R.drawable.naruto))
        }
    }
}