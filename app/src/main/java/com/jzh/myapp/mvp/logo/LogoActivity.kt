package com.jzh.myapp.mvp.logo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.jzh.myapp.R
import com.jzh.myapp.mvp.login.LoginActivity

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)
        var handler = Handler()
        handler.postDelayed(Runnable {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()

        },2000)

    }
}
