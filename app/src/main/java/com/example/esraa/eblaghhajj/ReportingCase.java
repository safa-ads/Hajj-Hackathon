package com.example.esraa.eblaghhajj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ReportingCase extends AppCompatActivity {
    private ImageButton buttonFaint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporting_case);
        buttonFaint = (ImageButton) findViewById(R.id.buttonFaint);
        buttonFaint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ReportingCase.this, ("\u2705"), Toast.LENGTH_LONG).show();

            }
        });
    }
}
