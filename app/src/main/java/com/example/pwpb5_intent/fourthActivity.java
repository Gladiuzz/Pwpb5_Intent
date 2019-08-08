package com.example.pwpb5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthActivity extends AppCompatActivity implements View.OnClickListener {

    Button ninja1;
    Button shrud1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        ninja1 = (Button) findViewById(R.id.ninja);
        ninja1.setOnClickListener(this);
        shrud1 = (Button) findViewById(R.id.shroud);
        shrud1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ninja:
                Intent ninjaI = new Intent(fourthActivity.this, ninjaActivity.class);
                startActivity(ninjaI);
                break;
            case R.id.shroud:
                Intent shroudI = new Intent(fourthActivity.this, shroudActivity.class);
                startActivity(shroudI);
                break;
            default:
                break;
        }
    }
}
