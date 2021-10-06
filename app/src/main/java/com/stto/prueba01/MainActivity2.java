package com.stto.prueba01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Masculino,Femenino;
    Button BTN2;

    TextView GIL,HOMBRES,MUJERES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            Masculino= (TextView) findViewById(R.id.HOMBRESITOS);
            Femenino=(TextView) findViewById(R.id.HOMBRESITOS);
            BTN2=(Button) findViewById(R.id.button2);

            //GIL=(TextView)findViewById(R.id.TOTALISIMO);
            //HOMBRES=(TextView)findViewById(R.id.HOMBRESITOS);
        //MUJERES=(TextView)findViewById(R.id.MUJERSITAS);


        //Bundle B=getIntent().getExtras();
        //  Integer cantMujeres=B.getInt("MUJER");
        //  Integer CantHombres=B.getInt("HOMBRE");
        //  Integer TOTAL =B.getInt("TOTAL");

        //  GIL.setText(""+TOTAL);
        //  MUJERES.setText(""+cantMujeres);
        //  HOMBRES.setText(""+CantHombres);



            BTN2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent I = new Intent(getApplicationContext(),MainActivity3.class);

                    startActivity(I);
                }
            });


    }
}