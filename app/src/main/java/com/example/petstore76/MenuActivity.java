package com.example.petstore76;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goPet(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}