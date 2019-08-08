package com.example.pwpb5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shroudActivity extends AppCompatActivity implements View.OnClickListener {

    Button shrud_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shroud);

        shrud_btn = (Button) findViewById(R.id.shroud_btn);
        shrud_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent_shrud = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/shroud"));
        startActivity(intent_shrud);
    }
}
