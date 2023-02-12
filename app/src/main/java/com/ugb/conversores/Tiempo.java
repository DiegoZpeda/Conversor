package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Tiempo extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;
    conversorTiempo miConversor3 = new conversorTiempo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo);
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
                temp.setText("Respuesta: "+ miConversor3.convertir(0, de, a, cantidad));
            }
        });
    }
}
class conversorTiempo{
    double[][] valores4 = {
            {60, 3600, 0.0416667, 0.00595238, 0.00136986, 0.000114155, 1.1416e-6, 3.6e+6, 1.1416e-5, 1}//Tiempo


    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores4[opcion][a] / valores4[opcion][de] * cantidad;
    }
}