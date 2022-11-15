package com.example.evaluacion_android_derazo;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GPS_activity extends AppCompatActivity {

    Button btnGPS2;
    TextView tvUbicacion2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        tvUbicacion2 = (TextView) findViewById(R.id.tvUbicacion);
        btnGPS2 = (Button)findViewById(R.id.btnGPS);

        btnGPS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LocationManager locationManager = (LocationManager) GPS_activity.this.getSystemService(Context.LOCATION_SERVICE);
                LocationListener locationListener = new LocationListener(){

                    public void onLocationChanged(Location location){

                        tvUbicacion2.setText(""+location.getLatitude()+""+location.getLongitude());

                    }
                    public void onStatusChanged(String provider, int status, Bundle extras){}
                    public void onProviderEnabled(String provider){}
                    public void onProviderDisabled(String provider){}

                };
            int permissionCheck = ContextCompat.checkSelfPermission(GPS_activity.this,
                    Manifest.permission.ACCESS_FINE_LOCATION);
                locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0,locationListener);


            }
        });

        int permissionCheck = ContextCompat.checkSelfPermission(GPS_activity.this,
                Manifest.permission.ACCESS_FINE_LOCATION);

        if(permissionCheck== PackageManager.PERMISSION_DENIED) {


            if (ActivityCompat.shouldShowRequestPermissionRationale(GPS_activity.this,
                    Manifest.permission.ACCESS_FINE_LOCATION)){


            }   else {

                ActivityCompat.requestPermissions(GPS_activity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);


            }

    }

    }



}