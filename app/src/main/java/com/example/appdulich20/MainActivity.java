package com.example.appdulich20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.appdulich20.adapter.RecentsAdapter;
import com.example.appdulich20.adapter.TopPlacesAdapter;
import com.example.appdulich20.model.RecentsData;
import com.example.appdulich20.model.TopPlacesData;
import com.rajendra.vacationtourapp.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// Bây giờ ở đây chúng ta sẽ thêm một số dữ liệu giả trong lớp mô hình của chúng ta

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Vịnh hạ long", "Việt nam", "2.000.00 vnđ", R.drawable.hl2));
        recentsDataList.add(new RecentsData("Vịnh hạ long", "Việt nam", "2.000.00 vnđ", R.drawable.hl3));
        recentsDataList.add(new RecentsData("Vịnh hạ long", "Việt nam", "2.000.00 vnđ", R.drawable.hl4));
        recentsDataList.add(new RecentsData("Vịnh hạ long", "Việt nam", "2.000.00 vnđ", R.drawable.hl2));
        recentsDataList.add(new RecentsData("Vịnh hạ long", "Việt nam", "2.000.00 vnđ", R.drawable.hl3));
        recentsDataList.add(new RecentsData("Vịnh hạ long", "Việt nam", "2.000.00 vnđ", R.drawable.hl3));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Bà nà Hill", "Việt nam", "300.000 vnđ - 400.000 vnđ", R.drawable.hl2));
        topPlacesDataList.add(new TopPlacesData("Bà nà Hill", "Việt nam", "300.000 vnđ - 400.000 vnđ", R.drawable.hl5));
        topPlacesDataList.add(new TopPlacesData("Bà nà Hill", "Việt nam", "300.000 vnđ - 400.000 vnđ", R.drawable.hl3));
        topPlacesDataList.add(new TopPlacesData("Bà nà Hill", "Việt nam", "300.000 vnđ - 400.000 vnđ", R.drawable.hl4));
        topPlacesDataList.add(new TopPlacesData("Bà nà Hill", "Việt nam", "300.000 vnđ - 400.000 vnđ", R.drawable.hl3));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList) {

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }


}
