package com.example.empaccollegev002;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Syllabus3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus3);
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("ET7.pdf").load();
    }
}