package com.example.oumaima.my_application;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oumaima on 19/12/2018.
 */

public class ListNameAdapter extends RecyclerView.Adapter<ListHolder> {
    private List<String> nameList;
    private final NameItemListener nameItemListener;
    public ListNameAdapter(NameItemListener nameItemListener) {
        this.nameItemListener = nameItemListener;
        nameList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ListHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_style, viewGroup, false);
        return new ListHolder(view, this.nameItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ListHolder holder, int position) {
            holder.setContent(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public void updateData(List<String> nameList){
        this.nameList.clear();
        this.nameList.addAll(nameList);

        notifyDataSetChanged();
    }
}
