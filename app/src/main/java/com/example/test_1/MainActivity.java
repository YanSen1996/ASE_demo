package com.example.test_1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String SIGN_UP_USERNAME = "com.example.test_1.USERNAME";
    public static final String SIGN_UP_PASSWORD = "com.example.test_1.PASSWORD";
    public static final String LOGIN_USERNAME = "com.example.test_1.USERNAME";
    public static final String LOGIN_PASSWORD = "com.example.test_1.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Called when the user taps the Sign-up button */
    public void Sign_Up(View view){
        Intent intent = new Intent(this, SignUpActivity.class);
        EditText Username = (EditText) findViewById(R.id.UsernameInput);
        EditText Password = (EditText) findViewById(R.id.PasswordInput);
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        intent.putExtra(SIGN_UP_USERNAME, username);
        intent.putExtra(SIGN_UP_PASSWORD, password);
        startActivity(intent);
    }

    /*Called when the user taps the Login button */
    public void Login(View view){
        Intent intent = new Intent(this, IndexActivity.class);
        EditText Username = (EditText) findViewById(R.id.UsernameInput);
        EditText Password = (EditText) findViewById(R.id.PasswordInput);
        String username = Username.getText().toString();
        String password = Password.getText().toString();
        intent.putExtra(LOGIN_USERNAME, username);
        intent.putExtra(LOGIN_PASSWORD, password);
        startActivity(intent);
    }

}
