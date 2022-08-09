package com.example.empaccollegev002;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;


public class MainActivity6 extends AppCompatActivity implements OnItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("book-list.pdf").load();


        /*Spinner dropDown = findViewById(R.id.spinner);
        Spinner dropDown2 = findViewById(R.id.spinner2);
        Spinner dropDown3 = findViewById(R.id.spinner3);

        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.items, android.R.layout.simple_spinner_item);
        ArrayAdapter <CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.items2, android.R.layout.simple_spinner_item);
        ArrayAdapter <CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.items3, android.R.layout.simple_spinner_item);


        dropDownList(adapter, dropDown);
        dropDownList(adapter2, dropDown2);
        dropDownList(adapter3, dropDown3);

    }
    private void dropDownList(ArrayAdapter adapter, Spinner dropDown) {
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        dropDown.setAdapter(adapter);
    }
    public void onItemSelected(AdapterView<?> adapter, View view, int pos, long id){
    }
         */

/*private void dropDownList(ArrayAdapter adapter, ArrayList items, Spinner dropDown) {
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        dropDown.setAdapter(adapter);
    }*/
    }


}