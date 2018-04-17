package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by user on 15/04/2018.
 */

public class Dragones implements Serializable {
    private int img;
    private String name;
    private String domador;
    private String ejemplar;

    //constructor
    public Dragones(String name, int pos_imagen){
        this.name = name;

        //tomando los recursos de drawable
        if(pos_imagen==0){
            domador = "Domador: no registrado";
            ejemplar = "Ejemplar: No registrado";
            img = R.drawable.terrorterrible;
        }
        else if(pos_imagen==1){
            domador = "Domador: Patapez Ingerman";
            ejemplar = "Ejemplar: Albondiga";
            img = R.drawable.gronckle;
        }
        else if(pos_imagen==2){
            domador = "Domador: Astrid Hofferson";
            ejemplar = "Ejemplar: Tormenta";
            img = R.drawable.nadder_mortifero;
        }
        else if(pos_imagen==3){
            domador = "Domador: Hipo Abadejo III";
            ejemplar = "Ejemplar: Chimuelo";
            img = R.drawable.furia_nocturna;
        }
        else if(pos_imagen==4){
            domador = "Domador: Brutacio y Bruthilda";
            ejemplar = "Ejemplar: Vomito y Erupto";
            img = R.drawable.cremallerus_espantosus;
        }
        else if(pos_imagen==5){
            domador = "Domador: Patan Mocoso";
            ejemplar = "Ejemplar: Colmillo";
            img = R.drawable.pesadilla_nocturna;
        }
        else if(pos_imagen==6){
            domador = "Domador: Valka";
            ejemplar = "Ejemplar: Brincanubes";
            img = R.drawable.brincanubes;
        }
        else if(pos_imagen==7){
            domador = "Domador: Valka";
            ejemplar = "Ejemplar: No registrado";
            img = R.drawable.cizalladura;
        }
        else if(pos_imagen==8){
            domador = "Domador: Estoico ";
            ejemplar = "Ejemplar: Rompecraneos";
            img = R.drawable.rompecraneos;
        }
    }

    //getters para img
    public int getimg() {
        return img;
    }

    //getters para name
    public String getname() {
        return name;
    }
    //getters para des
    public String getdes() {
        return domador;
    }
    //getter para ejemplar
    public String getEjemplar() {
        return ejemplar;
    }

}
