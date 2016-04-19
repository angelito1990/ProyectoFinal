package com.example.macmini_buzinger03.angelproyecto;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by macmini-buzinger03 on 15/4/16.
 */
public class RegistroActivity extends Activity {

    String nombre="";
    String apellidos="";
    String nacimiento="";
    String email="";
    String pass="";
    SQLiteDatabase bd;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button btnRegistro=(Button)findViewById(R.id.btnRegistro);

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //registro();

                Intent intent = new Intent(RegistroActivity.this, FormularioActivity.class);
                startActivity(intent);

            }


        });
    }


}
