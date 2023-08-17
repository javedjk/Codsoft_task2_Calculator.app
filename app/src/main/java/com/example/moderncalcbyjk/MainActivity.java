package com.example.moderncalcbyjk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    ImageView btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    ImageView btnadd, btnsub, btnmul, btndiv, btndot, btnbackspace, btnequal, btnmode, btnac, btnplusminus;
    TextView inputTxt, outPuttxt;
    String data;
   // private static final int MAX_DIGITS = 30;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast.makeText(this, "This app is developed by Javed with lots of Love", Toast.LENGTH_SHORT).show();

        //Giving ID to all created buttons and TextViews

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);


        btnadd = findViewById(R.id.btn_add);
        btnsub = findViewById(R.id.btn_sub);
        btnmul = findViewById(R.id.btn_multiplication);
        btndiv = findViewById(R.id.btn_div);
        btndot = findViewById(R.id.btn_dot);
        btnbackspace = findViewById(R.id.btn_backspace);
        btnequal = findViewById(R.id.btn_equal);
        btnmode = findViewById(R.id.btn_module);
        btnac = findViewById(R.id.btn_ac);
        btnplusminus = findViewById(R.id.btn_plusminus);


        inputTxt = findViewById(R.id.inputTxt);
        outPuttxt = findViewById(R.id.outPuttxt);


        //Setting onClickListener for all buttons...


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                    inputTxt.setText(data + "9");
            }
        });



        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (data.length() > 0 && isOperator(data.charAt(data.length() - 1))) {
                    data = data.substring(0, data.length() - 1); // Remove the last operator
                }
                inputTxt.setText(data + "+");
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (data.length() > 0 && isOperator(data.charAt(data.length() - 1))) {
                    data = data.substring(0, data.length() - 1); // Remove the last operator
                }
                inputTxt.setText(data + "-");
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (data.length() > 0 && isOperator(data.charAt(data.length() - 1))) {
                    data = data.substring(0, data.length() - 1); // Remove the last operator
                }
                inputTxt.setText(data + "×");
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (data.length() > 0 && isOperator(data.charAt(data.length() - 1))) {
                    data = data.substring(0, data.length() - 1); // Remove the last operator
                }
                inputTxt.setText(data + "÷");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (data.length() > 0 && isOperator(data.charAt(data.length() - 1))) {
                    data = data.substring(0, data.length() - 1); // Remove the last operator
                }
                    inputTxt.setText(data + ".");
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                inputTxt.setText("");
                outPuttxt.setText("");
            }
        });

        btnmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (data.length() > 0 && isOperator(data.charAt(data.length() - 1))) {
                    data = data.substring(0, data.length() - 1); // Remove the last operator
                }
                inputTxt.setText(data + "%");
            }
        });

        btnplusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!data.isEmpty() && !data.equals("0")) {
                    if (data.startsWith("-")) {
                        inputTxt.setText(data.substring(1));
                    } else {
                        inputTxt.setText("-" + data);
                    }
                }
            }
        });

        btnbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();
                if (!data.isEmpty()) {
                    inputTxt.setText(data.substring(0, data.length() - 1));
                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputTxt.getText().toString();

                data=data.replaceAll("×","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult="";

                Scriptable scriptable=rhino.initStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"Javsscript",1,null).toString();

                outPuttxt.setText(finalResult);
                Context.exit();
            }
        });

    }
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '×' || c == '÷' || c == '%' || c == '.';
    }

}