package com.lmikula.hello;



import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class ColourFragment extends Fragment {

    View rootView;

    public ColourFragment() {/*Blank*/}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_colour, container, false);
        Random rand = new Random();
        int randColour = Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
        rootView.setBackgroundColor(randColour);
        return rootView;
    }


}
