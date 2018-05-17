package com.cya.lib.frame.commom.utils

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

object DisplayUtil {
    /**
     * 关闭软键盘
     */
    fun closeSoftKeyboard(activity: Activity) {
        val manager: InputMethodManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        manager.hideSoftInputFromWindow(activity.window.decorView.windowToken,
                0)
    }

    fun openSoftKeyboard(activity: Activity){
        val manager: InputMethodManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        manager.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS)
    }
}
