 package com.example.taruc.prac2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
     EditText editTextWeight;
     EditText editTextHeight;
     TextView textViewResult;
     ImageView imageViewResults;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = (TextView) findViewById(R.id.textViewResults);
        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        imageViewResults = (ImageView) findViewById(R.id.imageViewResults);
    }
 public void displayResult(View view){
    double result=0;
    double weight = Double.parseDouble(editTextWeight.getText().toString());
    double height = Double.parseDouble(editTextHeight.getText().toString());
     result = weight / (height*height);
    textViewResult.setText("BMI Result : "+String.format("%.2f",result));
     if(result>18.5 && result<25)
     {imageViewResults.setImageResource(R.drawable.normal);}
     else if(result<=18.5)
     {imageViewResults.setImageResource(R.drawable.under);}
     else if(result>=25)
     {imageViewResults.setImageResource(R.drawable.over);}
 }
 public void resetText (View view){
     textViewResult.setText("BMI Result :");
     editTextHeight.setText("");
     editTextWeight.setText("");
     imageViewResults.setImageResource(R.drawable.empty);
 }
 }