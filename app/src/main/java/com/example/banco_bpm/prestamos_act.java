package com.example.banco_bpm;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class prestamos_act extends AppCompatActivity {

    private Spinner espUser, espSaldo;
    private TextView tv;
    private Button btnDeuda, btnPrestamo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prestamos);

        espUser = (Spinner)findViewById(R.id.cliente_sp);
        espSaldo = (Spinner)findViewById(R.id.saldo_sp);
        tv = (TextView)findViewById(R.id.calculo_et);
        btnDeuda = (Button)findViewById(R.id.deuda_btn);
        btnPrestamo = (Button)findViewById(R.id.prestamo_btn);

        ArrayAdapter<String> ListaClientes = (ArrayAdapter<String>) getIntent().getSerializableExtra("listaclientes");
        ArrayAdapter<String> ListaPrestamos = (ArrayAdapter<String>) getIntent().getSerializableExtra("listaprestamos");

        //error con el spinner, no se como se implementaba xd
        espUser.setAdapter(ListaClientes);
        espSaldo.setAdapter(ListaPrestamos);
    }

    public void calcularDeuda(View v)
    {
        String usuario = espUser.getSelectedItem().toString();
        String saldo = espSaldo.getSelectedItem().toString();


    }
}
