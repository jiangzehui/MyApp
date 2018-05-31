package com.jzh.myapp.Api.converter

import okhttp3.MediaType
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Converter

/**
 * Created by jiangzehui on 2018/5/30.
 */
class JsonResponseConverter :Converter<ResponseBody,JSONObject> {

    override fun convert(value: ResponseBody?): JSONObject {
        return JSONObject(value?.string())
    }
}