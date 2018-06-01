package com.jzh.myapp.mvp.regster.presenter

import com.jzh.myapp.base.BaseCallBack
import com.jzh.myapp.base.BasePresenter
import com.jzh.myapp.bean.UserBean
import com.jzh.myapp.mvp.regster.model.RegsterModel
import com.jzh.myapp.mvp.regster.view.RegsterView

/**
 * Created by jiangzehui on 2018/6/1.
 */
class RegsterPresenter : BasePresenter<RegsterView>() {

    var mRegsterModel = RegsterModel()


    fun regster(user:String,pswd:String,sex:String,name:String){
        getView()?.showLoading()
        mRegsterModel.regster(user,pswd,sex,name,object :BaseCallBack<UserBean>{
            override fun success(result: UserBean?) {
                getView()?.hideLoading()
            }

            override fun fail() {
                getView()?.hideLoading()
            }


        })
    }
}