package com.example.pwpb5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button fitz;
    Button gladius;
    Button next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fitz = (Button) findViewById(R.id.btn_fitz);
        fitz.setOnClickListener(this);
        gladius = (Button) findViewById(R.id.btn_gladius);
        gladius.setOnClickListener(this);
        next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_fitz:
                Intent intent_fitz = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/fitz/videos"));
                startActivity(intent_fitz);
                break;
            case R.id.btn_gladius:
                Intent intent_glad = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/id/Sinjz"));
                startActivity(intent_glad);
                break;
            case R.id.next1:
                Intent intent_next1 = new Intent(SecondActivity.this, tigaActivity.class);
                startActivity(intent_next1);
                break;
            default:
                break;
        }
    }
}
