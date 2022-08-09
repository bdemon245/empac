package com.example.empaccollegev002;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
Button dp1 , dp2, dp3, dp4, dp5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        dp1 = findViewById(R.id.dp1);
        dp2 = findViewById(R.id.dp2);
        dp3 = findViewById(R.id.dp3);
        dp4 = findViewById(R.id.dp4);
        dp5 = findViewById(R.id.dp5);

        Intent i = new Intent(MainActivity5.this, Syllabus1.class);
        Intent i2 = new Intent(MainActivity5.this, Syllabus2.class);
        Intent i3 = new Intent(MainActivity5.this, Syllabus3.class);
        Intent i4 = new Intent(MainActivity5.this, Syllabus4.class);
        Intent i5 = new Intent(MainActivity5.this, Syllabus5.class);

        CallActivity(dp1, i);
        CallActivity(dp2, i2);
        CallActivity(dp3, i3);
        CallActivity(dp4, i4);
        CallActivity(dp5, i5);
    }
    private void CreateActivity(Intent act2) { //function to create activity
        startActivity(act2);
    }

    public void CallActivity(Button menu2, Intent act2) { //function to call activity with button ids
        menu2.setOnClickListener(v -> CreateActivity(act2));
    }
}