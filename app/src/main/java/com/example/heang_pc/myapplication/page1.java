package com.example.heang_pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }
    public void BTN_button (View view){
        Button BTN_button = (Button)findViewById(R.id.button);
        Intent intent = new Intent(page1.this,page2.class);
        startActivity(intent);

    }
    public void  BTN_GG (View view){
        Button BTN_GG = (Button)findViewById(R.id.button);
        Intent intent = new Intent(page1.this,page3.class);
        startActivity(intent);
    }
    public void BTN_AA (View view){
        Button BTN_AA = (Button)findViewById(R.id.button);
        Intent intent = new Intent(page1.this,page4.class);
        startActivity(intent);

    }
    public void BTN_BB (View view){
        Button BTN_BB = (Button)findViewById(R.id.button);
        Intent intent = new Intent(page1.this,page5.class);
        startActivity(intent);
    }
}
