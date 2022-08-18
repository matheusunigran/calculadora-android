package br.unigran.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nmr1;
    private EditText nmr2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmr1 = findViewById(R.id.num1);
        nmr2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.textView4);
    }
    public void somar(View view){
        double valor1 = Double.parseDouble(nmr1.getText().toString());
        double valor2 = Double.parseDouble(nmr2.getText().toString());

        resultado.setText(String.valueOf(valor1+valor2));
    }
}