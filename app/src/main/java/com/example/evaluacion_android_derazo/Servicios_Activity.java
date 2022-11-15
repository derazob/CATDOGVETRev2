package com.example.evaluacion_android_derazo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Servicios_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
    }
    public void Fotografia (View view){
        Intent fotografia = new Intent(this, Activity_Fotografia_Master.class);
        startActivity(fotografia);
    }

    public void ANR (View view){
        Intent anr = new Intent(this, Activity_servicio_async_thread.class);
        startActivity(anr);
    }

    public void SENSOR (View view){
        Intent sensor = new Intent(this, Gyroscope.class);
        startActivity(sensor);
    }

    public void GPS (View view){
        Intent gps = new Intent(this, GPS_activity.class);
        startActivity(gps);
    }


}