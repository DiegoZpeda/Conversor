package com.ugb.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Tranferencia_datos extends AppCompatActivity {
    Button btn;
    TextView temp;
    Spinner spn;
    conversorTranferencia miConversor4 = new conversorTranferencia();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tranferencia_datos);

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
                temp.setText("Respuesta: "+ miConversor4.convertir(0, de, a, cantidad));
            }
        });
    }
}
class conversorTranferencia{
    double[][] valores5 = {
            {8e+6, 8000, 1000, 8, 1, 0.008, 0.001, 8e-6, 1e-6, 7.276e-6},//tranferencia

    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return valores5[opcion][a] / valores5[opcion][de] * cantidad ;
    }
}