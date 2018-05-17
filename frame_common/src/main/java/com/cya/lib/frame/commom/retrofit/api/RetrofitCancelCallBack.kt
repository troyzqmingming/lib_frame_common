package com.cya.lib.frame.commom.retrofit.api

import io.reactivex.disposables.Disposable

/**
 * 管理各个retroift calls , 使用rxjava2 用Disposable代替call
 */
interface RetrofitCancelCallBack {
    fun cancelDisposable(): Array<Disposable>
}
