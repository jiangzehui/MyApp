package com.jzh.myapp.base

import android.app.Application
import android.content.Context
import cn.bmob.v3.Bmob

/**
 * Created by jiangzehui on 2018/5/29.
 */
class MyApplication : Application() {




    companion object {
        var  context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        //初始化bmob
        Bmob.initialize(this, "f6856c8e7e172fe56b7ad33e1d04a071")

    }


}