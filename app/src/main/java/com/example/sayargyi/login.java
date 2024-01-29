package com.example.sayargyi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username;
    EditText password;
    Button signInButton;
    Button signUpPageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

                username = findViewById(R.id.username);
                password = findViewById(R.id.password);
                signInButton = findViewById(R.id.sign_in);
                signUpPageButton = findViewById(R.id.sign_up_page);

                signInButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                            Intent intent = new Intent(login.this, menu.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(login.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                //
        signUpPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });
    }
}