package com.example.arciniega.proyecto02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Se declaran los valores de la suma
    EditText val1,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se asignan los valores de la suma
        val1 = (EditText) findViewById(R.id.editValor1);
        val2 = (EditText) findViewById(R.id.editValor2);

        //Se crea el boton de la suma
        Button btn = (Button)findViewById(R.id.btnCalcular);
        //Se declara el elemento en el que se mostrara el resultado
        final EditText res = (EditText)findViewById(R.id.editResultado);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Se crean los valores con los que se calculara la suma
                int num1 = Integer.valueOf(val1.getText().toString());
                int num2 = Integer.valueOf(val2.getText().toString());
                //Se realiza la suma en una variable creada
                int resultado = num1 + num2;
                //Se asigna el texto del resultado al campo indicado
                res.setText(""+resultado);
            }
        });
    }
}
