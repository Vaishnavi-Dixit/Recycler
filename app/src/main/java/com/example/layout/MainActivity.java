package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = (RecyclerView)findViewById(R.id.programmingList);
       programmingList.setLayoutManager(new LinearLayoutManager(this));
       String[] languages = {"Book1","Book2","Book3","Book4"};
       programmingList.setAdapter(new ProgrammingAdapter(languages));






    }

}
