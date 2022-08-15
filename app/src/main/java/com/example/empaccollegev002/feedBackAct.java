package com.example.empaccollegev002;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class feedBackAct extends AppCompatActivity {
EditText etName, etRoll, etTech, etContact, etDescription;
Button btnSubmit, btnReset, btnViewList;
int toastLength;
ListView lvList;
    ArrayAdapter<userFeedBackModel> feedBackArray;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        etName = findViewById(R.id.et_name);
        etRoll = findViewById(R.id.et_roll);
        etTech = findViewById(R.id.et_tech);
        etContact = findViewById(R.id.et_contact);
        etDescription = findViewById(R.id.et_description);
        lvList = findViewById(R.id.lv_list_view);

        btnSubmit = findViewById(R.id.btn_submit);
        btnReset = findViewById(R.id.btn_reset);
        btnViewList = findViewById(R.id.btn_view_list);

        // creating an instance for database helper class to use getAll() method
        databaseHelper = new DatabaseHelper(feedBackAct.this);

        // creating an instance for ArrayAdapter & giving it the parameter of getAll method to use as an array in listview
        feedBackArray = new ArrayAdapter<>(feedBackAct.this, android.R.layout.simple_list_item_1, databaseHelper.getAll());
        lvList.setAdapter(feedBackArray);
        toastLength = 2000;

        resetValues();

        btnViewList.setOnClickListener(v ->{
            databaseHelper = new DatabaseHelper(feedBackAct.this);
            feedBackArray = new ArrayAdapter<>(feedBackAct.this, android.R.layout.simple_list_item_1, databaseHelper.getAll());
            lvList.setAdapter(feedBackArray);
            //Toast.makeText(feedBackAct.this, viewAll.toString(), toastLength).show();
        });

        btnSubmit.setOnClickListener(v ->{
            userFeedBackModel userFeedBackModel;
            try {
                userFeedBackModel = new userFeedBackModel(-1,
                        Integer.parseInt(etRoll.getText().toString()),
                        etName.getText().toString(),
                        etTech.getText().toString(),
                        etContact.getText().toString(),
                        etDescription.getText().toString());

                DatabaseHelper databaseHelper = new DatabaseHelper(feedBackAct.this);

                boolean isSuccess = databaseHelper.addRowInFeedBackTable(userFeedBackModel);

                Toast.makeText(feedBackAct.this, "Success: " + isSuccess, toastLength).show();
            }
            catch (Exception e){
                Toast.makeText(feedBackAct.this, "All fields Required", toastLength).show();
            }
        });
    }

    private void resetValues() {
        btnReset.setOnClickListener(v ->{
            etName.setText("");
            etRoll.setText("");
            etTech.setText("");
            etDescription.setText("");
            etContact.setText("");
        });
    }


}