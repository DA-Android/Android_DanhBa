package com.example.contact.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.contact.R;
import com.example.contact.model.DateContact;

import java.util.ArrayList;
import java.util.List;

public class DateAdapter extends BaseAdapter {

    private Context context;
    private List<DateContact> arrayDateContact;
    LayoutInflater layoutInflater;

    public DateAdapter(@NonNull Context context, @NonNull List<DateContact> objects) {
        this.context=context;
        this.arrayDateContact=objects;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayDateContact.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayDateContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        List<String> list = new ArrayList<>();
        list.add("Annyversary");
        list.add("BirthDay");
        list.add("Other");
        list.add("Custom");
        ArrayAdapter<String> adapter = new ArrayAdapter(context,R.layout.support_simple_spinner_dropdown_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        if(convertView == null)
        {
            convertView= layoutInflater.inflate(R.layout.activity_date_adapter,null);
            viewHolder =new ViewHolder();

            viewHolder.imgViewDate =  convertView.findViewById(R.id.imgView_date);
            viewHolder.txtViewDate =  convertView.findViewById(R.id.txtView_date);
            viewHolder.edtTextDate =  convertView.findViewById(R.id.edtText_date);
            viewHolder.edtTextKindDate =  convertView.findViewById(R.id.edtText_kind_date);
            viewHolder.spinnerDate=  convertView.findViewById(R.id.spinner_kind_date);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        DateContact dateContact = arrayDateContact.get(position);
//set------------------------------------------------------------------------
//set------------------------------------------------------------------------
        viewHolder.imgViewDate.setBackgroundResource(dateContact.getImageViewDate());
        viewHolder.txtViewDate.setText(dateContact.getTextViewDate());
        viewHolder.edtTextDate.setText(dateContact.getDate());
        viewHolder.edtTextKindDate.setText(dateContact.getKindDate());
        viewHolder.edtTextKindDate.setEnabled(false);
        viewHolder.spinnerDate.setAdapter(adapter);
        return convertView;
    }

    public class ViewHolder{
        //--------------------------------------date
        ImageView imgViewDate;
        TextView txtViewDate;
        EditText edtTextDate;
        EditText edtTextKindDate;
        Spinner spinnerDate;
    }
}
