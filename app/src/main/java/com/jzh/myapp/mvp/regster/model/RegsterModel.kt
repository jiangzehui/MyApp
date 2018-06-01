package com.jzh.myapp.mvp.regster.model

import cn.bmob.v3.BmobQuery
import cn.bmob.v3.exception.BmobException
import cn.bmob.v3.listener.FindListener
import com.jzh.myapp.base.BaseCallBack
import com.jzh.myapp.bean.UserBean

/**
 * Created by jiangzehui on 2018/6/1.
 */
class RegsterModel {


    fun regster(user:String, pswd:String, sex:String, name: String, callBack: BaseCallBack<UserBean>){

        var query: BmobQuery<UserBean> = BmobQuery<UserBean>()
        query.addWhereEqualTo("user",user)
        query.findObjects(object : FindListener<UserBean>() {
            override fun done(p0: MutableList<UserBean>?, p1: BmobException?) {
                if(p1 == null){
                    if (p0!!.size != 0){
                        callBack.fail()
                    }else{
                        zhuce(user,pswd,sex, name)
                        callBack.success(null)

                    }

                }else{
                    zhuce(user,pswd,sex,name)
                    callBack.success(null)
                }
            }


        })


    }

    fun zhuce(user:String,pswd:String,sex:String,name:String){
        var u = UserBean()
        u.phone = user
        u.password = pswd
        u.sex = sex
        u.nickname =name
        u.save()

    }




}