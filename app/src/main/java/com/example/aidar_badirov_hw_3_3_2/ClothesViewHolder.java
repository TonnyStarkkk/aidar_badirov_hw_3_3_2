package com.example.aidar_badirov_hw_3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClothesViewHolder extends RecyclerView.ViewHolder {
    private TextView tvClothes;
    public ClothesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvClothes = itemView.findViewById(R.id.tv_clothes);
    }

    public void onBind(String clothesName){
        tvClothes.setText(clothesName);
    }
}
