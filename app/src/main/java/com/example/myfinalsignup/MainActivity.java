package com.example.myfinalsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText username = (EditText) findViewById(R.id.username);

        MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);

        regbtn.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View v) {
                String username1 = username.getText().toString();
                Toast.makeText(MainActivity.this, "Username is"+username1,Toast.LENGTH_SHORT) .show();
            }
        });
    }
}