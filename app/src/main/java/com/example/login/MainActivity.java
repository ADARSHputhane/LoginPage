package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button register, login;
   private String value = "false";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = findViewById(R.id.register_button);
        login = findViewById(R.id.login_button);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "false";
                //Intent is used to share information or data between the class in android.
                Intent intent = new Intent(MainActivity.this, register_activity.class) ;
                //Intent takes two values one with the class that the data is coming from and the other that the data i going to.
                   intent.putExtra("value",value);
                // putExtra takes the value like the map it takes the value that is string and the the value to share.
                startActivity(intent);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = "ture";
                Intent intent = new Intent(MainActivity.this, register_activity.class);
                intent.putExtra("value",value);
                startActivity(intent);
            }
        });

    }
}