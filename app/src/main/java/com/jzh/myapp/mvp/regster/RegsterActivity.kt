package com.jzh.myapp.mvp.regster

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jzh.myapp.R
import com.jzh.myapp.base.BaseActivity
import com.jzh.myapp.mvp.regster.presenter.RegsterPresenter
import com.jzh.myapp.mvp.regster.view.RegsterView
import com.jzh.myapp.util.Loading

class RegsterActivity : BaseActivity<RegsterView,RegsterPresenter>(),RegsterView {

    var mLoading = Loading(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regster)
        initView()
    }


    override fun showLoading() {
        mLoading.show("正在注册......")
    }

    override fun hideLoading() {
        mLoading.miss()
    }

    override fun initView() {

    }

    override fun createPresenter(): RegsterPresenter {
       return RegsterPresenter()
    }
}
