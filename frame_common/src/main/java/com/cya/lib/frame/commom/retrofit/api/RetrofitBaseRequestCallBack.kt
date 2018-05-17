package com.cya.lib.frame.commom.retrofit.api

import io.reactivex.Observable
import okhttp3.ResponseBody

/**
 * R :Result
 * I :RetrofitInterface
 */
interface RetrofitBaseRequestCallBack<R,I> {

    fun buildObservable(retrofitInterface :I): Observable<ResponseBody>
    fun onGotResponseBodySuccess(response: ResponseBody) : R
    fun onGotSuccess(result :R)
    fun onThrowable(throwable: Throwable?)
}
