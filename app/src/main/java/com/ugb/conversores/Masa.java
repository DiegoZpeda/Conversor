package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Masa extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;
    conversoresmasa miConversor6 = new conversoresmasa();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa);

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
                temp.setText("Respuesta: "+ miConversor6.convertir(0, de, a, cantidad));




            }
        });

    }
}
class conversoresmasa{
    double[][] valores7 = {
            {0.001, 1, 1000, 1e+6, 1e+9, 0.000984207, 0.00110231, 2.20462, 35.274, 0.157473},//masa

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores7[opcion][a] / valores7[opcion][de] * cantidad;
    }
}