package com.com.modulearchitecture.preferences

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.modulearchitecture.preferences.Preferences

class SPWrapper(context: Context) : Preferences {
   private val sp: SharedPreferences = context.getSharedPreferences("app_preferences", MODE_PRIVATE)

    override fun isContains(key: String): Boolean = sp.contains(key)

    override fun save(key: String, value: String) {
        sp.edit().putString(key, value).apply()
    }

    override fun get(key: String): String  = sp.getString(key, null)
}