package com.assignment.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MessengerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        getSupportActionBar().hide();

        Intent toHome= new Intent(MessengerActivity.this, MessengerHomeActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                 startActivity(toHome);
                 finish();
            }
        }, 2000);
    }
}