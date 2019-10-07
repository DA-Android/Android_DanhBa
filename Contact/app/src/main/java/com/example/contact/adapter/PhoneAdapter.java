package com.example.contact.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.contact.R;
import com.example.contact.model.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class PhoneAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<PhoneContact> arrayPhoneContact;

    public PhoneAdapter(@NonNull Context context, @NonNull List<PhoneContact> objects) {

        this.context=context;
        this.arrayPhoneContact =objects;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayPhoneContact.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayPhoneContact.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }



    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder ;

//tạo list xổ spinner
        List<String> list = new ArrayList<>();
        list.add("Mobile");
        list.add("Home");
        list.add("Work");
        list.add("Main");
        list.add("Other");
        list.add("Custom");
        ArrayAdapter<String> adapter = new ArrayAdapter(context,R.layout.support_simple_spinner_dropdown_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);



        if(convertView == null )
        {

            convertView = layoutInflater.inflate(R.layout.activity_phone_adapter,null);

            viewHolder =new ViewHolder();
            viewHolder.edtTextPhone =  convertView.findViewById(R.id.edtText_phone);
            viewHolder.edtTextKindPhone =  convertView.findViewById(R.id.edtText_kind_phone);
            viewHolder.imgViewPhone=  convertView.findViewById(R.id.imgView_phone);
            viewHolder.txtViewPhone=  convertView.findViewById(R.id.txtView_phone);
            viewHolder.spinnerPhone=  convertView.findViewById(R.id.spinner_kind_phone);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        PhoneContact phoneContact= arrayPhoneContact.get(position);

//set------------------------------------------------------------------------
//set------------------------------------------------------------------------


        viewHolder.txtViewPhone.setText(phoneContact.getTextPhone());
        viewHolder.edtTextPhone.setText(phoneContact.getNumber());
        viewHolder.edtTextKindPhone.setText(phoneContact.getKindNumber());
        viewHolder.edtTextKindPhone.setEnabled(false);
        viewHolder.spinnerPhone.setAdapter(adapter);
        viewHolder.imgViewPhone.setBackgroundResource(phoneContact.getImageView());


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
