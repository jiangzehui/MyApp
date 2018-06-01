package com.jzh.myapp.base

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jzh.myapp.R

abstract class BaseActivity<V,P :BasePresenter<V>> : AppCompatActivity() {

    protected lateinit var mPresenter:P

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
        mPresenter = createPresenter()
        mPresenter.attachView(this as V)
    }

    /**
     * 初始化
     */
    protected abstract fun initView()

    /**
     * 创建presenter
     */
    protected abstract fun createPresenter():P

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.detachView()
    }


}
