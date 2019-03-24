package com.example.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonName = findViewById(R.id.botao_nome);
        final TextView textNomeCompleto = findViewById(R.id.nome_completo);
        final EditText textNome = findViewById(R.id.nome_usuario);
        final EditText textSobrenome = findViewById(R.id.sobrenome_usuario);

        buttonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNomeCompleto.setText(textNome.getText() + " " + textSobrenome.getText());
            }
        });

    }
}
