package com.guptasonali.uipractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    public void buttonIsClicked(View buttonView){

//        int result = 5*7;
//        Log.i("OPERATION", result +"");

//        TextView text = findViewById(R.id.txt_view);
//        Log.i("TAG",text.getText().toString());

        EditText edtName = findViewById(R.id.edtName);
//        Log.i("NAME", edtName.getText().toString());

        EditText edtNum = findViewById(R.id.edtNum);
//        Log.i("NUM",edtNum.getText().toString());

        Toast.makeText(MainActivity.this,"Your Name : "
                +edtName.getText().toString() +"\n Your Number : "
                +edtNum.getText().toString(),Toast.LENGTH_LONG).show();

        ImageView imgView =findViewById(R.id.imageView);
        imgView.setImageResource(R.drawable.fog);


        /*Constraint Layout + Relative Layout
        + Linear Layout Vertical + Linear Layout Horizontal*/
//        Toast.makeText(MainActivity.this,
//                text.getText().toString(),
//                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonPressed(View buttonView){
        EditText petBornTextField = findViewById(R.id.year);
        int petAge = Calendar.getInstance().get(Calendar.YEAR)- Integer.parseInt(petBornTextField.getText().toString());
        TextView petAgeTextView = findViewById(R.id.output);
        petAgeTextView.setText(petAge +" ");

    }
}
