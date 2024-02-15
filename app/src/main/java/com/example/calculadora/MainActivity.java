package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etvnum1;
    private EditText etvnum2;
    private Button btnCalcular;
    private TextView tvResultado;
    private RadioButton rbSoma;
    private RadioButton rbSubtracao;
    private RadioButton rbMultiplicacao;
    private RadioButton rbDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculadora calculo = new Calculadora();

        etvnum1 = findViewById(R.id.etvPrimeiroNumero);
        etvnum2 = findViewById(R.id.etvSegundoNumero);
        btnCalcular = findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvResultado);
        rbSoma = findViewById(R.id.rbSoma);
        rbSubtracao = findViewById(R.id.rbSubtracao);
        rbMultiplicacao = findViewById(R.id.rbMultiplicacao);
        rbDivisao = findViewById(R.id.rbDivisao);

        btnCalcular.setOnClickListener(v -> {
            StringBuilder resultado = new StringBuilder();
            Double num1 = Double.parseDouble(etvnum1.getText().toString());
            Double num2 = Double.parseDouble(etvnum2.getText().toString());
            if (rbSoma.isChecked()){
                resultado.append(calculo.soma(num1, num2));
            } else if (rbSubtracao.isChecked()) {
                resultado.append(calculo.subtracao(num1, num2));
            } else if (rbMultiplicacao.isChecked()) {
                resultado.append(calculo.multiplicacao(num1, num2));
            }else if (rbDivisao.isChecked()) {
                resultado.append(calculo.divisao(num1, num2));
            }else {
                resultado.append("Operação não encontrada!");
            }

            tvResultado.setText(resultado);

        });

    }
}