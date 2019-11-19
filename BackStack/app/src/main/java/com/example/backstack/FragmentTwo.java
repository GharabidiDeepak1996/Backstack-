package com.example.backstack;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentTwo extends Fragment {
Button button;
    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view=inflater.inflate( R.layout.fragment_fragment_two, container, false );
        button=view.findViewById( R.id.fragment_back_stack_two_button );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
 getFragmentManager().beginTransaction().replace( R.id.container,new FragmentThree(),null ).addToBackStack( null ).commit();


            }
        } );
        return view;
    }

}
