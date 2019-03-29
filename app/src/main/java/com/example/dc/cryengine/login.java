package com.example.dc.cryengine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Login(View view) {
        Intent intent = new Intent(login.this, MainActivity.class);
        startActivity(intent);
    }

    public void register(View view){
        Intent intent = new Intent(login.this, Register.class);
        startActivity(intent);
    }


}
