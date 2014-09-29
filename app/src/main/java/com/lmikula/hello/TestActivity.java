package com.lmikula.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class TestActivity extends Activity {


    Button b;
    LinearLayout textLayout;
//    TextView[] clickText;
//    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);     // Inflating
        Log.d("TestActivity","ON CREATE");
        b = (Button) findViewById(R.id.button);
        b.setText("This is text");
        b.setOnClickListener(o);

        textLayout = (LinearLayout) findViewById(R.id.textLayout);

//        clickText = new TextView[20];

//        tv = (TextView) findViewById(R.id.textView);
//        tv.setText("Hi there!!!!1");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("TestActivity","ON START");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TestActivity", "ON RESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TestActivity", "ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TestActivity", "ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TestActivity", "ON DESTROY");
    }

    int clicked = 0;
    OnClickListener o = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d("ListenThing","This is a thing!!!!");
//            tv.setText(Clicked++ + "");
//            clickText[clicked] = new TextView(TestActivity.this);
//            clickText[clicked].setText("STOP CLICKING!");
//            textLayout.addView(clickText[clicked]);
            TextView tempText = new TextView((TestActivity.this));
            tempText.setText("STOP CLICKING!");
            textLayout.addView(tempText);
            clicked++;
            if (clicked >= 10) {
                Log.d("TestActivity","You win!");
                startActivity(new Intent(getApplicationContext(),WinActivity.class));   //


//                setContentView(R.layout.activity_win);  // Changes the first window, instead of making new window
            }
        }
    };



}
