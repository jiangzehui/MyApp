package com.jzh.myapp.util

import android.app.ProgressDialog
import android.content.Context
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import cn.bmob.v3.helper.BmobNative.init
import com.jzh.myapp.R
import com.jzh.myapp.R.id.tv
import com.jzh.myapp.base.MyApplication
import org.w3c.dom.Text

/**
 * Created by jiangzehui on 2018/6/1.
 */
class Loading {
    var alert : AlertDialog? = null
    var tv: TextView? = null

    constructor(context:Context){
        var view = LayoutInflater.from(MyApplication.context).inflate(R.layout.loading,null)
        tv = view.findViewById<TextView>(R.id.tv)
        alert = AlertDialog.Builder(context).setView(view).create()
    }




    fun show(showMsg:String){
        tv!!.text = showMsg
        alert!!.show()
    }

    fun miss(){
        alert!!.dismiss()
    }


}