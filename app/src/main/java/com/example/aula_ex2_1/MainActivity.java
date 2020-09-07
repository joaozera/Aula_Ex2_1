package com.example.aula_ex2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_botao;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Ação:","OnCreate");

        btn_botao = (Button) findViewById(R.id.btn_botao);
        btn_botao.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_botao) {
            texto = findViewById(R.id.edgraus);
            Double graus = Double.parseDouble(texto.getText().toString().replace(",","."));
            Double F = ((graus * 9) + 32) / 5;
            Intent iTela = new Intent(MainActivity.this,FrmResult.class);
            iTela.putExtra("Far",F);
            startActivity(iTela);
            Log.d("Ação:", "Click");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ação:","OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Ação:","OnDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ação:","OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Ação:","OnPause");
    }
}

