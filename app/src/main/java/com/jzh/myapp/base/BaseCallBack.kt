package com.jzh.myapp.base

import com.jzh.myapp.bean.UserBean

/**
 * Created by jiangzehui on 2018/5/29.
 */
interface BaseCallBack<R> {

    fun  success(result: UserBean?)

    fun fail()
}