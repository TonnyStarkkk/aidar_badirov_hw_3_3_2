package com.example.aidar_badirov_hw_3_3_2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private ArrayList<String> clothesList = new ArrayList<>();

        private RecyclerView rvClothes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvClothes = findViewById(R.id.rv_clothes);
        clothesList.add("T-shirt");
        clothesList.add("Kimono");
        clothesList.add("Blazer");
        clothesList.add("Vest");
        clothesList.add("Blouse");
        clothesList.add("Sweatshirt");
        clothesList.add("Shirt");
        clothesList.add("Sweater");
        clothesList.add("Suit");
        clothesList.add("Trousers");
        clothesList.add("Shorts");
        clothesList.add("Skirt");
        clothesList.add("Coat");
        clothesList.add("Windcheater");

        ClothesAdapter adapter = new ClothesAdapter(clothesList);
        rvClothes.setAdapter(adapter);

    }
}