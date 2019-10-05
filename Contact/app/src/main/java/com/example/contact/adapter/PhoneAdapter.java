package com.example.contact.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.contact.R;
import com.example.contact.model.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class PhoneAdapter extends ArrayAdapter<PhoneContact> {

    private Context context;
    private int resource;
    private List<PhoneContact> arrayPhoneContact;

    public PhoneAdapter(@NonNull Context context, int resource, @NonNull List<PhoneContact> objects) {
        super(context, resource, objects);

        this.context=context;
        this.resource=resource;
        this.arrayPhoneContact =objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//viewHolder to make a file can hold out list, NO LAG
        ViewHolder viewHolder;

//tạo list xổ spinner
        List<String> list = new ArrayList<>();
        list.add("Mobile");
        list.add("Home");
        list.add("Work");
        list.add("Main");
        list.add("Other");
        list.add("Custom");
        ArrayAdapter<String> adapter = new ArrayAdapter(context,R.layout.activity_phone_adapter,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);



        if(convertView == null)
        {
            viewHolder =new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.activity_phone_adapter,parent,false);
            viewHolder.edtTextPhone = (EditText) convertView.findViewById(R.id.edtText_phone);
            viewHolder.edtTextKindPhone = (EditText) convertView.findViewById(R.id.edtText_kind_phone);
            viewHolder.imgViewPhone= (ImageView) convertView.findViewById(R.id.imgView_phone);
            viewHolder.imgViewPhone.setBackgroundResource(R.drawable.ic_phone);
            viewHolder.txtViewPhone= (TextView) convertView.findViewById(R.id.txtView_phone);
            viewHolder.txtViewPhone.setText(R.string.phone);
            viewHolder.spinnerPhone= (Spinner) convertView.findViewById(R.id.spinner_kind_phone);
            viewHolder.spinnerPhone.setAdapter(adapter);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        PhoneContact phoneContact = arrayPhoneContact.get(position);

//set------------------------------------------------------------------------
//set------------------------------------------------------------------------

        viewHolder.imgViewPhone.setBackgroundResource(R.drawable.ic_phone);
        viewHolder.txtViewPhone.setText(R.string.phone);
        viewHolder.edtTextPhone.setText(phoneContact.getNumber());
        viewHolder.edtTextKindPhone.setText(phoneContact.getKindNumber());
        viewHolder.spinnerPhone.setAdapter(adapter);


        convertView.setTag(viewHolder);
        return convertView;
    }
    public class ViewHolder{
//--------------------------------------phone
        ImageView imgViewPhone;
        TextView txtViewPhone;
        EditText edtTextPhone;
        EditText edtTextKindPhone;
        Spinner spinnerPhone;


    }
}
