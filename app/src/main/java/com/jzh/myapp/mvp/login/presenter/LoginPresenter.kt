package com.jzh.myapp.mvp.login.presenter

import com.jzh.myapp.base.BaseCallBack
import com.jzh.myapp.base.BasePresenter
import com.jzh.myapp.bean.UserBean
import com.jzh.myapp.mvp.login.model.LoginModel
import com.jzh.myapp.mvp.login.view.LoginView
import com.jzh.myapp.util.S
import com.jzh.myapp.util.T

/**
 * Created by jiangzehui on 2018/6/1.
 */
class LoginPresenter : BasePresenter<LoginView>() {

    var mLoginModel = LoginModel()

    fun login(user:String,pswd:String){
        getView()?.showLoading()
        mLoginModel.login(user,pswd,object : BaseCallBack<UserBean>{
            override fun success(result: UserBean?) {
                getView()?.hideLoading()
                S.saveU(result)
                S.setLogin(true)
                T.show("登录成功")
                getView()?.gotoMain()
            }

            override fun fail() {
                getView()?.hideLoading()
                T.show("用户名或密码输入有误")
            }


        })

    }


}