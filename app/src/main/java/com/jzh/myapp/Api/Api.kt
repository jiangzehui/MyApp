package com.jzh.myapp.Api

import com.jzh.myapp.Api.converter.JsonConverterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * Created by jiangzehui on 2018/5/29.
 */
object Api {
    private const val BASE_URL: String = "http://v.juhe.cn/toutiao/"

    private  var  mRetrofit: Retrofit? = null

    @Synchronized
    private fun get(): Retrofit? {
        if(mRetrofit == null){
           // var client = OkHttpClient.Builder().addInterceptor(ApiInterceptor()).build()
            mRetrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(JsonConverterFactory()).build()
}
        return mRetrofit
    }

    fun getRetrofit(): HttpService = get()!!.create(HttpService::class.java)


}