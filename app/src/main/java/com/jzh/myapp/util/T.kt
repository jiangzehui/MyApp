package com.jzh.myapp.util

import android.content.Context
import android.widget.Toast

/**
 * Created by jiangzehui on 2018/5/30.
 */
object T {
    var context: Context? = null


    fun show(msg:String){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }


}