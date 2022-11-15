package com.example.evaluacion_android_derazo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class RecyclerViewAdaptador extends RecyclerView.Adapter <RecyclerViewAdaptador.ViewHolder>{

    public static class  ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre,apellido;
        ImageView imagen;

        public ViewHolder (View itemView){
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.tvPersona) ;
            apellido=(TextView)itemView.findViewById(R.id.tv_apellido);
            imagen=(ImageView) itemView.findViewById(R.id.img_persona);


        }
    }

    public List<persona_model> personaLista;

    public RecyclerViewAdaptador (List<persona_model> personaLista){
        this.personaLista=personaLista;
    }


    @Override
    public ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.nombre.setText(personaLista.get(position).getNombre());
        holder.apellido.setText(personaLista.get(position).getApellido());
        holder.imagen.setImageResource(personaLista.get(position).getImagen());

    }

    @Override
    public int getItemCount (){
        return personaLista.size();
    }

















}
