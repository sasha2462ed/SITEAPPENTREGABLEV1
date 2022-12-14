package com.example.siteapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.siteapp.databinding.ActivityInterfazDependientesBinding;

public class interfaz_dependientes extends AppCompatActivity {
    private ActivityInterfazDependientesBinding v06;
    SharedPreferences admin;
    Context ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v06 = ActivityInterfazDependientesBinding.inflate(getLayoutInflater());
        View view = v06.getRoot();
        setContentView(view);


        admin=getApplicationContext().getSharedPreferences("myApp",MODE_PRIVATE);
        ct=view.getContext();
        SharedPreferences admin=getApplicationContext().getSharedPreferences("x",MODE_PRIVATE);


        v06.btndep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor data=admin.edit();
                data.remove("tip_usuario");
                data.putString("tip_usuario","T");
                data.apply();

                Intent intent = new Intent( getApplicationContext(),interfaz_tecnico.class);
                startActivity(intent);
            }
        });

        v06.btndep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor data=admin.edit();
                data.remove("tip_usuario");
                data.putString("tip_usuario","C");
                data.apply();

                Intent intent = new Intent( getApplicationContext(),interfaz_usuario.class);
                startActivity(intent);

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}