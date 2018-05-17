package com.cya.lib.frame.commom.retrofit.exception

data class RetrofitException(var throwable: Throwable?, val code: Int) : Exception() {

   lateinit var msg: String
}