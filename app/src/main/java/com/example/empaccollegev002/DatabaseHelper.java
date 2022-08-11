package com.example.empaccollegev002;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String FEEDBACKS_TABLE = "FEEDBACKS_TABLE";
    public static final String ID = "ID";
    public static final String STUDENT_NAME = "STUDENT_NAME";
    public static final String ROLL = "ROLL";
    public static final String TECHNOLOGY = "TECHNOLOGY";
    public static final String CONTACT_INFO = "CONTACT_INFO";
    public static final String FEEDBACK_DESCRIPTION = "FEEDBACK_DESCRIPTION";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "empacApp.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createStatment = "CREATE TABLE " + FEEDBACKS_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + STUDENT_NAME + " TEXT, " + ROLL + " INT, " + TECHNOLOGY + " TEXT, " + CONTACT_INFO + " TEXT, " + FEEDBACK_DESCRIPTION + " TEXT)";
        db.execSQL(createStatment);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
