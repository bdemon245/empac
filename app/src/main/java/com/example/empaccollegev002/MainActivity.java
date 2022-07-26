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

        //initiating menu ids
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

        //initiating activities
        Intent act1 = new Intent(MainActivity.this, MainActivity1.class);
        Intent act2 = new Intent(MainActivity.this, CgpaActivity.class);
        Intent act3 = new Intent(MainActivity.this, MainActivity3.class);
        Intent act4 = new Intent(MainActivity.this, MainActivity4.class);
        Intent act5 = new Intent(MainActivity.this, MainActivity5.class);
        Intent act6 = new Intent(MainActivity.this, MainActivity6.class);
        Intent act7 = new Intent(MainActivity.this, MainActivity7.class);
        Intent act8 = new Intent(MainActivity.this, MainActivity8.class);
        Intent act9 = new Intent(MainActivity.this, MainActivity9.class);
        Intent act10 = new Intent(MainActivity.this, MainActivity10.class);
        Intent act11 = new Intent(MainActivity.this, MainActivity11.class);
        Intent act12 = new Intent(MainActivity.this, MainActivity12.class);


        CallActivity(menu1, act1);
        CallActivity(menu2, act2);
        CallActivity(menu3, act3);
        CallActivity(menu4, act4);
        CallActivity(menu5, act5);
        CallActivity(menu6, act6);
        CallActivity(menu7, act7);
        CallActivity(menu8, act8);
        CallActivity(menu9, act9);
        CallActivity(menu10, act10);
        CallActivity(menu11, act11);
        CallActivity(menu12, act12);


    }

    private void CreateActivity(Intent act2) { //function to create activity
        startActivity(act2);
    }

    public void CallActivity(ImageView menu2,Intent act2) { //function to call activity with button ids
        menu2.setOnClickListener(v -> CreateActivity(act2));
    }
}