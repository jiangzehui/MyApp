package com.jzh.myapp.base

import android.app.Application
import android.content.Context
import com.jzh.myapp.util.T

/**
 * Created by jiangzehui on 2018/5/29.
 */
class MyApplication : Application() {




    override fun onCreate() {
        super.onCreate()
        T.context = this

    }


}