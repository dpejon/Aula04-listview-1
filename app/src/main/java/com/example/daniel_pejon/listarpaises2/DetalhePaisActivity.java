package com.example.daniel_pejon.listarpaises2;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.daniel_pejon.listarpaises2.Pais;
import com.example.daniel_pejon.listarpaises2.R;

public class DetalhePaisActivity extends AppCompatActivity {
    /**
     * Created by daniel_pejon on 28/03/2018.
     * RA 816114225
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_pais);
        TextView txtPais = (TextView)findViewById(R.id.txtPais);
        Intent intent = getIntent();
        Pais pais = (Pais)intent.getSerializableExtra(ListaPaisesActivity.PAIS);
        txtPais.setText(pais.toString());
    }
}
