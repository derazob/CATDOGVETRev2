package com.example.evaluacion_android_derazo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Activity_Fotografia_Master extends AppCompatActivity {

    ImageView iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotografia_master);
        iv1=findViewById(R.id.iv1);
    }

    final int CAPTURA_IMAGEN=1;

    public void tomarFoto(View v)
    {
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAPTURA_IMAGEN);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode,resultCode, data);
        if(requestCode==CAPTURA_IMAGEN && resultCode==RESULT_OK)
        {
            Bundle extras=data.getExtras();
            Bitmap bitmap1=(Bitmap)extras.get("data");
            iv1.setImageBitmap(bitmap1);



            }


        }
    }





