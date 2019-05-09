package com.example.uitest.data.source;


import android.content.Context;

import com.example.uitest.data.source.local.TaskLocalDataSource;

/**
 * job of this repo is to decide if we want to fetch data
 * from local db or remote db..
 * if there's no internet then lets fetch data from local db else from remote db
 */
public class TaskRespository implements TaskDataSource{
    TaskDataSource localTaskDataSource;
    public TaskRespository(Context context) {
        localTaskDataSource = new TaskLocalDataSource(context);
    }

    @Override
    public void getTask(GetTaskCallback callback) {
        localTaskDataSource.getTask(callback);

    }
}
