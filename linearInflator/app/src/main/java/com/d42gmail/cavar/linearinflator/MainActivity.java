package com.d42gmail.cavar.linearinflator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private LinearLayout mLinearLayout;
   // ViewGroup mLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mLinearLayout = (LinearLayout) findViewById(R.id.asd);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                person per = new person("asd","asdad","sdfsdf");
                Log.i("fake","from mainActivity"+per.getDate()+per.getDescription()+per.getName());
                FakeItemAdapter fakeItemAdapter= new FakeItemAdapter(getApplicationContext(),per,mLinearLayout);
               // fakeItemAdapter.populate(getApplicationContext());
                Log.i("fake","prošao");
               // mLinearLayout.addView(fakeItemAdapter);

/*
                mLinearLayout = (LinearLayout) findViewById(R.id.asd);
                addLayout("This is text 1", "This is first button", "This is second Button");
                */
            }
        });


    }
    /*
   private void addLayout(String a1,String a2,String a3) {
        View layout2 = LayoutInflater.from(this).inflate(R.layout.layout1, mLinearLayout, false);

        TextView textView1 = (TextView) layout2.findViewById(R.id.button1);
        TextView button1 = (TextView) layout2.findViewById(R.id.button2);
        TextView button2 = (TextView) layout2.findViewById(R.id.button3);
        LinearLayout asd = (LinearLayout) layout2.findViewById(R.id.LinearLayout1);

        asd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLinearLayout.removeView(v);
            }
        });

        textView1.setText(a1);
        button1.setText(a2);
        button2.setText(a3);

        mLinearLayout.addView(layout2);
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
