
package com.example.heriprastio.mvpbuatmumet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.heriprastio.mvpbuatmumet.model.PresenterImpl;
import com.example.heriprastio.mvpbuatmumet.presenter.ILoginPresenter;
import com.example.heriprastio.mvpbuatmumet.view.ILoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {
    EditText editTextUsername, editTextPassword;
    TextView textView;
    Button buttonSign;
    ILoginPresenter mILoginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.username);
        editTextPassword = findViewById(R.id.pass);
        buttonSign = findViewById(R.id.btnclick);
        buttonSign.setOnClickListener(this);
        mILoginPresenter = new PresenterImpl(MainActivity.this);
    }

    @Override
    public void onClick(View view) {

        String usermame = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        mILoginPresenter.performLogin(usermame, password);

    }

    @Override
    public void loginValidasi() {

        Toast.makeText(getApplicationContext(),"Please Enter username", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {

        Toast.makeText(getApplicationContext(),"Login Sukses", Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginError() {

        Toast.makeText(getApplicationContext(),"Login Failed", Toast.LENGTH_LONG).show();

    }
}
