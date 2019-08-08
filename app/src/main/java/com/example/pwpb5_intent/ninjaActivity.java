package com.example.pwpb5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ninjaActivity extends AppCompatActivity implements View.OnClickListener {
    Button ninja_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja);

        ninja_btn = (Button) findViewById(R.id.ninja_btn);
        ninja_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent_ninja = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/ninja"));
        startActivity(intent_ninja);
    }
}
