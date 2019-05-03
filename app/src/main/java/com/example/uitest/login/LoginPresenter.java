package com.example.uitest.login;

import com.example.uitest.data.Task;
import com.example.uitest.data.source.TaskDataSource;
import com.example.uitest.data.source.local.TaskLocalDataSource;

public class LoginPresenter implements  LoginContract.Presenter ,
        TaskDataSource.GetTaskCallback {

    TaskDataSource dataSource;

    LoginContract.View view;
    public LoginPresenter(LoginActivity loginActivity) {
        view = loginActivity;
        dataSource = new TaskLocalDataSource();
    }

    @Override
    public void buttonClicked() { //2
        dataSource.getTask(this);//when you get the task return the task to this presenter

    }

    @Override
    public void onTaskLoaded(Task task) {//5
        view.showAToast(task.getTaskTitle()+task.getTaskDetails());//6

    }
}
