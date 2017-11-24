package com.example.manoch.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    TextView txtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        txtTitle = (TextView) findViewById(R.id.txtMessage);
        txtTitle.setText("Welcome to Android Prgramming");

        String str = txtTitle.getText().toString();

        Log.d("STRING",str);
    }
}
