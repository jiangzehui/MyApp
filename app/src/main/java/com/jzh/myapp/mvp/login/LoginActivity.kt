package com.jzh.myapp.mvp.login

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.text.TextUtils
import com.jzh.myapp.R
import com.jzh.myapp.R.id.*
import com.jzh.myapp.base.BaseActivity
import com.jzh.myapp.mvp.login.presenter.LoginPresenter
import com.jzh.myapp.mvp.login.view.LoginView
import com.jzh.myapp.mvp.regster.RegsterActivity
import com.jzh.myapp.util.Loading
import com.jzh.myapp.util.T
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity<LoginView,LoginPresenter>(),LoginView {


    var loading:Loading? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initView()
    }


    /**
     * 初始化控件
     */
    override fun initView() {
        loading = Loading(this)
        tvRegster.setOnClickListener {
            startActivity(Intent(this,RegsterActivity::class.java))
        }
        btnLogin.setOnClickListener {
            var user = etUser.text.toString()
            var pswd = etPswd.text.toString()
            if (TextUtils.isEmpty(user.trim())||TextUtils.isEmpty(pswd.trim())) {
                T.show(resources.getString(R.string.login_error))
            }else{
                mPresenter.login(user,pswd)
            }
        }
    }

    override fun showLoading() {
        loading!!.show("正在登陆......")
    }

    override fun hideLoading() {
        loading!!.miss()
    }

    override fun gotoMain() {
        T.show("登录成功")
    }



    override fun createPresenter(): LoginPresenter {
        return LoginPresenter()
    }

}
