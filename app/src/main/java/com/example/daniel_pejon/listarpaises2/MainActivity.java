package com.example.daniel_pejon.listarpaises2;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
/**
 * Created by daniel_pejon on 28/03/2018.
 * RA 816114225
 */
public class MainActivity extends AppCompatActivity {
    Spinner spinnerContinente;
    public static final String CHAVE = "br.usjt.daniel_pejon.listarpaises2.txtContinente";
    String continente = "Todos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.daniel_pejon.listarpaises2.R.layout.activity_main);
        spinnerContinente = (Spinner)findViewById(com.example.daniel_pejon.listarpaises2.R.id.spinnerContinente);
        spinnerContinente.setOnItemSelectedListener(new PaisSelecionado());
    }
    public void listarPaises(View view){
        Intent intent = new Intent(this, ListaPaisesActivity.class);

        intent.putExtra(CHAVE, continente);
        startActivity(intent);
    }
    private class PaisSelecionado implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            continente = (String) parent.getItemAtPosition(position);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}
