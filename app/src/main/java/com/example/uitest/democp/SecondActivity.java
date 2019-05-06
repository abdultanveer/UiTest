package com.example.uitest.democp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.uitest.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void done(View view) {
        EditText contact = findViewById(R.id.editTextContact);
        String data = contact.getText().toString();

        Intent dataIntent = new Intent();
        dataIntent.putExtra("contact",data);

        setResult(RESULT_OK,dataIntent);//RESULT_OK this activity was closed normally
        //RESULT_CANCELED means activity wasn't closed properly, so don't try to read the data
        finish();//kill the current activity
    }
}
