package com.example.contact.model;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.contact.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CustomListAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<people>listData;
    private ArrayList<people> arraylist;
    LayoutInflater inflater;
    public CustomListAdapter(Context context, int layout, ArrayList<people> listData) {
        this.context = context;
        this.layout = layout;
        this.listData = listData;
        inflater= LayoutInflater.from(context);
        this.arraylist = new ArrayList<people>();
        this.arraylist.addAll(listData);
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
    private String orther="#";
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            holder = new ViewHolder();
            convertView=inflater.inflate(layout,null);
            //LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);// cách gọi chính thống trong android java(ko nên dùng)
            holder.chucaitendau = (TextView) convertView.findViewById(R.id.txttitle);
            holder.imghinh = (ImageView) convertView.findViewById(R.id.img);
            holder.ten = (TextView) convertView.findViewById(R.id.textview_ten);

            convertView.setTag(holder);
        }
        else
            {
                holder = (ViewHolder) convertView.getTag();
            }
        people p=listData.get(position);
        if(p.getFIRST_NAME().length()>0 &&p.getLAST_NAME().length()>0) {
            holder.chucaitendau.setText(p.getFIRST_NAME().substring(0, 1));
            holder.ten.setText(p.getFIRST_NAME()+" "+p.getLAST_NAME());
        }
        else
        {
            if(p.getFIRST_NAME().length()>0 ) {
                holder.chucaitendau.setText(p.getFIRST_NAME().substring(0, 1));
                holder.ten.setText(p.getFIRST_NAME());
            }
            else {
                if(p.getLAST_NAME().length()>0 ) {
                    holder.chucaitendau.setText(p.getLAST_NAME().substring(0, 1));
                    holder.ten.setText( p.getLAST_NAME());
                }
                else
                {
                    if(p.getNUMBERS1().length()>0 ) {
                        holder.chucaitendau.setText(orther);
                        holder.ten.setText(p.getNUMBERS1());
                    }
                    else
                    {
                        if(p.getNUMBERS2().length()>0 ) {
                            holder.chucaitendau.setText(orther);
                            holder.ten.setText(p.getNUMBERS2());
                        }
                        else
                        {
                            if(p.getNUMBERS3().length()>0 ) {
                                holder.chucaitendau.setText(orther);
                                holder.ten.setText(p.getNUMBERS3());
                            }
                            else
                            {
                                if(p.getNUMBERS4().length()>0 ) {
                                    holder.chucaitendau.setText(orther);
                                    holder.ten.setText(p.getNUMBERS4());
                                }
                                else
                                {
                                    if(p.getNUMBERS5().length()>0 ) {
                                        holder.chucaitendau.setText(orther);
                                        holder.ten.setText(p.getNUMBERS5());
                                    }
                                    else
                                    {
                                        if(p.getNUMBERS6().length()>0 ) {
                                            holder.chucaitendau.setText(orther);
                                            holder.ten.setText(p.getNUMBERS6());
                                        }
                                        else
                                        {
                                            if(p.getADDRESS().length()>0 ) {
                                                holder.chucaitendau.setText(orther);
                                                holder.ten.setText(p.getADDRESS());
                                            }
                                            else
                                            {
                                                if(p.getMAIL1().length()>0 ) {
                                                    holder.chucaitendau.setText(orther);
                                                    holder.ten.setText(p.getMAIL1());
                                                }
                                                else
                                                {
                                                    if(p.getMAIL2().length()>0 ) {
                                                        holder.chucaitendau.setText(orther);
                                                        holder.ten.setText(p.getMAIL2());
                                                    }
                                                    else
                                                    {
                                                        if(p.getMAIL3().length()>0 ) {
                                                            holder.chucaitendau.setText(orther);
                                                            holder.ten.setText(p.getMAIL3());
                                                        }
                                                        else
                                                        {
                                                            if(p.getMAIL4().length()>0 ) {
                                                                holder.chucaitendau.setText(orther);
                                                                holder.ten.setText(p.getMAIL4());
                                                            }
                                                            else
                                                            {
                                                                if(p.getMAIL5().length()>0 ) {
                                                                    holder.chucaitendau.setText(orther);
                                                                    holder.ten.setText(p.getMAIL5());
                                                                }
                                                                else
                                                                {
                                                                    if(p.getMAIL6().length()>0 ) {
                                                                        holder.chucaitendau.setText(orther);
                                                                        holder.ten.setText(p.getMAIL6());
                                                                    }
                                                                    else
                                                                    {
                                                                        if(p.getDATETIME1().length()>0 ) {
                                                                            holder.chucaitendau.setText(orther);
                                                                            holder.ten.setText(p.getDATETIME1());
                                                                        }
                                                                        else
                                                                        {
                                                                            if(p.getDATETIME2().length()>0 ) {
                                                                                holder.chucaitendau.setText(orther);
                                                                                holder.ten.setText(p.getDATETIME2());
                                                                            }
                                                                            else
                                                                            {
                                                                                if(p.getDATETIME3().length()>0 ) {
                                                                                    holder.chucaitendau.setText(orther);
                                                                                    holder.ten.setText(p.getDATETIME3());
                                                                                }
                                                                                else
                                                                                {
                                                                                    if(p.getDATETIME4().length()>0 ) {
                                                                                        holder.chucaitendau.setText(orther);
                                                                                        holder.ten.setText(p.getDATETIME4());
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        if(p.getDATETIME5().length()>0 ) {
                                                                                            holder.chucaitendau.setText(orther);
                                                                                            holder.ten.setText(p.getDATETIME5());
                                                                                        }
                                                                                        else
                                                                                        {
                                                                                            if(p.getDATETIME6().length()>0 ) {
                                                                                                holder.chucaitendau.setText(orther);
                                                                                                holder.ten.setText(p.getDATETIME6());
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                holder.chucaitendau.setText(orther);
                                                                                                holder.ten.setText("");
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }

        }

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

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        listData.clear();
        if (charText.length() == 0) {
            listData.addAll(arraylist);
        } else {
            for (people wp : arraylist) {
                if ((wp.getFIRST_NAME().toLowerCase(Locale.getDefault()).contains(charText)) || (wp.getLAST_NAME().toLowerCase(Locale.getDefault()).contains(charText)))
                {
                    listData.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }

    static class ViewHolder {
        ImageView imghinh;
        TextView ten;
        TextView chucaitendau;
    }
}

