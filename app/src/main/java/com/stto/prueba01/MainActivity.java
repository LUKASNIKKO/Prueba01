package com.stto.prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText NOMBRE,Contrasena;
    Button BTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NOMBRE=(EditText)findViewById(R.id.txt_usuario);
        Contrasena=(EditText) findViewById(R.id.txt_contra);
        BTN=(Button) findViewById(R.id.button);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                String aj=NOMBRE.getText().toString();
                String ju=Contrasena.getText().toString();
                if((aj.equals("adm123"))&&(ju.equals("adm123")))
                {
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                }


            else {

                    Toast.makeText(getApplicationContext(), "Error de Usuario Y Contraseña", Toast.LENGTH_SHORT).show();

            }
            }
        });

    }
}