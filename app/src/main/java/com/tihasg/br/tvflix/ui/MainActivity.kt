package com.tihasg.br.tvflix.ui

import android.os.Bundle
import android.view.LayoutInflater
import com.tihasg.br.tvflix.base.BaseActivity
import com.tihasg.br.tvflix.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
