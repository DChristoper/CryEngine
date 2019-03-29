package com.example.dc.cryengine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void prak2(View view){
        Intent intent = new Intent (MainActivity.this,ActivityOrder.class);
        startActivity(intent);
    }
}
