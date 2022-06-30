package com.github.finaloel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Products extends AppCompatActivity {

        ListView l;
        String List[]
                = { "Books", "Clothes",
                "Music", "Accecories",
                "Footwear", "Other Valuables",
                "etc.." };

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            l = findViewById(R.id.list);
            ArrayAdapter<String> arr;
            arr
                    = new ArrayAdapter<>(
                    this,
                    com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                    List);
            l.setAdapter(arr);
        }
    }
