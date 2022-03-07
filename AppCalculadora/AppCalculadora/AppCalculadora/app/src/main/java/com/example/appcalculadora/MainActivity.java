package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtV1, edtV2, edtResp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtV1 = (EditText) findViewById(R.id.editValor1);
        edtV2 = (EditText) findViewById(R.id.editValor2);
        edtResp = (EditText) findViewById(R.id.editResultado);

    }
    public void somar(View v){
        double x, y, r;

        x = Double.parseDouble(edtV1.getText().toString());
        y = Double.parseDouble(edtV1.getText().toString());
        r = x + y;
        edtResp.setText(String.valueOf(r));
    }

    public void subtrair(View v){
        double x, y, r;

        x = Double.parseDouble(edtV1.getText().toString());
        y = Double.parseDouble(edtV1.getText().toString());
        r = x - y;
        edtResp.setText(String.valueOf(r));
    }

    public void multiplicar(View v){
        double x, y, r;

        x = Double.parseDouble(edtV1.getText().toString());
        y = Double.parseDouble(edtV1.getText().toString());
        r = x * y;
        edtResp.setText(String.valueOf(r));
    }

    public void dividir(View v){
        double x, y, r;

        x = Double.parseDouble(edtV1.getText().toString());
        y = Double.parseDouble(edtV1.getText().toString());
        r = x / y;
        edtResp.setText(String.valueOf(r));
    }
}