package com.appscals.javareviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.ViewHolder> {
    private final List<String> mTitle;
    private final List<String> mDesc;
    private final Context ctx;

    public myRecyclerViewAdapter(List<String> mTitle, List<String> mDesc, Context ctx) {
        this.mTitle = mTitle;
        this.mDesc = mDesc;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String titleItem = mTitle.get(position);
        String descItem = mDesc.get(position);
        holder.title.setText(this.mTitle.get(position));
        holder.title.setText(this.mDesc.get(position));
    }

    @Override
    public int getItemCount() {
        return mTitle.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title, description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_tv);
            description = itemView.findViewById(R.id.desc_tv);
        }
    }
}
