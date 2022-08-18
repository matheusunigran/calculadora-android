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

    public double valor1, valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmr1 = findViewById(R.id.num1);
        nmr2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.textView4);

    }
    public boolean verificar(){
        String s1 = nmr1.getText().toString();
        String s2 = nmr2.getText().toString();
        if ((s1.equals(null) || s2.equals(null))
                || (s1.equals("") || s2.equals(""))) {
            resultado.setText("Informe os números corretamente");
            return false;
        } else{
            valor1 = Double.parseDouble(nmr1.getText().toString());
            valor2 = Double.parseDouble(nmr2.getText().toString());
            return true;
        }
    }
    public void somar(View view){
        if(verificar())
            resultado.setText(String.valueOf(valor1 + valor2));
    }
    public void subtrair(View view){
        if(verificar())
            resultado.setText(String.valueOf(valor1-valor2));
    }
    public void multiplicar(View view){
        if(verificar())
            resultado.setText(String.valueOf(valor1*valor2));
    }
    public void dividir(View view){
        if(verificar()){
            if(valor2 != 0)
                resultado.setText(String.valueOf(valor1/valor2));
            else{
                resultado.setText("Não é possível resolver uma divisão por 0");
            }
        }
    }
}