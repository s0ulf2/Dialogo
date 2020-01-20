package com.example.alertas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botao = findViewById(R.id.ID_Botao);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alerta = new AlertDialog.Builder(MainActivity.this);

                //Configura o titulo
                alerta.setTitle("Titulo da dialog");

                //Configura a mensagem
                alerta.setMessage("Mensagem amostra");

            }
        });

    }
}
