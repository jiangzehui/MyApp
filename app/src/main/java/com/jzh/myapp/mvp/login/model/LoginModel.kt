package com.jzh.myapp.mvp.login.model

import cn.bmob.v3.BmobQuery
import cn.bmob.v3.exception.BmobException
import cn.bmob.v3.listener.FindListener
import com.jzh.myapp.base.BaseCallBack
import com.jzh.myapp.bean.UserBean

/**
 * Created by jiangzehui on 2018/6/1.
 */
class LoginModel {

    /**
     * 登录
     */
    fun login(user:String,pswd:String,callBack:BaseCallBack<UserBean>){

        var query:BmobQuery<UserBean> = BmobQuery<UserBean>()
        query.addWhereEqualTo("user",user)
        query.addWhereEqualTo("password",pswd)
        query.findObjects(object : FindListener<UserBean>() {
            override fun done(p0: MutableList<UserBean>?, p1: BmobException?) {
                if(p1 == null){
                    if (p0!!.size != 0){
                        callBack.success(p0.get(0))
                    }else{
                        callBack.fail()
                    }

                }else{
                    callBack.fail()
                }
            }


        })

    }

}