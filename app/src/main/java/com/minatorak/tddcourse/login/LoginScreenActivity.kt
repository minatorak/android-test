package com.minatorak.tddcourse.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.minatorak.tddcourse.R

class LoginScreenActivity : AppCompatActivity() , LoginView{
    override fun gotoMainScreen() {

    }

    override fun showErrorMsg() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
    }
}
