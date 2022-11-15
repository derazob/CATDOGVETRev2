package com.example.evaluacion_android_derazo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Add_person_java extends AppCompatActivity {

    private RecyclerView recyclerViewPersona;
    private  RecyclerViewAdaptador adaptadorPersona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        recyclerViewPersona=(RecyclerView)findViewById(R.id.recyclerPersonas);
        recyclerViewPersona.setLayoutManager(new LinearLayoutManager(this));

        adaptadorPersona = new RecyclerViewAdaptador(obtenerPersonas());
        recyclerViewPersona.setAdapter(adaptadorPersona);
    }


    public List<persona_model> obtenerPersonas(){
        List <persona_model> persona = new ArrayList<>();
        persona.add(new persona_model("Spike","Pastor aleman",R.drawable.pastoraleman));
        persona.add(new persona_model("Friky","Bulldog",R.drawable.bulldog));
        persona.add(new persona_model("Petunia","Labrador Retriever",R.drawable.labrador));
        persona.add(new persona_model("Mike","Husky Siberiano",R.drawable.husky));
        persona.add(new persona_model("Bolos","Bulldog Frances",R.drawable.bulldogfrances));
        persona.add(new persona_model("Muñeca","Poodle",R.drawable.poodle));
        return persona;
    }
}