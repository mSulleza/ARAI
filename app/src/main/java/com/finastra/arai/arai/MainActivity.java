package com.finastra.arai.arai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button scanButton, spentButton, reviewButton, contactButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        scanButton = findViewById(R.id.main_scan);
        scanButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent scan_intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(scan_intent);

            }
        });

        spentButton = findViewById(R.id.main_spent);
        spentButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent spent_intent = new Intent(MainActivity.this, AR.class);
                startActivity(spent_intent);

            }
        });
    }
}
