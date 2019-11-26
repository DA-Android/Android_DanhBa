package com.example.contact.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.contact.R;

import java.util.ArrayList;
import java.util.List;

public class Custommycard extends BaseAdapter {
    private Context context;
    private int layout;
    private List<people> listData;
    private ArrayList<people> arraylist;
    LayoutInflater inflater;
    public Custommycard(Context context, int layout, ArrayList<people> listData) {
        this.context = context;
        this.layout = layout;
        this.listData = listData;
        inflater= LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView=inflater.inflate(layout,null);
            //LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);// cách gọi chính thống trong android java(ko nên dùng)
            holder.chucaitendau = (TextView) convertView.findViewById(R.id.textView2);
            holder.ten = (TextView) convertView.findViewById(R.id.textView3);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        people p=listData.get(position);
        holder.chucaitendau.setText(p.getFIRST_NAME().substring(0, 1)+p.getLAST_NAME().substring(0,1));
        holder.ten.setText(p.getFIRST_NAME()+p.getLAST_NAME());
        return convertView;
    }

    static class ViewHolder {
        TextView ten;
        TextView chucaitendau;
    }
}
