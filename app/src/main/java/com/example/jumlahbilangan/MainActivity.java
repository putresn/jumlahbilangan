package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText bil1 = null;
    private EditText bil2 = null;
    private EditText jumlah = null;
    private Button btnhasil = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initeEvent();
    }

    private void initUI() {
        bil1 = (EditText) findViewById(R.id.edt_bilA);
        bil2 = (EditText) findViewById(R.id.edt_bilB);
        jumlah = (EditText) findViewById(R.id.edt_hasil);
        btnhasil = (Button) findViewById(R.id.btn_hitung);

    }

    private void initeEvent() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");
    }
}

