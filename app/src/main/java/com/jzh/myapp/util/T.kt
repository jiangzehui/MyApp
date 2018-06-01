package com.jzh.myapp.util

import android.widget.Toast
import com.jzh.myapp.base.MyApplication.Companion.context

/**
 * Created by jiangzehui on 2018/5/30.
 * 提示类
 */
object T {



    fun show(msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }


}