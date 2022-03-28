package com.example.appdadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TelaApresentacao extends AppCompatActivity {

    TextView txt_resultado;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_apresentacao);

        txt_resultado = findViewById(R.id.txt_resultado);
        intent = getIntent();

        String strNome = intent.getExtras().getString("nome").toString();
        String strMorada = intent.getExtras().getString("morada").toString();
        String strTelefone = intent.getExtras().getString("telefone").toString();
        String strEmail = intent.getExtras().getString("email").toString();
        String strGenero = intent.getExtras().getString("genero").toString();

        if (strGenero.equalsIgnoreCase("Masculino") || strGenero.equalsIgnoreCase("M")){
            txt_resultado.setText("O "+strNome + " mora na " + strMorada + " tem o telefone "+strTelefone
                    + " e o e-mail "+strEmail);
        }
        else if (strGenero.equalsIgnoreCase("Femenino") || strGenero.equalsIgnoreCase("F")){
            txt_resultado.setText("A "+strNome + " mora na " + strMorada + " tem o telefone "+strTelefone
                            + " e o e-mail "+strEmail);
        }

    }
}