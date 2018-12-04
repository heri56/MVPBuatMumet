package com.example.heriprastio.mvpbuatmumet.model

import android.text.TextUtils
import com.example.heriprastio.mvpbuatmumet.presenter.ISignPresenter
import com.example.heriprastio.mvpbuatmumet.view.ISignView

class SignPresenterImpl(val signInView: ISignView) : ISignPresenter{

    override fun signIn(userName: String, password: String) {
        if (TextUtils.isEmpty(userName)||TextUtils.isEmpty(password)){

        }else{
            if(userName.equals("heri") && password.equals("root")){
                signInView.signInSuccess()
        }else{
                signInView.signInError()
            }

        }
    }
}