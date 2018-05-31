package com.jzh.myapp.mvp.logo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jzh.myapp.Api.Api
import com.jzh.myapp.R
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)






        Api.getRetrofit().getNewsByType("top").enqueue(object : Callback<JSONObject> {






            override fun onFailure(call: Call<JSONObject>, t: Throwable) {

            }

            override fun onResponse(call: Call<JSONObject>, response: Response<JSONObject>) {
                Log.d("jzhjzhjzh", response.body().toString())
            }


        })


    }
}
