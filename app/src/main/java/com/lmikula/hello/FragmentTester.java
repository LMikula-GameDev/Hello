package com.lmikula.hello;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class FragmentTester extends Activity {

    Button b;
    public static Fragment FunkyFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_tester);

//        if (FunkyFragment == null)
            FunkyFragment = new ColourFragment();

        b = (Button) findViewById(R.id.fragmentButton1);
        b.setText("Switch fragments");
        FragmentManager fragMngr = getFragmentManager();
        fragMngr.beginTransaction()
        .add(R.id.LayoutLow,FunkyFragment)
                .commit();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FragmentTester2.class));
            }
        });
    }


}