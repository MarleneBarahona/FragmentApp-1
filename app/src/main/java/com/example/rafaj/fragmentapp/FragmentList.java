package com.example.rafaj.fragmentapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import java.io.Serializable;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentList extends ListFragment implements AdapterView.OnItemClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.Especie, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(getActivity(), "Item: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

        //creando el objeto
        Dragones dragones = new Dragones(adapterView.getItemAtPosition(i).toString(), adapterView.getItemAtPosition(i).toString(),i);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            Intent newIntent = new Intent(getActivity().getApplicationContext(), Main2Activity.class);
            newIntent.setAction(Intent.ACTION_SEND);
            //aplicando intent en objeto
            newIntent.putExtra("SAILOR", dragones);
            newIntent.setType("text/plain");
            startActivity(newIntent);

        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getActivity(), "Item: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();

            Bundle bundle = new Bundle();
            //bundle en objeto
            bundle.putSerializable("SAILOR", dragones);
            FragmentViewer frag = new FragmentViewer();
            frag.setArguments(bundle);

            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.viewer, frag);
            fragmentTransaction.commit();
        }
    }

}

