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
import java.util.Set;

public class CustomListAdapter_ttct extends BaseAdapter {
    private Context context;
    private int layout;
    private List<people> listData;
    private ArrayList<people> arraylist;
    LayoutInflater inflater;
    public CustomListAdapter_ttct(Context context, int layout, ArrayList<people> listData) {
        this.context = context;
        this.layout = layout;
        inflater= LayoutInflater.from(context);
        this.arraylist = new ArrayList<people>();
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return arraylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView=inflater.inflate(layout,null);
            //LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);// cách gọi chính thống trong android java(ko nên dùng)
            holder.tensdt = (TextView) convertView.findViewById(R.id.txtloaisdt);
            holder.sodt = (TextView) convertView.findViewById(R.id.txtsdt);
            holder.mail = (TextView) convertView.findViewById(R.id.txtmail);
            holder.dc= (TextView) convertView.findViewById(R.id.txtdc);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }
        people p=listData.get(position);
        holder.dc.setText(p.getADDRESS());
        holder.tensdt.setText(p.getNUMBERKIND1());
        holder.sodt.setText(p.getNUMBERS1());
        holder.mail.setText(p.getMAIL1());
        //byte[] hinhanh=p.getHINH();
        //Bitmap bitmap=BitmapFactory.decodeByteArray(hinhanh,0,hinhanh.length);
        //holder.imghinh.setImageBitmap(bitmap);

//        listitem country = this.listData.get(position);
//        holder.tendau.setText(country.getTendau());
//        holder.countryNameView.setText(country.getCountryName());
//        int imageId = this.getMipmapResIdByName(country.getFlagName());
//
//        holder.flagView.setImageResource(imageId);

        return convertView;
    }
    static class ViewHolder {
        TextView tensdt;
        TextView sodt;
        TextView mail;
        TextView dc;
    }
}
