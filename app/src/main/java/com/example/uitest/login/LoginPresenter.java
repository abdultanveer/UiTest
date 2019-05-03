package com.example.uitest.login;

public class LoginPresenter implements  LoginContract.Presenter {

    LoginContract.View view;
    public LoginPresenter(LoginActivity loginActivity) {
        view = loginActivity;
    }

    @Override
    public void buttonClicked() {
        view.showAToast("trying to login");

    }
}
