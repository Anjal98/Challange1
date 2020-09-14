package com.example.challangeac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final String EXTRA_MESSAGE =
            "com.example.android.challangeac.extra.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void launchSecondActivityFromB1(View view) {
        Log.d(LOG_TAG, "Button1 clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.Text1);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

    public void launchSecondActivityFromB2(View view) {
        Log.d(LOG_TAG, "Button2 clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.Text2);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void launchSecondActivityFromB3(View view) {
        Log.d(LOG_TAG, "Button3 clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = getString(R.string.Text3);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}