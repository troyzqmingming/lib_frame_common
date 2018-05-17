package com.cya.lib.frame.commom.view

import android.content.Context
import android.widget.Toast

/**
 * Created by zengqingming on 2017/9/7.
 */

object ToastView {

    private var toast: Toast? = null

    fun show(context: Context, msg: String, duration: Int = Toast.LENGTH_SHORT) {
        if (toast == null) {
            toast = Toast.makeText(context.applicationContext, msg, Toast.LENGTH_SHORT)
        } else {
            toast?.setText(msg)
            toast?.duration = duration
        }
        toast?.show()
    }

}
