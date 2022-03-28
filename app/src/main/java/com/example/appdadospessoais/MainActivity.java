package com.example.appdadospessoais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_nome;
    EditText edt_morada;
    EditText edt_telefone;
    EditText edt_email;
    EditText edt_genero;
    Button btn_transportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nome = findViewById(R.id.edt_nome);
        edt_morada = findViewById(R.id.edt_morada);
        edt_telefone = findViewById(R.id.edt_telemovel);
        edt_email = findViewById(R.id.edt_email);
        edt_genero = findViewById(R.id.edt_sexo);
        btn_transportar = findViewById(R.id.btn_transportar);

        btn_transportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TelaApresentacao.class);
                intent.putExtra("nome",     edt_nome.getText().toString());
                intent.putExtra("morada",   edt_morada.getText().toString());
                intent.putExtra("telefone", edt_telefone.getText().toString());
                intent.putExtra("email",    edt_email.getText().toString());
                intent.putExtra("genero",   edt_genero.getText().toString());
                startActivity(intent);
            }
        });

    }
}