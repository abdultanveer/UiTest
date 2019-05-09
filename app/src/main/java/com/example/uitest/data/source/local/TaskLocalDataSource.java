package com.example.uitest.data.source.local;

import android.content.Context;

import com.example.uitest.data.Task;
import com.example.uitest.data.source.TaskDataSource;

/**
 * query my local db and get the task from it
 *
 */
public class TaskLocalDataSource implements TaskDataSource {

    DatabaseOperations operations;
    public TaskLocalDataSource(Context context) {
        operations = new DatabaseOperations(context);
    }

    @Override
    public void getTask(GetTaskCallback callback) {//3a
        //here my local datasource will query my db and return the data
        operations.createRow(new Task("tasktitle","taskdetails"));
        Task task = operations.readRow();
                //new Task("rjt-task repository","apolis");
        callback.onTaskLoaded(task);//4
    }
}
