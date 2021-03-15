package com.example.baitap1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView grvClothes;
    ArrayList<Clothes> arrayList;
    CustomAdapter ctAdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grvClothes = findViewById(R.id.grvClothes);
        arrayList = new ArrayList<>();

        arrayList.add(new Clothes("Google",5000.00, R.drawable.a_teveloper_tester_can_never_be_friend));
        arrayList.add(new Clothes("Google",2000.00, R.drawable.android_mobile_app_developer));
        arrayList.add(new Clothes("Google",2000.00, R.drawable.android_mobile_app_developer));
        arrayList.add(new Clothes("Google",2000.00, R.drawable.android_mobile_app_developer));
        arrayList.add(new Clothes("Google",2000.00, R.drawable.android_mobile_app_developer));
        arrayList.add(new Clothes("Google",2000.00, R.drawable.android_mobile_app_developer));
        ctAdt = new CustomAdapter(MainActivity.this, R.layout.item_griview, arrayList );

        grvClothes.setAdapter(ctAdt);
    }
}