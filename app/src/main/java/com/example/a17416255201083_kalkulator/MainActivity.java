package com.example.a17416255201083_kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText bil1, bil2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = findViewById(R.id.txtBil1);
        bil2 = findViewById(R.id.txtBil2);

        hasil = findViewById(R.id.txtHasil);
    }

    public void tambah(View view) {
        double bill1 = Double.parseDouble(bil1.getText().toString());
        double bill2 = Double.parseDouble(bil2.getText().toString());

        hasil.setText(Double.toString(bill1+bill2));
    }

    public void kurang(View view) {
        double bill1 = Double.parseDouble(bil1.getText().toString());
        double bill2 = Double.parseDouble(bil2.getText().toString());

        hasil.setText(Double.toString(bill1-bill2));
    }

    public void kali(View view) {
        double bill1 = Double.parseDouble(bil1.getText().toString());
        double bill2 = Double.parseDouble(bil2.getText().toString());

        hasil.setText(Double.toString(bill1*bill2));
    }

    public void bagi(View view) {
        double bill1 = Double.parseDouble(bil1.getText().toString());
        double bill2 = Double.parseDouble(bil2.getText().toString());

        hasil.setText(Double.toString(bill1/bill2));
    }
}
