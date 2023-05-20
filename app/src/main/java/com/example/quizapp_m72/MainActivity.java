package com.example.quizapp_m72;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button B1;
    EditText email;
    EditText password;
    TextView click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1 = findViewById(R.id.bLogin);
        email = findViewById(R.id.etMail);
        password = findViewById(R.id.etPassword);
        click = findViewById(R.id.tvRegister);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("toto") && password.getText().toString().equals("123")) {
                    startActivity(new Intent(MainActivity.this, Quiz1.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Login or password incorrect !", Toast.LENGTH_SHORT).show();
                }
            }
        });
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
    }
}

