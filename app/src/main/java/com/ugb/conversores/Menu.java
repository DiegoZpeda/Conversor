package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
Button btnmon, btnmasa, btnvol, btnlong, btnalma, btntiemp, btntdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
      btnmon=findViewById(R.id.btnmon);
      btnmon.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),MainActivity.class));
          }
      });
      btnalma=findViewById(R.id.btnalma);
      btnalma.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),Almacenamiento.class));
          }
      });
      btnvol=findViewById(R.id.btnvol);
      btnvol.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),Volumen.class));
          }
      });
      btnlong=findViewById(R.id.btnlong);
      btnlong.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity((new Intent(getApplicationContext(),Longitud.class)));
          }
      });
      btntiemp=findViewById(R.id.btntiemp);
      btntiemp.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),Tiempo.class));
          }
      });
      btntdd=findViewById(R.id.btntdd);
      btntdd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),Tranferencia_datos.class));
          }
      });

      btnmasa=findViewById(R.id.btnmasa);
      btnmasa.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(getApplicationContext(),Masa.class));
          }
      });


    }
}