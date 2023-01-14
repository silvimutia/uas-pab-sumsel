package com.if3b.sumateraselatan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvKabupaten;
    private ArrayList<ModelData>data=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKabupaten = findViewById(R.id.rv_kabupaten);
        rvKabupaten.setHasFixedSize(true);

        data.addAll(dataKabupatenKota.ambilDataKabupaten());
        tampilData();


    }
    private void tampilData(){
        rvKabupaten.setLayoutManager(new LinearLayoutManager(this));
        AdapterCard varAdapter = new AdapterCard(data,MainActivity.this);
        rvKabupaten.setAdapter(varAdapter);
    }


}