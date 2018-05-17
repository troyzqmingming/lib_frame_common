package com.cya.lib.frame.commom.retrofit.view

import android.app.Dialog
import io.reactivex.disposables.Disposable

interface RetrofitProgressDialog {

    fun showDialog(disposable: Disposable?): Dialog

    fun dismissDialog()
}