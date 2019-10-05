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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.contact.R;
import com.example.contact.model.DateContact;

import java.util.ArrayList;
import java.util.List;

public class DateAdapter extends ArrayAdapter<DateContact> {

    private Context context;
    private int resource;
    private List<DateContact> arrayDateContact;

    public DateAdapter(@NonNull Context context, int resource, @NonNull List<DateContact> objects) {
        super(context, resource, objects);

        this.context=context;
        this.resource=resource;
        this.arrayDateContact =objects;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//viewHolder to make a file can hold out list, NO LAG
        ViewHolder viewHolder;

        if(convertView == null)
        {
            viewHolder =new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.activity_date_adapter,parent,false);

            viewHolder.edtTextDate = (EditText) convertView.findViewById(R.id.edtText_date);
            viewHolder.edtTextKindDate = (EditText) convertView.findViewById(R.id.edtText_kind_date);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        DateContact dateContact = arrayDateContact.get(position);

//set------------------------------------------------------------------------
//set------------------------------------------------------------------------

        viewHolder.imgViewDate.setBackgroundResource(R.drawable.ic_message);
        viewHolder.txtViewDate.setText(R.string.phone);
        viewHolder.edtTextDate.setText(dateContact.getDate().toString());
        viewHolder.edtTextKindDate.setText(dateContact.getKindDate());

        List<String> list = new ArrayList<>();
        list.add("Annyversary");
        list.add("BirthDay");
        list.add("Other");
        list.add("Custom");
        ArrayAdapter<String> adapter = new ArrayAdapter(context,R.layout.activity_phone_adapter,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
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
