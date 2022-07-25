package com.example.empaccollegev002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9,menu10,menu11,menu12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initiating menus
        menu1 = findViewById(R.id.menu1);
        menu2 = findViewById(R.id.menu2);
        menu3 = findViewById(R.id.menu3);
        menu4 = findViewById(R.id.menu4);
        menu5 = findViewById(R.id.menu5);
        menu6 = findViewById(R.id.menu6);
        menu7 = findViewById(R.id.menu7);
        menu8 = findViewById(R.id.menu8);
        menu9 = findViewById(R.id.menu9);
        menu10 = findViewById(R.id.menu10);
        menu11 = findViewById(R.id.menu11);
        menu12 = findViewById(R.id.menu12);


        //initiating onclick listener for menus

        menu2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CgpaActivity.class);
            startActivity(intent);
        });
    }
}