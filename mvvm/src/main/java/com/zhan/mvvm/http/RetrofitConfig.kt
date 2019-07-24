package com.zhan.mvvm.http

import com.zhan.mvvm.config.Setting
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * author：  HyZhan
 * create：  2019/7/24
 * desc：    TODO
 */
interface RetrofitConfig {

    val baseUrl: String

    val readTimeOut: Long
    val writeTimeOut: Long
    val connectTimeOut: Long

    fun initRetrofit(): Retrofit

    fun initOkHttpClient(): OkHttpClient
}