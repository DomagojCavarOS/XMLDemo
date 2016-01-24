package com.d42gmail.cavar.linearinflator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Enigma on 22.1.2016..
 */
public class Layout extends LinearLayout {
    int data;


    public Layout(Context context, int data) {
        super(context);
        this.data = data;
    }

    public Layout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Layout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void show(){
        Log.i("task","task");
    }


}