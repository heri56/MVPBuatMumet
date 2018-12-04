package com.example.heriprastio.mvpbuatmumet.model;

import android.text.TextUtils;
import com.example.heriprastio.mvpbuatmumet.presenter.ILoginPresenter;
import com.example.heriprastio.mvpbuatmumet.view.ILoginView;

public class PresenterImpl implements ILoginPresenter {
    ILoginView mILoginView;
    public PresenterImpl(ILoginView mILoginView){
        this.mILoginView = mILoginView;
    }
    @Override
    public void performLogin(String username, String password) {

        if (TextUtils.isEmpty(username) && TextUtils.isEmpty(password)){
            mILoginView.loginValidasi();
        }else {
            if (username.equals("Heri") && password.equals("root")){
                mILoginView.loginSuccess();
            }else {
                mILoginView.loginError();
            }
        }
    }
}
