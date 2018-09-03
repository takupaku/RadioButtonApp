package com.example.takwa.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.result);
//        radioButton=findViewById(R.id.");
    }

    public void checkBtn(View view) {
        int id=radioGroup.getCheckedRadioButtonId();
        if (id==-1){
            Toast.makeText(this, "Please select a country", Toast.LENGTH_SHORT).show();
        }
        else{
            radioButton = findViewById(id);
            String country= radioButton.getText().toString();
            textView.setText("you are from "+country);
        }

    }
}
