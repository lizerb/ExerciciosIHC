package com.example.atividade1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstNumber;
    private TextView secondNumber;
    private TextView novo;
    private Button btnSum;
    private TextView result_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        btnSum = findViewById(R.id.btnSum);
        result_1 = findViewById(R.id.result);

        btnSum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int first = Integer.parseInt(firstNumber.getText().toString());
                int second = Integer.parseInt(secondNumber.getText().toString());
                int result = first + second;
                result_1.setText("RESULT: " + result);
            }
        });
    }
}