package com.example.arc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserLogin extends AppCompatActivity {
    EditText username;
    EditText mail;
    EditText phone;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        username = findViewById(R.id.username);
        mail=findViewById(R.id.mail);
        phone = findViewById(R.id.phone);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && mail.getText().toString().equals("rss@gmail.com") &&
                        phone.getText().toString().equals("1234567890")) {
//                    Toast.makeText(MainActivity.this, "Login Successfull!!", Toast.LENGTH_SHORT).show();
                    loginButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent=new Intent(UserLogin.this,UserPage1.class);
                            startActivity(intent);
                        }
                    });
                }
                else
                {
                    Toast.makeText(UserLogin.this, "Login Failed!!", Toast.LENGTH_SHORT).show();
                }
                }
            });

        }
}