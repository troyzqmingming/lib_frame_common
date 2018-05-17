package com.cya.lib.frame.commom.ui

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseAppcompatActivity<T : ViewDataBinding> : AppCompatActivity() {

    abstract fun getLayout(): Int

    open fun beforeLoadUI() {}

    abstract fun init()

    lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        beforeLoadUI()
        binding = DataBindingUtil.setContentView(this, getLayout())
        init()
    }

    open fun <A : Activity> jumpActivity(toClass: Class<A>, bundle: Bundle = Bundle()) {
        val intent = Intent(this, toClass)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}