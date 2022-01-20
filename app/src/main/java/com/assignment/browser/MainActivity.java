package com.assignment.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_local, btn_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_local = (Button) findViewById(R.id.local_btn);
        btn_web = (Button) findViewById(R.id.web_btn);

        btn_local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocal ();
            }
        });

        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeb ();
            }
        });


    }

    public void openWeb(){
        Intent webIntent = new Intent(MainActivity.this, WebBrowser.class);
        Toast.makeText(this,"Web View", Toast.LENGTH_SHORT).show();
        startActivity(webIntent);
    }

    public void openLocal(){
        Intent intent=new Intent();
        intent.setType("*/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivity(intent);
    }
}