package com.example.empaccollegev002;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CgpaActivity extends AppCompatActivity {
    EditText S1,S2,S3,S4,S5,S6,S7,S8; //assigning variables
    TextView tv, g1,g2,g3,g4,g5,g6,g7,g8;
    Button bt_calc, resetButton, grade;
    String url;
    ImageView result;
    boolean isAllFieldsChecked, ifGreaterThen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_activity);


        S1 =  findViewById(R.id.S1);//edittext assigning section
        S2 =  findViewById(R.id.S2);
        S3 =  findViewById(R.id.S3);
        S4 =  findViewById(R.id.S4);
        S5 =  findViewById(R.id.S5);
        S6 =  findViewById(R.id.S6);
        S7 =  findViewById(R.id.S7);
        S8 =  findViewById(R.id.S8);

        g1 = findViewById(R.id.g1);
        g2= findViewById(R.id.g2);
        g3= findViewById(R.id.g3);
        g4= findViewById(R.id.g4);
        g5= findViewById(R.id.g5);
        g6= findViewById(R.id.g6);
        g7= findViewById(R.id.g7);
        g8= findViewById(R.id.g8);

        tv = findViewById(R.id.tv);//button assigning section
        bt_calc =  findViewById(R.id.bt_calc);
        grade = findViewById(R.id.grade);
        resetButton = findViewById(R.id.resetButton);
        result = findViewById(R.id.btn_result);

        result.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            url = "https://btebresultszone.com/results/";
            Intent i2 = new Intent(Intent.ACTION_VIEW);
            i2.setData(Uri.parse(url));
            startActivity(i2);
        });

        bt_calc.setOnClickListener(new View.OnClickListener() { //function for calculation button
            @Override
            public void onClick(View view) {

                // store the returned value of the dedicated function which checks
                // whether the entered data is valid or if any fields are left blank.
                isAllFieldsChecked = CheckAllFields();// creating function for validation
                ifGreaterThen4 = MaxValid();
                // the boolean variable turns to be true then
                if (isAllFieldsChecked && ifGreaterThen4) {
                    // executing calculations
                    double s1 = Double.parseDouble(S1.getText().toString());
                    double s2 = Double.parseDouble(S2.getText().toString());
                    double s3 = Double.parseDouble(S3.getText().toString());
                    double s4 = Double.parseDouble(S4.getText().toString());
                    double s5 = Double.parseDouble(S5.getText().toString());
                    double s6 = Double.parseDouble(S6.getText().toString());
                    double s7 = Double.parseDouble(S7.getText().toString());
                    double s8 = Double.parseDouble(S8.getText().toString());

                    double r1 = s1*0.05, r2 = s2*0.05,r3 = s3*0.05,r4 = s4*0.1,r5 = s5*0.15,r6 = s6*0.2,r7 = s7*0.25,r8 = s8*0.15;
                    double cgpa = r1 + r2 +r3 +r4 +r5 +r6 +r7 +r8;
                    double ans = (double) Math.round(cgpa * 100) / 100;//round figure the decimal points
                    tv.setText("Your CGPA is :" + ans);
                }

            }
            private boolean MaxValid(){
                String F1 = S1.getText().toString().trim();
                String F2 = S2.getText().toString().trim();
                String F3 = S3.getText().toString().trim();
                String F4 = S4.getText().toString().trim();
                String F5 = S5.getText().toString().trim();
                String F6 = S6.getText().toString().trim();
                String F7 = S7.getText().toString().trim();
                String F8 = S8.getText().toString().trim();
                double s1 = F1.isEmpty() ? 0.0 : Double.parseDouble(F1);
                double s2 = F2.isEmpty() ? 0.0 : Double.parseDouble(F2);
                double s3 = F3.isEmpty() ? 0.0 : Double.parseDouble(F3);
                double s4 = F4.isEmpty() ? 0.0 : Double.parseDouble(F4);
                double s5 = F5.isEmpty() ? 0.0 : Double.parseDouble(F5);
                double s6 = F6.isEmpty() ? 0.0 : Double.parseDouble(F6);
                double s7 = F7.isEmpty() ? 0.0 : Double.parseDouble(F7);
                double s8 = F8.isEmpty() ? 0.0 : Double.parseDouble(F8);

                if (s1 > 4) {
                    S1.setError("Invalid GPA value");
                    return false;
                }
                if (s2 > 4) {
                    S2.setError("Invalid GPA value");
                    return false;
                }
                if (s3 > 4) {
                    S3.setError("Invalid GPA value");
                    return false;
                }
                if (s4 > 4) {
                    S4.setError("Invalid GPA value");
                    return false;
                }
                if (s5 > 4) {
                    S5.setError("Invalid GPA value");
                    return false;
                }
                if (s6 > 4) {
                    S6.setError("Invalid GPA value");
                    return false;
                }
                if (s7 > 4) {
                    S7.setError("Invalid GPA value");
                    return false;
                }
                if (s8 > 4) {
                    S8.setError("Invalid GPA value");
                    return false;
                }


                //check failed

                if (s1 < 2) {
                    S1.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s2 < 2) {
                    S2.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s3 < 2) {
                    S3.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s4 < 2) {
                    S4.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s5 < 2) {
                    S5.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s6 < 2) {
                    S6.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s7 < 2) {
                    S7.setError("You Have Failed In This Semester");
                    return false;
                }
                if (s8 < 2) {
                    S8.setError("You Have Failed In This Semester");
                    return false;
                }
                return true;
            }

            private boolean CheckAllFields() { //executing the validation function
                if(S1.length() == 0 ){
                    S1.setError("This field is required");
                    return false;
                }
                if(S2.length() == 0 ){
                    S2.setError("This field is required");
                    return false;
                }
                if(S3.length() == 0 ){
                    S3.setError("This field is required");
                    return false;
                }
                if(S4.length() == 0 ){
                    S4.setError("This field is required");
                    return false;
                }
                if(S5.length() == 0 ){
                    S5.setError("This field is required");
                    return false;
                }
                if(S6.length() == 0 ){
                    S6.setError("This field is required");
                    return false;
                }
                if(S7.length() == 0 ){
                    S7.setError("This field is required");
                    return false;
                }
                if(S8.length() == 0 ){
                    S8.setError("This field is required");
                    return false;
                }

                return true;
            }
        });
        grade.setOnClickListener(view ->{
            String F1 = S1.getText().toString().trim();
            String F2 = S2.getText().toString().trim();
            String F3 = S3.getText().toString().trim();
            String F4 = S4.getText().toString().trim();
            String F5 = S5.getText().toString().trim();
            String F6 = S6.getText().toString().trim();
            String F7 = S7.getText().toString().trim();
            String F8 = S8.getText().toString().trim();
            double s1 = F1.isEmpty() ? 0.0 : Double.parseDouble(F1);
            double s2 = F2.isEmpty() ? 0.0 : Double.parseDouble(F2);
            double s3 = F3.isEmpty() ? 0.0 : Double.parseDouble(F3);
            double s4 = F4.isEmpty() ? 0.0 : Double.parseDouble(F4);
            double s5 = F5.isEmpty() ? 0.0 : Double.parseDouble(F5);
            double s6 = F6.isEmpty() ? 0.0 : Double.parseDouble(F6);
            double s7 = F7.isEmpty() ? 0.0 : Double.parseDouble(F7);
            double s8 = F8.isEmpty() ? 0.0 : Double.parseDouble(F8);

            if(s1<=4 && s2<=4 && s3<=4 && s4<=4 && s5<=4 && s6<=4 && s7<=4 && s8<=4){
                if(s1==4) {                         //SET1
                    g1.setText("A+");
                }
                if(s1<4) {
                    g1.setText("A");
                }

                if(s1<3.75) {
                    g1.setText("A-");
                }
                if(s1<3.5) {
                    g1.setText("B+");
                }
                if(s1<3.25) {
                    g1.setText("B");
                }
                if(s1<3) {
                    g1.setText("B-");
                }
                if(s1<2.75) {
                    g1.setText("C+");
                }
                if(s1<2.50) {
                    g1.setText("C");
                }
                if(s1<2.25) {
                    g1.setText("D");
                }
                if(s1<2) {
                    g1.setText("F");
                }

                if(s2>=4) {                         //SET2
                    g2.setText("A+");
                }
                if(s2<4) {
                    g2.setText("A");
                }

                if(s2<3.75) {
                    g2.setText("A-");
                }
                if(s2<3.5) {
                    g2.setText("B+");
                }
                if(s2<3.25) {
                    g2.setText("B");
                }
                if(s2<3) {
                    g2.setText("B-");
                }
                if(s2<2.75) {
                    g2.setText("C+");
                }
                if(s2<2.50) {
                    g2.setText("C");
                }
                if(s2<2.25) {
                    g2.setText("D");
                }
                if(s2<2) {
                    g2.setText("F");
                }

                if(s3>=4) {                         //SET3
                    g3.setText("A+");
                }
                if(s3<4) {
                    g3.setText("A");
                }

                if(s3<3.75) {
                    g3.setText("A-");
                }
                if(s3<3.5) {
                    g3.setText("B+");
                }
                if(s3<3.25) {
                    g3.setText("B");
                }
                if(s3<3) {
                    g3.setText("B-");
                }
                if(s3<2.75) {
                    g3.setText("C+");
                }
                if(s3<2.50) {
                    g3.setText("C");
                }
                if(s3<2.25) {
                    g3.setText("D");
                }
                if(s3<2) {
                    g3.setText("F");
                }

                if(s4>=4) {                         //SET4
                    g4.setText("A+");
                }
                if(s4<4) {
                    g4.setText("A");
                }

                if(s4<3.75) {
                    g4.setText("A-");
                }
                if(s4<3.5) {
                    g4.setText("B+");
                }
                if(s4<3.25) {
                    g4.setText("B");
                }
                if(s4<3) {
                    g4.setText("B-");
                }
                if(s4<2.75) {
                    g4.setText("C+");
                }
                if(s4<2.50) {
                    g4.setText("C");
                }
                if(s4<2.25) {
                    g4.setText("D");
                }
                if(s4<2) {
                    g4.setText("F");
                }

                if(s5>=4) {                         //SET5
                    g5.setText("A+");
                }
                if(s5<4) {
                    g5.setText("A");
                }

                if(s5<3.75) {
                    g5.setText("A-");
                }
                if(s5<3.5) {
                    g5.setText("B+");
                }
                if(s5<3.25) {
                    g5.setText("B");
                }
                if(s5<3) {
                    g5.setText("B-");
                }
                if(s5<2.75) {
                    g5.setText("C+");
                }
                if(s5<2.50) {
                    g5.setText("C");
                }
                if(s5<2.25) {
                    g5.setText("D");
                }
                if(s5<2) {
                    g5.setText("F");
                }

                if(s6>=4) {                         //SET6
                    g6.setText("A+");
                }
                if(s6<4) {
                    g6.setText("A");
                }

                if(s6<3.75) {
                    g6.setText("A-");
                }
                if(s6<3.5) {
                    g6.setText("B+");
                }
                if(s6<3.25) {
                    g6.setText("B");
                }
                if(s6<3) {
                    g6.setText("B-");
                }
                if(s6<2.75) {
                    g6.setText("C+");
                }
                if(s6<2.50) {
                    g6.setText("C");
                }
                if(s6<2.25) {
                    g6.setText("D");
                }
                if(s6<2) {
                    g6.setText("F");
                }

                if(s7>=4) {                         //SET7
                    g7.setText("A+");
                }
                if(s7<4) {
                    g7.setText("A");
                }

                if(s7<3.75) {
                    g7.setText("A-");
                }
                if(s7<3.5) {
                    g7.setText("B+");
                }
                if(s7<3.25) {
                    g7.setText("B");
                }
                if(s7<3) {
                    g7.setText("B-");
                }
                if(s7<2.75) {
                    g7.setText("C+");
                }
                if(s7<2.50) {
                    g7.setText("C");
                }
                if(s7<2.25) {
                    g7.setText("D");
                }
                if(s7<2) {
                    g7.setText("F");
                }

                if(s8>=4) {                         //SET8
                    g8.setText("A+");
                }
                if(s8<4) {
                    g8.setText("A");
                }

                if(s8<3.75) {
                    g8.setText("A-");
                }
                if(s8<3.5) {
                    g8.setText("B+");
                }
                if(s8<3.25) {
                    g8.setText("B");
                }
                if(s8<3) {
                    g8.setText("B-");
                }
                if(s8<2.75) {
                    g8.setText("C+");
                }
                if(s8<2.50) {
                    g8.setText("C");
                }
                if(s8<2.25) {
                    g8.setText("D");
                }
                if(s8<2) {
                    g8.setText("F");
                }
            }
        });
        resetButton.setOnClickListener(view -> { //executing reset function
            S1.setText("");
            S2.setText("");
            S3.setText("");
            S4.setText("");
            S5.setText("");
            S6.setText("");
            S7.setText("");
            S8.setText("");

            g1.setText("");
            g2.setText("");
            g3.setText("");
            g4.setText("");
            g5.setText("");
            g6.setText("");
            g7.setText("");
            g8.setText("");
        });
    }
}


//end of the code
