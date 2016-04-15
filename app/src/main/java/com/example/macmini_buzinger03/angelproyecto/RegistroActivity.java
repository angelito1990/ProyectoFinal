package com.example.macmini_buzinger03.angelproyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by macmini-buzinger03 on 15/4/16.
 */
public class RegistroActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button btnJoin = (Button) findViewById(R.id.register_btn_steptwo);
        Button btnUser = (Button) findViewById(R.id.tutorial_btn_user);


        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registro2();
            }
        });


    }

    public void registro2(){
        Intent mIntent = new Intent(RegistroActivity.this, RegistroActivity2.class);
        startActivity(mIntent);
    }
}
