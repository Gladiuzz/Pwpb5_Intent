package com.example.pwpb5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tigaActivity extends AppCompatActivity implements View.OnClickListener {
    Button next3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiga);


        next3 = (Button) findViewById(R.id.random_btn);
        next3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent_next3 = new Intent(tigaActivity.this, fourthActivity.class);
        startActivity(intent_next3);
    }
}
