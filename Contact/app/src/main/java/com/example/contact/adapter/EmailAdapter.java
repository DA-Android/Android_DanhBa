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
import android.widget.TextView;

import com.example.contact.R;
import com.example.contact.model.EmailContact;

import java.util.ArrayList;
import java.util.List;

public class EmailAdapter extends BaseAdapter {

    private Context context;
    LayoutInflater layoutInflater;
    private List<EmailContact> arrayEmailContact;

    public EmailAdapter(@NonNull Context context, @NonNull List<EmailContact> objects) {
        this.context=context;
        this.arrayEmailContact =objects;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayEmailContact.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayEmailContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null)
        {
            convertView= layoutInflater.inflate(R.layout.activity_email_adapter,null);
            viewHolder =new ViewHolder();

            viewHolder.edtTextEmail = (EditText) convertView.findViewById(R.id.edtText_email);
            viewHolder.imgViewEmail= (ImageView) convertView.findViewById(R.id.imgView_email);
            viewHolder.txtViewEmail= (TextView) convertView.findViewById(R.id.txtView_email);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        EmailContact emailContact = arrayEmailContact.get(position);

//set------------------------------------------------------------------------
//set------------------------------------------------------------------------

        viewHolder.imgViewEmail.setBackgroundResource(emailContact.getImageView());
        viewHolder.txtViewEmail.setText(emailContact.getTextEMail());
        viewHolder.edtTextEmail.setText(emailContact.getEMail());

        return convertView;
    }
    public class ViewHolder{

        //--------------------------------------email
        ImageView imgViewEmail;
        TextView txtViewEmail;
        EditText edtTextEmail;

    }
}
