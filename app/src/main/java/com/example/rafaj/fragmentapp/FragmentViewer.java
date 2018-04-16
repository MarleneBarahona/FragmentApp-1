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
    ImageView imageS;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        //colocando los id del textview e imageview en las variables
        text = view.findViewById(R.id.textId);
        imageS = view.findViewById(R.id.imgId);
        Bundle bundle = this.getArguments();

        if(bundle != null){
            //creando objeto
            Dragones sailor = (Dragones)bundle.getSerializable("SAILOR");
            Toast.makeText(getActivity(), "Item: " + sailor.getname(), Toast.LENGTH_SHORT).show();
            //setenando string e imagen
            text.setText(sailor.getname());
            imageS.setImageResource(sailor.getimg());
        }

        return view;
    }
}

