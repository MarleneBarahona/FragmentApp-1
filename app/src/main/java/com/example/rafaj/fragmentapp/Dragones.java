package com.example.rafaj.fragmentapp;

import java.io.Serializable;

/**
 * Created by user on 15/04/2018.
 */

public class Dragones implements Serializable {
    private int img;
    private String name;

    //constructor
    public Dragones(String name, int pos_imagen){
        this.name = name;

        //tomando los recursos de drawable
        if(pos_imagen==0){
            img = R.drawable.terror_terrible;
        }
        else if(pos_imagen==1){
            img = R.drawable.gronckle;
        }
        else if(pos_imagen==2){
            img = R.drawable.mortifero_nadder;
        }
        else if(pos_imagen==3){
            img = R.drawable.furia_nocturna;
        }
        else if(pos_imagen==4){
            img = R.drawable.cremallerus;
        }
        else if(pos_imagen==5){
            img = R.drawable.pesadilla;
        }
        else if(pos_imagen==6){
            img = R.drawable.salvajibestia;
        }
        else if(pos_imagen==7){
            img = R.drawable.rompe_viento;
        }
        else if(pos_imagen==8){
            img = R.drawable.escarabajo;
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
}
