package com.example.empaccollegev002;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String FEEDBACKS_TABLE = "FEEDBACKS_TABLE";
    public static final String ID = "ID";
    public static final String STUDENT_NAME = "STUDENT_NAME";
    public static final String ROLL = "ROLL";
    public static final String TECH = "TECHNOLOGY";
    public static final String CONTACT_INFO = "CONTACT_INFO";
    public static final String FEEDBACK_DESCRIPTION = "FEEDBACK_DESCRIPTION";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "empacApp.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createStatement = "CREATE TABLE " + FEEDBACKS_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + ROLL + " INT, " + STUDENT_NAME + " TEXT, " + TECH + " TEXT, " + CONTACT_INFO + " TEXT, " + FEEDBACK_DESCRIPTION + " TEXT)";
        db.execSQL(createStatement);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
     public boolean addRowInFeedBackTable(userFeedBackModel userFeedBackModel){
        SQLiteDatabase db = this.getWritableDatabase();
         ContentValues cv = new ContentValues();

         cv.put(ROLL, userFeedBackModel.getRoll());
         cv.put(STUDENT_NAME, userFeedBackModel.getName());
         cv.put(TECH, userFeedBackModel.getTech());
         cv.put(CONTACT_INFO, userFeedBackModel.getContact());
         cv.put(FEEDBACK_DESCRIPTION, userFeedBackModel.getDescription());

         long insert = db.insert(FEEDBACKS_TABLE, null, cv);
         return insert != -1;
     }

     public List<userFeedBackModel> getAll(){
        List<userFeedBackModel> list = new ArrayList<>();

        String doQuery = "SELECT * FROM " + FEEDBACKS_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();

         Cursor cursor = db.rawQuery(doQuery, null);
         if (cursor.moveToFirst()){
             do {
                //loop through the cursor to create an object for each report
                 int userId = cursor.getInt(0);
                 int roll = cursor.getInt(1);
                 String name = cursor.getString(2);
                 String tech = cursor.getString(3);
                 String contact = cursor.getString(4);
                 String description = cursor.getString(5);
                 userFeedBackModel userFeedBack = new userFeedBackModel(userId,roll,name,tech,contact,description);

                 list.add(userFeedBack);
             }
             while (cursor.moveToNext());
         }
         else {
             //do nothing
         }
         cursor.close();
         db.close();
         return list;
     }
     public boolean deleteOne(userFeedBackModel userFeedBackModel){
        //Will delete one from list view & update the list & return true else return false
    SQLiteDatabase db = this.getWritableDatabase();
    String deleteStm = "DELETE FROM " + FEEDBACKS_TABLE + " WHERE "+ ID + " = " + userFeedBackModel.getId();

         Cursor cursor = db.rawQuery(deleteStm, null);
         return cursor.moveToFirst();
     }
}
