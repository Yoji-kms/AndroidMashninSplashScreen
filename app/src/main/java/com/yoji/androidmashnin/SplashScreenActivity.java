package com.yoji.androidmashnin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SplashScreenActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Button firstActivityButton = (Button) findViewById(R.id.firstActivityButtonID);
        firstActivityButton.setOnClickListener(this);
    }

    @Override
    public void onClick (View view) {
        Intent intent = new Intent(SplashScreenActivity.this, FirstActivity.class);
        startActivity(intent);
    }
}