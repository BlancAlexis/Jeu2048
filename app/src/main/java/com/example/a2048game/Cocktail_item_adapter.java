package com.example.a2048game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class Cocktail_item_adapter extends BaseAdapter {

    private Context context;
    private List<Cocktail_choix> cocktail_choix_list;
    private LayoutInflater inflater;

    public Cocktail_item_adapter(Context context, List<Cocktail_choix>coktail_choix_list){
        this.cocktail_choix_list=coktail_choix_list;
        this.context=context;
        this.inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return cocktail_choix_list.size();
    }

    @Override
    public Cocktail_choix getItem(int position) {
        return cocktail_choix_list.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.adapter_item, null);
        return view;
    }
}
