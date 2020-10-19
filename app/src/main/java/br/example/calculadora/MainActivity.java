package br.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float valor1, valor2;
    String operacao = "null";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adicionarNumero(View view) {

        String numero = ((TextView) view).getText().toString();
        TextView dados = ((TextView) findViewById(R.id.editTextNumberDecimal));
        dados.setText(dados.getText() + numero);
    }

    public void limpa(View view) {

        TextView resultado = ((TextView) findViewById(R.id.editTextNumberDecimal));
        resultado.setText("");
        valor1 = 0f;
        valor2 = 0f;
    }

    public void igual(View view) {
        TextView resultado = ((TextView) findViewById(R.id.editTextNumberDecimal));

        if (!resultado.getText().toString().equals(null) && !resultado.getText().toString().equals("")  && !resultado.getText().toString().equals(".")) {
            valor2 = Float.valueOf(resultado.getText().toString() + "f");
            if (operacao.equals("+")) {
                resultado.setText(Float.toString(valor1 + valor2));
            }
            if (operacao.equals("-")) {
                resultado.setText(Float.toString(valor1 - valor2));
            }
            if (operacao.equals("/")) {
                if (valor2 == 0) {
                    resultado.setText("Não existe");
                } else {
                    resultado.setText(Float.toString(valor1 / valor2));
                }

            }
            if (operacao.equals("*")) {
                resultado.setText(Float.toString(valor1 * valor2));
            }
        }

    }


    public void adicao(View view) {
        operacao = ((TextView) view).getText().toString();
        String digitado;
        TextView resultado = ((TextView) findViewById(R.id.editTextNumberDecimal));
        if (resultado.getText().toString().equals(null) || resultado.getText().toString().equals("")) {
            digitado = "0" + "f";
        } else {
            digitado = resultado.getText().toString() + "f";
            valor1 = Float.parseFloat(digitado);
            resultado.setText(null);

        }


    }

    public void subtracao(View view) {
        operacao = ((TextView) view).getText().toString();
        String digitado;
        TextView resultado = ((TextView) findViewById(R.id.editTextNumberDecimal));
        if (resultado.getText().toString().equals(null) || resultado.getText().toString().equals("")) {
            digitado =  "0" + "f";
        } else {
            digitado = resultado.getText().toString() + "f";
            valor1 = Float.parseFloat(digitado);
            resultado.setText(null);

        }


    }

    public void divisao(View view) {
        operacao = ((TextView) view).getText().toString();
        String digitado;
        TextView resultado = ((TextView) findViewById(R.id.editTextNumberDecimal));
        if (resultado.getText().toString().equals(null) || resultado.getText().toString().equals("")) {
            digitado =  "0" + "f";
        } else {
            digitado = resultado.getText().toString() + "f";
            valor1 = Float.parseFloat(digitado);
            resultado.setText(null);

        };



    }

    public void multiplicacao(View view) {
        operacao = ((TextView) view).getText().toString();
        String digitado;
        TextView resultado = ((TextView) findViewById(R.id.editTextNumberDecimal));
        if (resultado.getText().toString().equals(null) || resultado.getText().toString().equals("")) {
            digitado =  "0" + "f";
        } else {
            digitado = resultado.getText().toString() + "f";
            valor1 = Float.parseFloat(digitado);
            resultado.setText(null);

        };


    }


}


