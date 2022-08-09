package com.example.empaccollegev002;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity9 extends AppCompatActivity {
    PDFView pdf_probidhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        pdf_probidhan = findViewById(R.id.pdf_probidhan);
        pdf_probidhan.fromAsset("Probidhan_2016.pdf").load();
    }
}