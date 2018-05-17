package com.cya.lib.frame.commom.retrofit.api

import com.google.gson.Gson
import okhttp3.ResponseBody


abstract class RetrofitSimpleCallBack<R, I>(private val returnClass: Class<R>) : RetrofitBaseRequestCallBack<R, I> {

    override fun onGotResponseBodySuccess(response: ResponseBody): R {
        return Gson().fromJson(response.string(), returnClass)
    }


}
