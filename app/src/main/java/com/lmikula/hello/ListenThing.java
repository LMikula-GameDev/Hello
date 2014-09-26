package com.lmikula.hello;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by LMikula on 26/09/2014.
 */
public class ListenThing implements OnClickListener{

    int Clicked = 0;
    @Override public void onClick(View v){
        Log.d("ListenThing","This is a thing");
        Button b = (Button) v;
        b.setText(Clicked++ + "");
    }


}
