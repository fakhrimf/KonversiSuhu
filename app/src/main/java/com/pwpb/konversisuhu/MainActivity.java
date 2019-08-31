package com.pwpb.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnKonversi;
    private EditText edtCelsius;
    private TextView tvKelvin, tvFahrenheit, tvReamur;

    private void initUI() {
        btnKonversi = findViewById(R.id.btnKonversi);
        edtCelsius = findViewById(R.id.edtCelcius);
        tvFahrenheit = findViewById(R.id.tvFahrenheit);
        tvKelvin = findViewById(R.id.tvKelvin);
        tvReamur = findViewById(R.id.tvReamur);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double C = Double.parseDouble(edtCelsius.getText().toString());
                Double F = (C * 9 / 5) + 32;
                Double K = C + 273.15;
                Double R = (F - 32) / 2.25;

                tvFahrenheit.setText("Fahrenheit = "+F+"°F");
                tvKelvin.setText("Kelvin = "+K+"K");
                tvReamur.setText("Reaumur = "+R+"°r");
            }
        });
    }
}
