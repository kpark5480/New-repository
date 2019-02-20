package org.westada.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number = (EditText) findViewById(R.id.numberEditText);
                EditText number2 = (EditText) findViewById(R.id.secondnumberEditText);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(number.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int results = num1 + num2;
                result.setText(results + "");
            }
        });
        Button div = (Button) findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number = (EditText) findViewById(R.id.numberEditText);
                EditText number2 = (EditText) findViewById(R.id.secondnumberEditText);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(number.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int results = num1 / num2;
                result.setText(results + "");
            }
        });
        Button sub = (Button) findViewById(R.id.sub);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number = (EditText) findViewById(R.id.numberEditText);
                EditText number2 = (EditText) findViewById(R.id.secondnumberEditText);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(number.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int results = num1 - num2;
                result.setText(results + "");
            }
        });
        Button mult = (Button) findViewById(R.id.mult);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number = (EditText) findViewById(R.id.numberEditText);
                EditText number2 = (EditText) findViewById(R.id.secondnumberEditText);
                TextView result = (TextView) findViewById(R.id.textView);
                int num1 = Integer.parseInt(number.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int results = num1 * num2;
                result.setText(results + "");
            }
        });


    }
}
