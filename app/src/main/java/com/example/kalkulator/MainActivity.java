package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText PAD, LT;
    Button persegi, segitiga, lingkaran;
    TextView hasilLuas, hasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PAD=(EditText)findViewById(R.id.editTextPAD);
        LT =(EditText)findViewById(R.id.editTextLT);
        hasilLuas =(TextView)findViewById(R.id.textViewhasilLuas);
        hasilKeliling =(TextView)findViewById(R.id.textViewhasilKeliling);
        persegi =(Button)findViewById(R.id.buttonPersegi);
        segitiga =(Button)findViewById(R.id.buttonsegitiga);
        lingkaran =(Button)findViewById(R.id.buttonlingkaran);

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2,luas;
                bil1 =Double.valueOf(PAD.getText().toString().trim());
                bil2 =Double.valueOf(LT.getText().toString().trim());
                luas=(bil1 * bil2)/2;
                String luas1= String.valueOf(luas);
                hasilLuas.setText(luas1);

                double bilangan1,keliling;
                bilangan1=Double.valueOf(PAD.getText().toString().trim());
                keliling=(bilangan1+bilangan1+bilangan1);
                String keliling1= String.valueOf(keliling);
                hasilKeliling.setText(keliling1);
            }
        });

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1, bil2,luas;
                bil1 =Double.valueOf(PAD.getText().toString().trim());
                bil2 =Double.valueOf(LT.getText().toString().trim());
                luas=(bil1 * bil2);
                String luas1= String.valueOf(luas);
                hasilLuas.setText(luas1);

                double bilangan1,bilangan2,keliling;
                bilangan1=Double.valueOf(PAD.getText().toString().trim());
                bilangan2=Double.valueOf(LT.getText().toString().trim());
                keliling=(bilangan1+ bilangan2)*2;
                String keliling1= String.valueOf(keliling);
                hasilKeliling.setText(keliling1);
            }
        });

        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double bil1,jari,luas;
                bil1 =Double.valueOf(PAD.getText().toString().trim());
                jari= bil1 * 0.5;
                luas=Math.PI * Math.pow(jari,2);
                String luas1=String.valueOf(luas);
                hasilLuas.setText(luas1);

                double bilangan1,keliling;
                bilangan1=Double.valueOf(PAD.getText().toString().trim());
                keliling=Math.PI * bilangan1;
                String keliling1= String.valueOf(keliling);
                hasilKeliling.setText(keliling1);
            }
        });
    }
}