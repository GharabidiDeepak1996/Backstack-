package com.example.backstack;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentThree extends Fragment {
    Button button;
    public FragmentThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate( R.layout.fragment_fragment_three, container, false );

        button=view.findViewById( R.id.fragment_back_stack_three_button );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               getFragmentManager().beginTransaction().replace( R.id.container,new FragmentOne(),null ).commit();
            }
        } );

        return view;
    }
}
