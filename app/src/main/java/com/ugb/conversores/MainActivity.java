package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;
    conversores miConversor = new conversores();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                temp.setText("Respuesta: "+ miConversor.convertir(0, de, a, cantidad));
            }
        });
    }
}
class conversores{
    double[][] valores = {
            {1, 7.84, 24.63, 36.51, 581.78, 8.75, 0.93, 130.54, 82.52, 0.82},//monedas
            //{8, 8e-6, 8e-12, 8e-12, 1, 0.001, 1e-6, 1e-9, 1e-12, 1e-15},//Almacenamiento
            //{1, 0.01, 0.0010, 1000, 0.1, 0.001, 0.000001, 0.000353147, 0.0610237441, 0.0000100},//Volumen
            //{8e+6, 8000, 1000, 8, 1, 0.008, 0.001, 8e-6, 1e-6, 7.276e-6},//tranferencia
            //{0.001, 1, 100, 1000, 1e+9, 0.000621371, 1.09361296, 3.28084, 39.3701, 0.000539957}//Longitud
            //{60, 3600, 0.0416667, 0.00595238, 0.00136986, 0.000114155, 1.1416e-6, 3.6e+6, 1.1416e-5, 1}//Tiempo

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a] / valores[opcion][de] * cantidad;
    }
}