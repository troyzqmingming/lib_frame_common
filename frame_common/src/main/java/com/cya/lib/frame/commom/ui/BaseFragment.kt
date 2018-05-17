package com.cya.lib.frame.commom.ui

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<T :ViewDataBinding> :Fragment(){

    abstract fun getLayout():Int

    open fun beforeLoadUI() {}

    abstract fun init()

    lateinit var binding: T

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        beforeLoadUI()
        binding = DataBindingUtil.inflate(layoutInflater,getLayout(),container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }
}