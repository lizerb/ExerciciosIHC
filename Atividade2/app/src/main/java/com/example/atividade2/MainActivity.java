package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView message;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = findViewById(R.id.message);
        btnSend = findViewById(R.id.button);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensagem = message.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                Bundle parametros = new Bundle();
                parametros.putString("chave_mensagem", mensagem);

                intent.putExtras(parametros);
                startActivity(intent);
            }
        });
    }
}