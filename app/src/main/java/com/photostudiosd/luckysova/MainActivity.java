package com.photostudiosd.luckysova;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBrowser(View view) {

        // first define a string to hold the website address
        String website = "http://www.photostudiosd.com";

        // open a web browser using an Intent
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

        // this conditional prevents the app from crashing
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent); // open a web browser only if one exists on the phone
        }

    }
}
