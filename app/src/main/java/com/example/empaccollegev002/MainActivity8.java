package com.example.empaccollegev002;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Spinner dropDown = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.items, android.R.layout.simple_spinner_item);


        dropDownList(adapter, dropDown);

    }

    private void dropDownList(ArrayAdapter<CharSequence> adapter, Spinner dropDown) {
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        dropDown.setAdapter(adapter);
    }

}