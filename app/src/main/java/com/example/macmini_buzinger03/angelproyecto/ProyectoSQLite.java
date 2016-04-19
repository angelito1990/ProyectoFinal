package com.example.macmini_buzinger03.angelproyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by macmini-buzinger03 on 18/4/16.
 */
public class ProyectoSQLite extends SQLiteOpenHelper {

    String sentenciaSQL = "CREATE TABLE TBRegistro (nombre TEXT, apellidos TEXT, nacimiento DATE, email VARCHAR, password VARCHAR)";

    public ProyectoSQLite(RegistroActivity context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super((Context) context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL(sentenciaSQL);

        String sql = "INSERT INTO TBRegistro VALUES ('Angel', 'Gutierrez', '11/11/1990', 'a.gutierrezruisanchez@gmail.com', 'noviembre')";

        bd.execSQL(sql); //Ejecuta la sentencia SQL

    }

    @Override
    public void onUpgrade(SQLiteDatabase bd, int oldVersion, int newVersion) {
        //Se crea la nueva versión de la tabla
        bd.execSQL(sentenciaSQL);

    }
}
