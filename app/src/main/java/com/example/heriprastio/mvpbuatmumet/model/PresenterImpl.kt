package com.example.heriprastio.mvpbuatmumet.model

import android.text.TextUtils
import com.example.heriprastio.mvpbuatmumet.presenter.ILoginPresenter
import com.example.heriprastio.mvpbuatmumet.view.ILoginView

class PresenterImpl(mloginView: ILoginView) : ILoginPresenter{

    var mLoginView : ILoginView? =null
    override fun performLogin(username: String, password: String) {
    if (TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
        mLoginView?.loginValidation()
    }else{
        if (username.equals("Heri") && password.equals("root")){
            mLoginView?.loginSuccess()
        }else{
            mLoginView?.loginError()
        }
    }
    }

}