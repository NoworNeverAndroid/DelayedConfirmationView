package com.example.nowor_000.confirmationactivitiy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class ConfirmacionActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        ImageButton aceptar = (ImageButton) findViewById(R.id.btnAceptar);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivityForResult(new Intent(ConfirmacionActivity.this, CuentaAtras.class), 9);

            }
        });

        ImageButton cancelar = (ImageButton) findViewById(R.id.btnCancelar);
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Accion cancelada", Toast.LENGTH_SHORT).show();
        } else if (resultCode == RESULT_OK) {
            Toast.makeText(this, "Acccion aceptada", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
