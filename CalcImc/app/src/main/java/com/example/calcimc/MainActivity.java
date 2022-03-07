package com.example.calcimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso, edtAltura, edtImc, edtSituacao;
    CheckBox chkIdade;
    RadioButton rbFeminino, rbMasculino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPeso = (EditText) findViewById(R.id.editPeso);
        edtAltura = (EditText) findViewById(R.id.editAltura);
        edtImc = (EditText) findViewById(R.id.editImc);
        edtSituacao = (EditText) findViewById(R.id.editSituacao);
        chkIdade = (CheckBox) findViewById(R.id.checkIdade);
        rbFeminino = (RadioButton) findViewById(R.id.radioFeminino);
        rbMasculino = (RadioButton) findViewById(R.id.radioMasculino);
    }

    public void calcularImc(View v) {
        double peso, altura, imc;
        String situacao = "";
        peso = Double.parseDouble(edtPeso.getText().toString());
        altura = Double.parseDouble(edtAltura.getText().toString());
        imc = peso / Math.pow(altura, 2);

        if (chkIdade.isChecked()) {
            // Maior 15 anos (Calcular)
            if (rbFeminino.isChecked()) {
                // Tabela Feminino
                if (imc < 19.1) {
                    situacao = "Abaixo do peso!";
                } else {
                    if (imc < 25.8) {
                        situacao = "No peso normal!";
                    } else {
                        if (imc < 27.3) {
                            situacao = "Marginalmente acima do peso!";
                        } else {
                            if (imc < 32.3) {
                                situacao = "Acima do peso ideal!";
                            } else {
                                situacao = "Obesa!";
                            }
                        }
                    }
                }
            } else {
                // Tabela Masculino
                if (imc < 20.7) {
                    situacao = "Abaixo do peso!";
                } else {
                    if (imc < 26.4) {
                        situacao = "No peso normal!";
                    } else {
                        if (imc < 27.8) {
                            situacao = "Marginalmente acima do peso!";
                        } else {
                            if (imc < 31.1) {
                                situacao = "Acima do peso ideal!";
                            } else {
                                situacao = "Obeso!";
                            }
                        }
                    }
                }
            }
        } else {
            //Menor de 16 anos (Nãocalcular)
            situacao = "Menor de 16 anos, Situação não avaliada!";
        }

        edtImc.setText(String.format("%.2f",imc));
        edtSituacao.setText(situacao);
    }
}