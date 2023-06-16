package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    EditText edit1;
    EditText edit2;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.textView);
        edit1=findViewById(R.id.editTextNumber);
        edit2=findViewById(R.id.editTextNumber2);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.length()>0 && edit2.length()>0){
                    int sum;
                    sum = Integer.parseInt(edit1.getText().toString()) + Integer.parseInt(edit2.getText().toString());
                    txt.setText("Answer="+Integer.toString(sum));
                }
            }
        });
    }
}