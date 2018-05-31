package com.jzh.myapp.Api

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by jiangzehui on 2018/5/31.
 */
class ApiInterceptor : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request().run {

            var url = chain.request().url().toString()

            newBuilder().method(method(), body()).url(url().newBuilder()
                    .scheme(url().scheme())
                    .host(url().host())
                    .addQueryParameter("key", "9e05423f7ac6acf6d0dce3425c4ea9fe")
                    .build()).build()


        }                      //获取请求对象

//        var url = request.url().toString() //请求的url
//        var method =  request.method()
        return chain.proceed(request)

    }
}