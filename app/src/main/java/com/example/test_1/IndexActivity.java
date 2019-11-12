package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.SIGN_UP_USERNAME);
        String password = intent.getStringExtra(MainActivity.SIGN_UP_PASSWORD);

        /*
        Check 1: if the username is in the data set;
        Check 2: if the password matches the username;
         */


    }
}


