package com.example.macmini_buzinger03.angelproyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by macmini-buzinger03 on 15/4/16.
 */
public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJoin = (Button) findViewById(R.id.tutorial_btn_join);
        Button btnUser = (Button) findViewById(R.id.tutorial_btn_user);


        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registro();
            }
        });

    }

    public void registro(){
        Intent mIntent = new Intent(MainActivity.this, RegistroActivity.class);
        startActivity(mIntent);
    }
}
