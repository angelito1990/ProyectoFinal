package com.example.macmini_buzinger03.angelproyecto;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends ActionBarActivity {

    private DrawerLayout drawerLayout;
    private FrameLayout mainLayout;
    private ListView menuLateral;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();
        if(id== android.R.id.home){
            if(drawerLayout.isDrawerOpen(menuLateral)){

            }else{
                drawerLayout.openDrawer(menuLateral);
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.app.ActionBar aBar = getSupportActionBar();
        aBar.setHomeButtonEnabled(true);
        aBar.setDisplayHomeAsUpEnabled(true);


        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);
        mainLayout=(FrameLayout)findViewById(R.id.mainLayout);
        menuLateral=(ListView)findViewById(R.id.menuLateral);

        String[] opciones={"Opcion 1", "Opcion 2","Opcion 3","Opcion 4", "Opcion 5"};

        ArrayAdapter adp = new ArrayAdapter<String>(HomeActivity.this, android.R.layout.simple_list_item_1, opciones);
        menuLateral.setAdapter(adp);

        menuLateral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String opcSeleccionado= (String) menuLateral.getAdapter().getItem(position);
                Toast.makeText(HomeActivity.this, opcSeleccionado, Toast.LENGTH_SHORT).show();
                drawerLayout.closeDrawer(menuLateral);


            }
        });
    }
}
