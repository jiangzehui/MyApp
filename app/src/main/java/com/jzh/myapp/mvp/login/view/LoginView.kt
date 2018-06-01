package com.jzh.myapp.mvp.login.view

/**
 * Created by jiangzehui on 2018/6/1.
 */
interface LoginView {

    /**
     * 显示进度
     */
     fun showLoading()

    /**
     * 隐藏进度
     */
     fun hideLoading()


     fun gotoMain()

}