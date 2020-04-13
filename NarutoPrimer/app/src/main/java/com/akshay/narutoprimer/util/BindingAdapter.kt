package com.akshay.narutoprimer.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Created by akshaynandwana on
 * 13, April, 2020
 **/

@BindingAdapter("app:image")
fun setImageUsingGlide(imageView: ImageView, imageDrawable: Int) {
    Glide.with(imageView.context).load(imageDrawable).into(imageView)
}