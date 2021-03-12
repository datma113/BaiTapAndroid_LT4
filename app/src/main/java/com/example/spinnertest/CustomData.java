package com.example.spinnertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomData extends BaseAdapter {

    Context context;
    int layoutItem;
    ArrayList<Data> listData;
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public CustomData(Context context, int layoutItem, ArrayList<Data> listData) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.listData = listData;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         convertView = LayoutInflater.from(context)
                 .inflate(layoutItem, parent, false);

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvPrice = convertView.findViewById(R.id.tvPrice);
        ImageView ivImg = convertView.findViewById(R.id.tvImg);

        tvName.setText(listData.get(position).getName());
        tvPrice.setText(listData.get(position).getPrice());
        ivImg.setImageResource(listData.get(position).getImg());

        return convertView;
    }
}
