package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;

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


    }
}