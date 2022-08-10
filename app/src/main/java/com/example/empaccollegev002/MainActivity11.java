package com.example.empaccollegev002;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity11 extends AppCompatActivity {
ImageView map, phone, whatsapp, mail, fb, web;
TextView etmap, etphone, etwhatsapp, etmail, etfb, etweb;
String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        map = findViewById(R.id.map_ic);
        etmap = findViewById(R.id.map_txt);
        url = "https://maps.app.goo.gl/ooQyR44DjzPyLt4S8";

        map.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        });
        etmap.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        });
    }
}