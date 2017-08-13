package com.example.heang_pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BTNOK (View view){
        Button BTN_OK = (Button)findViewById(R.id.OK);
        Intent intent = new Intent(MainActivity.this,page1.class);
        startActivity(intent);
    }



}
