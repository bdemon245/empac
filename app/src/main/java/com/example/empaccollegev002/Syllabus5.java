package com.example.empaccollegev002;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Syllabus5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus5);
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Mech7.pdf").load();
    }
}