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
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://agitated-hodgkin-77f90e.netlify.app"));
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

    public void onButton4Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oYiBDWhmrX8"));
        startActivity(intent);
    }

    public void onButton5Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9Sl5tI4_J-0"));
        startActivity(intent);
    }

    public void onButton6Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nJeDU7qQIP4"));
        startActivity(intent);
    }

    public void onButton7Clicked(View view){
        Intent intent = new Intent(getApplicationContext(), exercise_record.class);
        startActivity(intent);
    }

}

