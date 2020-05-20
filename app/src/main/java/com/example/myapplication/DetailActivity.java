package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.model.Recipe;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Recipe recipe = (Recipe) intent.getSerializableExtra("Recipe");

        setTitle(recipe.getTitle());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
