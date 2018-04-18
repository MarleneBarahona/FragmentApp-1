package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text;
    TextView des;
    TextView ejemplar;
    ImageView imageS;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        //colocando los id del textview e imageview en las variables
        text = view.findViewById(R.id.text1);
        ejemplar = view.findViewById(R.id.text2);
        des = view.findViewById(R.id.text3);
        imageS = view.findViewById(R.id.imgId);
        Bundle bundle = this.getArguments();

        if(bundle != null){
            //creando objeto
            Dragones dragon = (Dragones)bundle.getSerializable("DRAGON");
            Toast.makeText(getActivity(), "Item: " + dragon.getname(), Toast.LENGTH_SHORT).show();
            //setenando string e imagen
            text.setText(dragon.getname());
            ejemplar.setText(dragon.getEjemplar());
            des.setText(dragon.getdes());
            imageS.setImageResource(dragon.getimg());
        }

        return view;
    }
}

