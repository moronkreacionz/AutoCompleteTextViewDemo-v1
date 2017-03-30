package com.moronkreacionz.autocompletetextviewdemo20170329;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    String[] language ={"C","C++","Java",".NET","iPhone","Swift","JavaScript","JS","R","Scala","Perl","Android","ASP.NET","PHP","Python","Ruby"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,language);

        AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.languageAutoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);

    }


}
