package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    TextView des;
    TextView ejemplar;
    ImageView imageS;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //colocando los id del textview e imageview en las variables
        text = findViewById(R.id.text1);
        ejemplar = findViewById(R.id.text2);
        des = findViewById(R.id.text3);
        imageS = findViewById(R.id.imgId);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent){

        //creando objeto
        Dragones dragon = (Dragones)intent.getSerializableExtra("DRAGON");

        //condicion para que aparezca el string e imagen
        if (text != null) {
            text.setText(dragon.getname());
        } if (des != null) {
            des.setText(dragon.getdes());
        } if (ejemplar != null) {
            ejemplar.setText(dragon.getEjemplar());
        }
        if (imageS != null){
            imageS.setImageResource(dragon.getimg());
        }
    }
}
