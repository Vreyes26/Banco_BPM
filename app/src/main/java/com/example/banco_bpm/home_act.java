package com.example.banco_bpm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class home_act extends AppCompatActivity {

    private ImageButton ima1,ima2,ima3,ima4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Info(View v)
    {
        Intent i = new Intent(this, info_act.class);
        startActivity(i);
    }
}
