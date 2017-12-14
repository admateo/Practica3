package com.example.efcs.a3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int num1, num2, resultado;
    private EditText editText1, editText2;
    private TextView textView_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.numero1);
        editText2 = (EditText) findViewById(R.id.numero2);

        Button button_suma = (Button) findViewById(R.id.button_sumar);
        Button button_resta = (Button) findViewById(R.id.button_restar);
        Button button_multiplicar = (Button) findViewById(R.id.button_multiplicar);
        Button button_dividir = (Button) findViewById(R.id.button_dividir);

        textView_resultado = (TextView) findViewById(R.id.textView_resultado);

        button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                resultado = num1+num2;
                textView_resultado.setText(Integer.toString(resultado));
            }
        });

        button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                resultado = num1-num2;
                textView_resultado.setText(Integer.toString(resultado));
            }
        });

        button_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                resultado = num1*num2;
                textView_resultado.setText(Integer.toString(resultado));
            }
        });

        button_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Integer.parseInt(editText1.getText().toString());
                num2 = Integer.parseInt(editText2.getText().toString());
                resultado = num1/num2;
                textView_resultado.setText(Integer.toString(resultado));
            }
        });
    }


}
