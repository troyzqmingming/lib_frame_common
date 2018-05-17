package com.cya.lib.frame.commom.utils.data

import android.content.Context
import android.content.SharedPreferences

class SharePreferenceUtils {

    private constructor(context: Context) {
        preferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }

    companion object {
        private lateinit var preferences: SharedPreferences
        @Volatile
        private var instance: SharePreferenceUtils? = null

        fun getInstance(context: Context): SharePreferenceUtils = instance ?: synchronized(this) {
            instance ?: SharePreferenceUtils(context).also {
                instance = it
            }
        }
    }

    fun putString(key: String, value: String) {
        preferences.edit().putString(key, value).apply()
    }

    fun getString(key: String, defaultValue: String = ""): String {
        return preferences.getString(key, defaultValue)
    }

    fun putBoolean(key: String, value: Boolean) {
        preferences.edit().putBoolean(key, value).apply()
    }

    fun getBoolean(key: String, defaultValue: Boolean = false): Boolean {
        return preferences.getBoolean(key, defaultValue)
    }
    
}