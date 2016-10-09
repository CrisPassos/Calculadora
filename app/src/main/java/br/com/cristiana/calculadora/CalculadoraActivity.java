package br.com.cristiana.calculadora;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    TextView number01;
    TextView number02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        number01 = (TextView) findViewById(R.id.txtNumber01);
        number02 = (TextView) findViewById(R.id.txtNumber02);

    }

    public void calcular(View v){

        double num_1 =   Double.valueOf(number01.getText().toString());
        double num_2 =   Double.valueOf(number02.getText().toString());

        double resultado = num_1 + num_2;

        /*
        Toast toast = Toast.makeText(this, "A soma é: "+ resultado, Toast.LENGTH_LONG);
        toast.show();
        */

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.app_result );
        alert.setMessage(String.valueOf(resultado));
        alert.setPositiveButton("OK", null);
        alert.show();

    }
}
