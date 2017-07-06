package com.example.pedmar.trocatelafoto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;


public class TrocasActivity extends AppCompatActivity {
    Button btnTela1, btnTela2, btnFoto1, btnFoto2;
    ImageView imgFoto;
    TextView txtinformacao;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }

    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_trocas);
        btnTela2 = (Button) findViewById(R.id.bttela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaFotos();
            }
        });
    }

    private void CarregarTelaFotos() {
        setContentView(R.layout.fotos);
        imgFoto = (ImageView) findViewById(R.id.imgFoto1) ;
        btnTela1 = (Button) findViewById(R.id.bttelaprincipal);

        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);
        txtinformacao = (TextView) findViewById(R.id.txtInformacao);

        btnTela1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });

        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFoto.setImageResource(R.drawable.foto1);
                txtinformacao.setText("Foto Android");
            }
        });

        btnFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFoto.setImageResource(R.drawable.foto2);
                txtinformacao.setText("Foto Apple");
            }
        });
    }












}
