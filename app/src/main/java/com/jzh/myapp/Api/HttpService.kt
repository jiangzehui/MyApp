package com.jzh.myapp.Api

import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by jiangzehui on 2018/5/29.
 */
interface HttpService {


//    @Url 替换url
//    @Query 替换url参数
//    @QueryMap  替换url中查询参数
//    @Header  替换header
//    @FieldMap 替换post请求body中参数
//    @FormUrlEncoded post请求需要加的方法注解
//    @POST() 标示该方法为post请求
//    @GET() 标示该方法为get请求


    @GET()
    fun get(@Url url:String ,@QueryMap params:HashMap<String,String>) :Call<JSONObject>

    @GET("index?key=9e05423f7ac6acf6d0dce3425c4ea9fe")
    fun getNewsByType(@Query("type") url:String) :Call<JSONObject>

    @GET("index?type=top&key=9e05423f7ac6acf6d0dce3425c4ea9fe")
    fun getNews2() :Call<JSONObject>


    @FormUrlEncoded
    @POST()
    fun post(@Url url:String,@FieldMap params:HashMap<String,String>) :Call<JSONObject>


    @FormUrlEncoded
    @POST("Do")
    fun login(@Query("user") user:String,@Query("pswd") pswd:String) :Call<JSONObject>


}