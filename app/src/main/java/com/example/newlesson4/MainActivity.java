package com.example.newlesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

        Button btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btn0;
        Button btnClear, btnPlusMinus;
        TextView tvNum;

        @Override
        protected void onCreate(Bundle savedIntanceState) {
            super.onCreate(savedIntanceState);
            setContentView(R.layout.activity_main);
            btn9 = findViewById(R.id.btn9);
            btn8 = findViewById(R.id.btn8);
            btn7 = findViewById(R.id.btn7);
            btn6 = findViewById(R.id.btn6);
            btn5 = findViewById(R.id.btn5);
            btn4 = findViewById(R.id.btn4);
            btn3 = findViewById(R.id.btn3);
            btn2 = findViewById(R.id.btn2);
            btn1 = findViewById(R.id.btn1);
            btn0 = findViewById(R.id.btn0);

            btnClear = findViewById(R.id.btnClear);
            btnPlusMinus = findViewById(R.id.btnPlusMinus);

            tvNum = findViewById(R.id.tv_num);

            View.OnClickListener buttonNumbers = new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    String previousNumber = tvNum.getText().toString();
                    String pressedNumber = "";
                    String finalResult = "";

                   switch (v.getId()){
                       case R.id.btn9:
                            pressedNumber = "9";
                           break;

                       case R.id.btn8:
                           pressedNumber = "8";
                           break;

                       case R.id.btn7:
                           pressedNumber = "7";
                           break;

                       case R.id.btn6:
                           pressedNumber = "6";
                           break;

                       case R.id.btn5:
                           pressedNumber = "5";
                           break;

                       case R.id.btn4:
                           pressedNumber = "4";
                           break;

                       case R.id.btn3:
                           pressedNumber = "3";
                           break;

                       case R.id.btn2:
                           pressedNumber = "2";
                           break;

                       case R.id.btn1:
                           pressedNumber = "1";
                           break;

                       case R.id.btn0:
                           pressedNumber = "0";
                           break;
                   }
                   if(!previousNumber.equals("0")) finalResult = previousNumber + pressedNumber;
                   else finalResult = pressedNumber;

                    tvNum.setText(finalResult);
                }
            };

            btn9.setOnClickListener(buttonNumbers);
            btn8.setOnClickListener(buttonNumbers);
            btn7.setOnClickListener(buttonNumbers);
            btn6.setOnClickListener(buttonNumbers);
            btn5.setOnClickListener(buttonNumbers);
            btn4.setOnClickListener(buttonNumbers);
            btn3.setOnClickListener(buttonNumbers);
            btn2.setOnClickListener(buttonNumbers);
            btn1.setOnClickListener(buttonNumbers);
            btn0.setOnClickListener(buttonNumbers);

            View.OnClickListener buttonClearPLusMinus = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()){
                        case R.id.btnClear:
                            tvNum.setText("0");
                            break;

                        case R.id.btnPlusMinus:
                            String numText = tvNum.getText().toString();
                            int num = Integer.parseInt(numText);

                            if(num > 0 ) tvNum.setText("-" + numText);

                            else {
                                num = num * (-1);
                                tvNum.setText(""+num);
                            }
                            break;
                    }
                }
            };
        btnClear.setOnClickListener(buttonClearPLusMinus);
        btnPlusMinus.setOnClickListener(buttonClearPLusMinus);
    }
}