package com.example.contact.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.contact.R;

import java.util.List;

public class CustomListHeader extends BaseAdapter {
    private List<listitem> listData;
    private LayoutInflater layoutInflater;
    private Context context;
    public CustomListHeader(Context aContext, List<listitem> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.listitem, null);
            holder = new ViewHolder();
            holder.countryNameView = (TextView) view.findViewById(R.id.txttitle);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();;
        }

        listitem country = this.listData.get(i);
        holder.countryNameView.setText(country.getCountryName());

        return view;
    }
    static class ViewHolder {
        TextView countryNameView;

    }
}
