package ittepic.edu.tpdm_u1_practica1_jesusserrano;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText grados;
    ToggleButton tipo;
    String mensaje="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grados=findViewById(R.id.grados);
        tipo=findViewById(R.id.tipo);
    }
    public void convertir(View conver){
        mensaje="";
        Double grad=0.0;
        grad = Double.parseDouble(grados.getText().toString()) ;
        if(tipo.getText().toString().equals("°F a °C")){
            grad=(grad-32)/1.8;
            mensaje+=grad+"°C";
        }else{
            grad=(grad*1.8)+32;
            mensaje+=grad+"°F";
        }
        AlertDialog.Builder alerta= new AlertDialog.Builder(this);
        alerta.setTitle("Conversion de temperatura");
        alerta.setMessage(mensaje);
        alerta.setPositiveButton("Aceptar",null);
        alerta.show();
    }
}

