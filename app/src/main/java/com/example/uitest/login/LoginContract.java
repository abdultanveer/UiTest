package com.example.uitest.login;

public interface LoginContract {
    /**
     * presenter telling the view what to do
     */
    interface View{
        void showAToast(String message);
    }

    /**
     * view telling to presenter what happened with it
     */
    interface  Presenter{
        void buttonClicked();

    }

}
