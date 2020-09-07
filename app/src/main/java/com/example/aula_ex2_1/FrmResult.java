package com.example.aula_ex2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FrmResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView result = findViewById(R.id.textView2);
        Intent iTela = getIntent();
        result.setText(String.valueOf(iTela.getDoubleExtra("Far",0)));
    }
}