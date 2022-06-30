package com.appscals.javareviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListExampleActivity extends AppCompatActivity {
    String [] sampleData = new String[] {"Apple", "Boy", "Cat", "Dog"};
    ListView listView;
    RecyclerView recyclerView;
    TextView title, desc;
    myRecyclerViewAdapter myRecyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);

        listView = findViewById(R.id.listView_lv);
        recyclerView = findViewById(R.id.recyclerView_btn);
        title = findViewById(R.id.title_text);
        desc = findViewById(R.id.desc_tv);

        final ArrayList<String> listahan = new ArrayList<String>();
        Collections.addAll(listahan, sampleData);

        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, listahan);
        listView.setAdapter(adapter);

        //RecyclerView
        ArrayList<String> titleLists = new ArrayList<>();
        titleLists.add("Horse");
        titleLists.add("Cow");
        titleLists.add("Camel");
        titleLists.add("Sheep");
        titleLists.add("Goat");
        ArrayList<String> descLists = new ArrayList<>();
        descLists.add("Horse");
        descLists.add("Cow");
        descLists.add("Camel");
        descLists.add("Sheep");
        descLists.add("Goat");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerViewAdapter = new myRecyclerViewAdapter(titleLists, descLists, this);
        recyclerView.setAdapter(myRecyclerViewAdapter);
    }

}