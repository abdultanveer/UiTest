package com.example.uitest.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.uitest.R;

public class LoginActivity extends AppCompatActivity  implements LoginContract.View{

    LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);
    }

    public void handleClick(View view) {
        //1. hey mr presenter someone clicked a button on me what should i do
        presenter.buttonClicked();
    }

    @Override
    public void showAToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
