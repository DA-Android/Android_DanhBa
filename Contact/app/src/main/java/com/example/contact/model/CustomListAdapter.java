package com.example.contact.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.contact.R;

import java.util.List;

public class CustomListAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<people>listData;
    LayoutInflater inflater;
    public CustomListAdapter(Context context, int layout, List<people> listData) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView=inflater.inflate(layout,null);
            //LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);// cách gọi chính thống trong android java(ko nên dùng)
            holder.chucaitendau = (TextView) convertView.findViewById(R.id.txttitle);
            holder.imghinh = (CircleImage) convertView.findViewById(R.id.img);
            holder.ten = (TextView) convertView.findViewById(R.id.textview_ten);

            convertView.setTag(holder);
        }
        else
            {
                holder = (ViewHolder) convertView.getTag();
            }
        people p=listData.get(position);
        holder.chucaitendau.setText(p.getFIRST_NAME().substring(0,1));
        holder.ten.setText(p.getFIRST_NAME()+" "+p.getLAST_NAME());
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
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();

        // Trả về 0 nếu không tìm thấy.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }
    static class ViewHolder {
        CircleImage imghinh;
        TextView ten;
        TextView chucaitendau;
    }
}

