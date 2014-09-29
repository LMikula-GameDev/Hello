package com.lmikula.hello;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.Arrays;


public class TestActivity extends Activity {


    Button b;
    ListView textLayout;
//    TextView[] clickText;
//    TextView tv;
    ArrayList<String> favouriteThings = new ArrayList<String>(Arrays.asList("pizza", "cake", "video games", "autumn", "foxes", "goats", "technology", "my computer", "my phone"));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);     // Inflating
        Log.d("TestActivity","ON CREATE");
        b = (Button) findViewById(R.id.button);
        b.setText("This is text");
        b.setOnClickListener(o);
 //       ListAdapter listOfText = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,favouriteThings);
        ListAdapter listOfText = new BaseAdapter(){
            @Override
            public int getCount() {
                return favouriteThings.size();
            }

            @Override
            public Object getItem(int position) {
                return favouriteThings.get(position);
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String tempText = favouriteThings.get(position);
                TextView newTextView;
                if (convertView == null){
                    newTextView = new TextView(TestActivity.this);
                }
                else{
                    newTextView = (TextView) convertView;
                }
                newTextView.setText(tempText);

                return newTextView;
     //           parent.getChildAt(position)
     //           favouriteThings.get(position).

            }
        };

        textLayout = (ListView) findViewById(R.id.textLayout);
        textLayout.setAdapter(listOfText);      // binds listview to data (data binding)

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
            clicked++;
            if (clicked >= 10) {
                Log.d("TestActivity","You win!");
                startActivity(new Intent(getApplicationContext(),WinActivity.class));   //


//                setContentView(R.layout.activity_win);  // Changes the first window, instead of making new window
            }
        }
    };



}
