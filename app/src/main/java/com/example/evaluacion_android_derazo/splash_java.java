package com.example.evaluacion_android_derazo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash_java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_java.this, MainActivity_Productos.class);
                startActivity(intent);
                finish();
            }
        };
        Timer  delay = new Timer ();
        delay.schedule(tarea,2000);
    }
}