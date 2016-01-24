package com.d42gmail.cavar.linearinflator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Enigma on 23.1.2016..
 */
public class FakeItemAdapter extends LinearLayout {

    private person per;
    LinearLayout linearLayout;


    public FakeItemAdapter(Context context, person per,LinearLayout linearLayout) {
        super(context);
        this.per=per;
        this.linearLayout=linearLayout;
        populate(context);
    }

    public void populate(Context context) {

        View layout2 = LayoutInflater.from(context).inflate(R.layout.layout1, linearLayout, false);

        TextView text1 = (TextView) layout2.findViewById(R.id.button1);
        TextView text2 = (TextView) layout2.findViewById(R.id.button2);
        TextView text3 = (TextView) layout2.findViewById(R.id.button3);
        LinearLayout asd = (LinearLayout) layout2.findViewById(R.id.LinearLayout1);


        text1.setText(per.getName());
        text2.setText(per.getDescription());
        text3.setText(per.getDate());

        Log.i("fake", "from FakeItemAdapter" + per.getDate() + per.getDescription() + per.getName());

        asd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.removeView(v);
            }
        });

        linearLayout.addView(layout2);

    }

    public FakeItemAdapter(Context context, AttributeSet attrs) {
        super(context, attrs);
        populate(context);
    }

    public FakeItemAdapter(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        populate(context);
    }
}
