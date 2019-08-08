package com.example.pwpb5_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_next;
    Button button_browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_next = (Button)findViewById(R.id.first_button);
        button_next.setOnClickListener(this);
        button_browser = (Button)findViewById(R.id.second_button);
        button_browser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first_button:
                Intent next = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(next);
                break;
            case R.id.second_button:
                Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitch.tv/"));
                startActivity(browser);
                break;
            default:
                break;
        }


    }
}
