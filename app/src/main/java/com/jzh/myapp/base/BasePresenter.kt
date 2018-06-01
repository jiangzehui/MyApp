package com.jzh.myapp.base

import java.lang.ref.WeakReference

/**
 * Created by jiangzehui on 2018/5/29.
 */
open class BasePresenter<V> {

    protected var mViewReference: WeakReference<V>? = null

    public fun attachView(view:V) {
        mViewReference = WeakReference<V>(view)
    }

    public fun detachView() {
        if(mViewReference!=null){
            mViewReference!!.clear()
        }
    }

    public fun getView() : V? {
        return mViewReference!!.get()
    }

}