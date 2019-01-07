package com.example.oumaima.my_application;


import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by oumaima on 19/12/2018.
 */

public class ListHolder extends RecyclerView.ViewHolder {

    private TextView nameTxt;
   //final private NameItemListener nameItemListener;

    private String name;

    public ListHolder(@NonNull View itemView, final NameItemListener nameItemListener) {
        super(itemView);
        CardView cardView= itemView.findViewById(R.id.card_view);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameItemListener.clickOnItem(name);
            }
        });

        this.nameTxt= itemView.findViewById(R.id.textView_name);
    }


    public void setContent(String name) {
        nameTxt.setText(name);
    }
}
