package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.model.Recipe;
import com.example.myapplication.ui.RecipeListAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecipeListActivity extends AppCompatActivity {

    private List<Recipe> recipes = new ArrayList<>();
    private RecyclerView mRv;
    private RecipeListAdapter recipeListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        setTitle(title);

        recipes.add(new Recipe("Cơm tấm", "imageURL", "Cơm tấm miền nam", "Cách làm: Bước 1:..."));
        recipes.add(new Recipe("Bún bò", "imageURL", "Bún bò Huế", "Cách làm: Bước 1:..."));
        recipes.add(new Recipe("Thịt kho", "imageURL", "Thịt kho nước dừa", "Cách làm: Bước 1:..."));
        recipes.add(new Recipe("Cá chiên", "imageURL", "Cá chiên đơn giản", "Cách làm: Bước 1:..."));
        recipes.add(new Recipe("Cơm chiên", "imageURL", "Cơm chiên nhanh gọn", "Cách làm: Bước 1:..."));
        recipes.add(new Recipe("Thịt kho tàu", "imageURL", "Thịt kho với xá xị", "Cách làm: Bước 1:..."));

        mRv = findViewById(R.id.item_rv);
        mRv.setHasFixedSize(true);
        mRv.setLayoutManager(new LinearLayoutManager(this));
        recipeListAdapter = new RecipeListAdapter(this, recipes);
        mRv.setAdapter(recipeListAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
