package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register_activity extends AppCompatActivity {
    private TextView displayName;
    private EditText username;
    private EditText password;
    private EditText conformPassword;
    private Button button;
    private String  valueUsername;
    private String valuePassword;
    private String valueConformPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_login);
        displayName = findViewById(R.id.display_view);
        username = findViewById(R.id.username_editText);
        password = findViewById(R.id.password_editText);
        conformPassword = findViewById(R.id.conform_editText);
        button = findViewById(R.id.regiter_login_button);
        String value = getIntent().getStringExtra("value");
        if(value.equals("false")){
            valueUsername = username.getText().toString();
            valuePassword = password.getText().toString();
            valueConformPassword = conformPassword.getText().toString();
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(valueConformPassword.equals(valuePassword)){

                        Toast.makeText(register_activity.this, "Register successfully ", Toast.LENGTH_SHORT).show();
                        displayName.setText("Login");
                        button.setText("Login");
                        username.setText("");
                        password. setText("");
                        conformPassword.setVisibility(View.GONE);
                        valueUsername = username.getText().toString();
                        valuePassword = username.getText().toString();
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(register_activity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                            }
                        });

                    }else {
                        Toast.makeText(register_activity.this, "Conform password incorrect", Toast.LENGTH_SHORT).show();
                    }
                }
            });



        }else {
            displayName.setText("Login");
            button.setText("Login");
            conformPassword.setVisibility(View.GONE);
            valueUsername = username.getText().toString();
            valuePassword = username.getText().toString();
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(register_activity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                }
            });

        }


    }
}