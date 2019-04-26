package com.example.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
* mainactivity is a view
 *
 */
public class MainActivity extends AppCompatActivity implements MainContract.View{//4


    MainContract.Presenter presenter;//switch board ---6
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);//wiring --- 6a
    }

    public void clickHandler(View view) {
        //hey mr. presenter someone clicked a button
        presenter.onButtonClicked();  //---6b

        /*EditText nameEditText = findViewById(R.id.editText);
        String name = nameEditText.getText().toString();
        TextView resultTextView = findViewById(R.id.textViewResult);
        resultTextView.setText(name);*/
    }

    @Override
    public void setText(String message) {
        TextView resultTextView = findViewById(R.id.textViewResult);
        resultTextView.setText(message);
    }
}
