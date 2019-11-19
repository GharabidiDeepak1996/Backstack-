package com.example.backstack;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentOne extends Fragment {
Button button;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate( R.layout.fragment_fragment_one, container, false );

        button=view.findViewById( R.id.fragment_back_stack_one_button );
        button.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        FragmentTransaction fragmentManager = getFragmentManager().beginTransaction();
        fragmentManager.replace(R.id.container, new FragmentTwo(), null).addToBackStack( null ).commit();
    }
} );
        return view;
    }
}
