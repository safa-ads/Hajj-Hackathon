package com.example.esraa.eblaghhajj;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private ImageButton buttonAmbulance;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAmbulance = (ImageButton) findViewById(R.id.buttonAmbulance);
        buttonAmbulance.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QRReaderActivity.class);
                startActivity(intent);
                String uniqueId = UUID.randomUUID().toString();
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                mDatabase = database.getReference("Users");
                mDatabase.child(uniqueId).child("Location").setValue("Jeddah");

            }
        });
    }

}
