@file:Suppress("NOTHING_TO_INLINE")
package com.modulearchitecture.utils

import com.google.gson.Gson

inline fun <reified T: Any> Gson.fromJson(json: String): T = this.fromJson(json, T::class.java)