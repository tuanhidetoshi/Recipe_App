package com.example.myapplication.ui;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.RecipeListActivity;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private Context context;
    private List recipeTypeList;


    public RecyclerAdapter(Context context, List recipeTypeList) {
        this.context = context;
        this.recipeTypeList = recipeTypeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipetype_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(recipeTypeList.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return recipeTypeList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, RecipeListActivity.class);
            intent.putExtra("title", title.getText());
            context.startActivity(intent);

        }
    }
}
