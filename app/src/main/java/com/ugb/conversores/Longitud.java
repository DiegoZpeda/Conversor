package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Longitud extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;
    conversorLongitud miConversor2 = new conversorLongitud();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);
        btn = findViewById(R.id.btnConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp = (TextView) findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(temp.getText().toString());

                spn = findViewById(R.id.spnde);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spna);
                int a = spn.getSelectedItemPosition();

                temp = findViewById(R.id.lblrespuesta);
                temp.setText("Respuesta: "+ miConversor2.convertir(0, de, a, cantidad));
            }
        });
    }
}
class conversorLongitud{
    double[][] valores3 = {

            {0.001, 1, 100, 1000, 1e+9, 0.000621371, 1.09361296, 3.28084, 39.3701, 0.000539957}//Longitud

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores3[opcion][a] / valores3[opcion][de] * cantidad;
    }
}