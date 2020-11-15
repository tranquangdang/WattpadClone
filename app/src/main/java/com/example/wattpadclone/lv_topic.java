package com.example.wattpadclone;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class lv_topic extends AppCompatActivity {
    ListView lv_topic_item;
    lv_topic_content_adapter adapter;
    ArrayList<lv_topic_content> arr_topic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_topic);
        getSupportActionBar().setTitle("M-TP");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setLogo(R.drawable.ic_baseline_arrow_back_24);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.coloractionabr)));
        addItem();
    }
    private void addItem() {
        lv_topic_item=findViewById(R.id.lv_topic);
        arr_topic=new ArrayList<lv_topic_content>();
        arr_topic.add(new lv_topic_content(R.drawable.shawn3,"Finneas only meant to steal from her house.","15 K","2.3 K",
                "39","\"hey, can't hurt to dream, right?\"","eilish","famous",
                "singer"));
        arr_topic.add(new lv_topic_content(R.drawable.mtp,"Be brightness star in the sky.","129 K","10.7 K",
                "39","\"Want to be something nobody can do, you need to more try\"","M-TP","sontung",
                "singer"));
        arr_topic.add(new lv_topic_content(R.drawable.shawn4,"Green of the sky when we touch","125 K","10.1 K",
                "39","\"Sorry, sorry, I'm such a klutz!\"","eilish","shawn",
                "famous"));
        arr_topic.add(new lv_topic_content(R.drawable.elish2,"Not your average hostage .","15 K","16 K",
                "39","\"You know I'm here to kidnap you right\"","bilish","eilish",
                "singer"));
        arr_topic.add(new lv_topic_content(R.drawable.elish3,"Unexpectedly Angel fall from heaven.","205 K","10.9 K",
                "39","\"This was my first whole book so don't be too harsh\"","eilish","famous",
                "singer"));
        adapter=new lv_topic_content_adapter(arr_topic,this);
        lv_topic_item.setAdapter(adapter);
    }
}