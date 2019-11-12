package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    public static final String LOGIN_USERNAME = "com.example.test_1.USERNAME";
    public static final String LOGIN_PASSWORD = "com.example.test_1.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String username = intent.getStringExtra(MainActivity.SIGN_UP_USERNAME);
        String password = intent.getStringExtra(MainActivity.SIGN_UP_PASSWORD);

        TextView Username = findViewById(R.id.textUsernameInput);
        Username.setText(username);
        TextView Password = findViewById(R.id.textPasswordInput);
        Password.setText(password);
    }

    public void ToIndex(View view){
        Intent intent = new Intent(this, IndexActivity.class);
        EditText Username = (EditText) findViewById(R.id.textUsernameInput);
        EditText Password = (EditText) findViewById(R.id.textPasswordInput);
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        intent.putExtra(LOGIN_USERNAME, username);
        intent.putExtra(LOGIN_PASSWORD, password);
        startActivity(intent);
    }

}