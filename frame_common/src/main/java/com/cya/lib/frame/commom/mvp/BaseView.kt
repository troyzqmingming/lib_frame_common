package com.cya.lib.frame.commom.mvp

import com.cya.lib.frame.commom.retrofit.exception.RetrofitThrowableInfo

interface BaseView<R> {

    fun onGotSuccess(r: R)

    fun onThrowable(exception: RetrofitThrowableInfo)
}