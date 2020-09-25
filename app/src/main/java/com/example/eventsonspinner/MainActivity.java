package com.example.eventsonspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Spinner sp;
    String course[];
    String name[];
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.spinner);
        t1=findViewById(R.id.textView);

        name=getResources().getStringArray(R.array.name);
        course=getResources().getStringArray(R.array.places);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>
            (this, android.R.layout.simple_selectable_list_item,course);

        sp.setAdapter(adapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                t1.setText(name[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });


    }
}
