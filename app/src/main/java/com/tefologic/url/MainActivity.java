package com.tefologic.url;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn(View view)
    {
        String w ="https://openai.com/chatgpt";
        Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse(w));
        startActivity(i);
    }
}