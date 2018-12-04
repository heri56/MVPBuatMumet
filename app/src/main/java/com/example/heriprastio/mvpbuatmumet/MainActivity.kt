package com.example.heriprastio.mvpbuatmumet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.heriprastio.mvpbuatmumet.model.PresenterImpl
import com.example.heriprastio.mvpbuatmumet.model.SignPresenterImpl
import com.example.heriprastio.mvpbuatmumet.presenter.ILoginPresenter
import com.example.heriprastio.mvpbuatmumet.presenter.ISignPresenter
import com.example.heriprastio.mvpbuatmumet.view.ILoginView
import com.example.heriprastio.mvpbuatmumet.view.ISignView

class MainActivity : AppCompatActivity(), View.OnClickListener,ILoginView {


    lateinit var username : EditText
    lateinit var password: EditText
    lateinit var textview: TextView
    lateinit var btn: Button
    var mLoginPresenter: ILoginPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        username = findViewById(R.id.username)
        password = findViewById(R.id.pass)
        textview = findViewById(R.id.tview)
        btn = findViewById(R.id.btnclick)
        btn.setOnClickListener(this)

        mLoginPresenter = PresenterImpl(this@MainActivity)


    }
//    val click = View.OnClickListener {
//        val username = username.text.toString()
//        val password = password.text.toString()
//        mLoginPresenter.performLogin(username,password)
//    }

    override fun onClick(p0: View?) {
        val username = username.text.toString()
        val password = password.text.toString()
        mLoginPresenter?.performLogin(username,password)

    }

    override fun loginValidation() {
        Toast.makeText(applicationContext,"Please Enter username", Toast.LENGTH_LONG).show()

    }

    override fun loginSuccess() {
        Toast.makeText(applicationContext,"Login Sukses", Toast.LENGTH_LONG).show()
    }

    override fun loginError() {
        Toast.makeText(applicationContext,"Login Failed", Toast.LENGTH_LONG).show()
    }
}