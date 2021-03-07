package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public TextView mensagemDaOutraTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mensagemDaOutraTela = findViewById(R.id.textView);
        Intent intentRecebedora = getIntent();

        Bundle parametros = intentRecebedora.getExtras();

        if(parametros != null){
            String mensagem = parametros.getString("chave_mensagem");
            mensagemDaOutraTela.setText(mensagem);
        }

    }
}