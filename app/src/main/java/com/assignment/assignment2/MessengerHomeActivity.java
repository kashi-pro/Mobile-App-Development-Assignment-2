package com.assignment.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MessengerHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger_home);
        getSupportActionBar().hide();

        Button sendBtn = findViewById(R.id.sendBtn);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSms();
            }
            public void sendSms() {
                EditText number= findViewById(R.id.number);
                EditText msg= findViewById(R.id.message);

                String num=number.getText().toString();
                String sms=msg.getText().toString();

                if(num.isEmpty() || sms.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Please fill all fields!",Toast.LENGTH_LONG).show();
                }
                else {
                    SmsManager smsmanager= SmsManager.getDefault();
                    smsmanager.sendTextMessage(num,null,sms,null,null);

                    Toast.makeText(getApplicationContext(),"Sms Send Successfully",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}