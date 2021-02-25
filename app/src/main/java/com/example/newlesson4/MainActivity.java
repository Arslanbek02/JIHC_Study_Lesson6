package com.example.newlesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button9, button8, button7, button6, button5, button4, button3, button2, button1, button0;
    TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button9 = findViewById(R.id.btn9);
        button8 = findViewById(R.id.btn8);
        button7 = findViewById(R.id.btn7);
        button6 = findViewById(R.id.btn6);
        button5 = findViewById(R.id.btn5);
        button4 = findViewById(R.id.btn4);
        button3 = findViewById(R.id.btn3);
        button2 = findViewById(R.id.btn2);
        button1 = findViewById(R.id.btn1);
        button0 = findViewById(R.id.btn0);

        num = findViewById(R.id.num);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('9');
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('8');
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('7');
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('6');
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('5');
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('4');
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('3');
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('2');
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('1');
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num.setText('0');
            }
        });
    }
}