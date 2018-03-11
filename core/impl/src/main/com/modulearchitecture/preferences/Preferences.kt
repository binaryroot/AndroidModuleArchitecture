package com.modulearchitecture.preferences


interface Preferences {

    fun isContains(key: String) : Boolean

    fun save(key: String, value: String)

    fun get(key: String) : String
}