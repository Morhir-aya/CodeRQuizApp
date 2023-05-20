package com.example.quizapp_m72;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button B1 ;
    EditText name;
    EditText email;
    EditText cpassword;

    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        B1 = findViewById(R.id.register);
        name = findViewById(R.id.rName);
        email = findViewById(R.id.erMail);
        Password = findViewById(R.id.rPassword);
        cpassword = findViewById(R.id.rcPassword);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail=email.getText().toString();
                String password=Password.getText().toString();
                String password1=cpassword.getText().toString();
                if(TextUtils.isEmpty(mail)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(),"Please fill in the required fields",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(password1)){
                    Toast.makeText(getApplicationContext(),"Please confirm your password",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(password.length()<6){
                    Toast.makeText(getApplicationContext(),"Password must be at least 6 characters",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!password.equals(password1)){
                    Toast.makeText(getApplicationContext(),"Please enter correct password",Toast.LENGTH_SHORT).show();
                    return;
                }

                //Commen.login=Mail;
                //Commen.password=password;
                Toast.makeText(getApplicationContext(),"Registration Successful!",Toast.LENGTH_LONG).show();
                startActivity(new Intent(Register.this,MainActivity.class));
                finish();
            }
        });
    }

}
