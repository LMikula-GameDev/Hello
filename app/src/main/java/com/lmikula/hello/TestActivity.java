package com.lmikula.hello;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class TestActivity extends Activity {


    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);     // Inflating
        Log.d("TestActivity","Hello testing");
        b = (Button) findViewById(R.id.button);
        b.setText("This is text");
        b.setOnClickListener(o);

        tv = (TextView) findViewById(R.id.textView);
        tv.setText("Hi there!!!!1");

    }
    int Clicked = 0;
    OnClickListener o = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("ListenThing","This is a thing!!!!");
            tv.setText(Clicked++ + "");
        }
    };

}
