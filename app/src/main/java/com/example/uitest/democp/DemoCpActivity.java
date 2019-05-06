package com.example.uitest.democp;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import com.example.uitest.R;

public class DemoCpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_cp);
        Uri tasksUri = Uri.parse("content://com.android.example.minimalistcontentprovider.provider/words");
        ContentResolver contentResolver = getContentResolver();

        Cursor cursor = contentResolver.query(tasksUri,null,null,null,null);

        ListView tasksListView = findViewById(R.id.taskslistview);
        CursorAdapter adapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_2,cursor,
                new String[]{"title","details"},new int[]{android.R.id.text1,android.R.id.text2},0);
        ContentValues values = new ContentValues();
        values.put("title","onil");
        values.put("details","cal-binsun");
            tasksListView.setAdapter(adapter);
            contentResolver.insert(tasksUri,values);
    }

    public void clickme(View view) {
        Intent secondIntent = new Intent(DemoCpActivity.this,SecondActivity.class);
        startActivityForResult(secondIntent,123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        //before reading the data check if result code is ok -- means data is consistent
        TextView contactTextView = findViewById(R.id.textViewcontact);
        if(resultCode == RESULT_OK){
            String contact = intent.getExtras().getString("contact");
            contactTextView.setText(contact);
        }
    }
}
