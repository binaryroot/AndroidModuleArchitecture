package com.modulearchitecture.net

import com.google.gson.Gson
import com.modulearchitecture.configuration.AppConfiguration
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class BaseRetrofitFactory @Inject constructor(private val appConfiguration: AppConfiguration) : RetrofitFactory {

    override fun createRetrofit(gson: Gson): Retrofit {
        return Retrofit.Builder()
                .baseUrl(appConfiguration.getServerAPIURL())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
    }
}