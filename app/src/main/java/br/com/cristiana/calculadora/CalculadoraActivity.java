package br.com.cristiana.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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

        int num_1 =   Integer.parseInt(number01.getText().toString());
        int num_2 =   Integer.parseInt(number02.getText().toString());

        try {
            int resultado = num_1 + num_2;

            Toast toast = Toast.makeText(this, getString(R.string.app_sum) + resultado, Toast.LENGTH_LONG);
            toast.show();

        }catch(Exception e){
            Toast toast = Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
            toast.show();
        }

    }
}
