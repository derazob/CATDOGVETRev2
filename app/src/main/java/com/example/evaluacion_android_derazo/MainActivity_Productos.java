package com.example.evaluacion_android_derazo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity_Productos extends AppCompatActivity {
    private CheckBox seleccionarChk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_mascotas);
        seleccionarChk = ( CheckBox)findViewById(R.id.chkSeleccionar);
    }

    // Metodo para el boton herramientas



    public void Productos (View v){
        Intent Productos = new Intent(this, Add_person_java.class);
        startActivity(Productos);
    }
    public void Formulario (View form){
        Intent Formulario = new Intent(this, Spinner_java.class);
        startActivity(Formulario);


    }

    public void Check (View v){
        if (seleccionarChk.isChecked()==true){
            String mensaje = "Usuario guardado";
            Toast toast = Toast.makeText(this,"Usuario guardado",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START,90,0);
            toast.show();

        }
        else{
            String mensaje = "Usuario no guardado";
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        }
    }

    public void Servicios (View view){
        Intent servicios = new Intent(this, Servicios_Activity.class);
        startActivity(servicios);
    }


}