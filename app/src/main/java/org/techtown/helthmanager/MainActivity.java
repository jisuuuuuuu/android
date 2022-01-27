package org.techtown.helthmanager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zealous-noyce-d7b2db.netlify.app/"));
        startActivity(intent);
    }

    public void onButton2Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stupefied-engelbart-62d0f8.netlify.app/"));
        startActivity(intent);
    }

    public void onButton3Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wizardly-torvalds-82919b.netlify.app/"));
        startActivity(intent);
    }
}

