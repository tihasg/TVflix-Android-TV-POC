package com.tihasg.br.tvflix.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<ViewBindingType : ViewBinding> : AppCompatActivity() {

    lateinit var binding: ViewBindingType
    abstract val bindingInflater: (LayoutInflater) -> ViewBindingType
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bindingInflater.invoke(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

}