package com.example.federico.controllodati;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class ActivityCentral extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    public void ImpostazioniClicked(MenuItem menuItem){
        Intent intent = new Intent(this,ActivitySettings.class);
        startActivity(intent);
    }

    public void EsciClicked(MenuItem menuItem){
        Intent intent = new Intent(this,ActivityLogin.class);
        startActivity(intent);
    }



}
