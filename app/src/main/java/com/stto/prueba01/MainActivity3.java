package com.stto.prueba01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button Btn3;
    EditText edad;
    EditText nombrecito;
    String Genero;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Btn3=(Button) findViewById(R.id.button3);
        edad= (EditText) findViewById(R.id.Edad);
        nombrecito=(EditText) findViewById(R.id.Nombrecito);

        Btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Integer cantMujeres=0,CantHombres=0;
                 if(nombrecito.getText().toString().isEmpty()==true)
                {
                    Toast.makeText(getApplicationContext(), "Complete Todo", Toast.LENGTH_SHORT).show();
                }
                if(edad.getText().toString().isEmpty()==true)
                {
                    Toast.makeText(getApplicationContext(), "Complete Todo", Toast.LENGTH_SHORT).show();
                }
                else  {

                    if (Genero.equals("Hombre")){
                        CantHombres=CantHombres+1;
                    }
                    if (Genero.equals("Mujer")){
                        cantMujeres=cantMujeres+1;
                    }
                    else {
                        AlertDialog.Builder ALERTA = new AlertDialog.Builder(MainActivity3.this);
                        ALERTA.setTitle("ATENCION")
                                .setMessage("¿ESTA SEGURO DE CONTINUAR'")
                                .setCancelable(false)
                                .setPositiveButton("SI", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Intent I = new Intent(getApplicationContext(), MainActivity2.class);
                                        startActivity(I);
                                    }
                                })
                                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.cancel();
                                    }
                                });
                        AlertDialog titulo = ALERTA.create();
                        titulo.setTitle("ATENCION");
                        titulo.show();

                    }



                }


            }
        });

    }
}