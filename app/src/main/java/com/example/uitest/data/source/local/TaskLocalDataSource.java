package com.example.uitest.data.source.local;

import com.example.uitest.data.Task;
import com.example.uitest.data.source.TaskDataSource;

public class TaskLocalDataSource implements TaskDataSource {


    @Override
    public void getTask(GetTaskCallback callback) {//3a
        //here my local datasource will query my db and return the data
        Task task = new Task("rjt","apolis");
        callback.onTaskLoaded(task);//4
    }
}
