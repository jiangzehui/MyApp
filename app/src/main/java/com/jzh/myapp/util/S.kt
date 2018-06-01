package com.jzh.myapp.util

import android.content.Context
import com.google.gson.Gson
import com.jzh.myapp.base.MyApplication.Companion.context
import com.jzh.myapp.bean.UserBean

/**
 * Created by jiangzehui on 2018/5/31.
 * 缓存类
 */
object S {


    //是否登录过
    fun isLogin():Boolean {
        var sp = context!!.getSharedPreferences("isLogin", Context.MODE_PRIVATE)
        return sp.getBoolean("isLogin",false)
    }

    //设置登录状态
    fun setLogin(flag:Boolean){
        var sp = context!!.getSharedPreferences("isLogin", Context.MODE_PRIVATE)
        sp.edit().putBoolean("isLogin",flag).commit()
    }

    //缓存用户登录信息
    fun saveU(u:UserBean){
        var sp = context!!.getSharedPreferences("user", Context.MODE_PRIVATE)
        sp.edit().putString("user",Gson().toJson(u)).commit()
    }

    //获取用户登录信息
    fun loadU():UserBean {
        var u = context!!.getSharedPreferences("user", Context.MODE_PRIVATE).getString("user","")
        return Gson().fromJson(u,UserBean::class.java)
    }


}