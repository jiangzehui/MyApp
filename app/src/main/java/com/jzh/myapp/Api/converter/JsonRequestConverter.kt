package com.jzh.myapp.Api.converter

import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Converter

/**
 * Created by jiangzehui on 2018/5/31.
 */
class JsonRequestConverter : Converter<JSONObject, RequestBody> {


    private val MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8")

    override fun convert(value: JSONObject?): RequestBody {
        return RequestBody.create(MEDIA_TYPE, value.toString())
    }


}