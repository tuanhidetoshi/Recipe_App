package com.example.myapplication.ui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DetailActivity;
import com.example.myapplication.R;
import com.example.myapplication.model.Recipe;

import java.util.List;

public class RecipeListAdapter extends RecyclerView.Adapter<RecipeListAdapter.ViewHolder> {

    private Context context;
    private List<Recipe> list;

    public RecipeListAdapter(Context context, List<Recipe> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecipeListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeListAdapter.ViewHolder holder, int position) {
        holder.titleTv.setText(list.get(position).getTitle());
        holder.descTv.setText(list.get(position).getDesc());
        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView titleTv;
        public TextView descTv;
        public ImageButton likeBtn;
        public ImageButton saveBtn;
        public int position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTv = itemView.findViewById(R.id.titleTv);
            descTv = itemView.findViewById(R.id.descTv);
            likeBtn = itemView.findViewById(R.id.likeBtn);
            saveBtn = itemView.findViewById(R.id.saveBtn);

            likeBtn.setOnClickListener(this);
            saveBtn.setOnClickListener(this);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.likeBtn:
                    Toast.makeText(context, "Like Btn clicked, " + this.titleTv.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.saveBtn:
                    Toast.makeText(context, "Save Btn clicked, " + this.titleTv.getText(), Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("Recipe", list.get(position));
                    context.startActivity(intent);
                    break;
            }
        }
    }
}
