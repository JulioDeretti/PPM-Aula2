package com.hub.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity{
    int lContador = 0;
    Random randomico = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        button.setText("Yametekudasai");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b  = (Button) view;

                TextView dadosInicial = findViewById(R.id.editTextNumber2);
                TextView dadosFinal   = findViewById(R.id.editTextNumber);

                int iInicial = Integer.parseInt(dadosInicial.getText().toString());
                int iFinal   = Integer.parseInt(dadosFinal.getText().toString());

                textView.setText(Integer.toString(randomico.nextInt(iFinal - iInicial) + iInicial));
            }
        });
    }
}