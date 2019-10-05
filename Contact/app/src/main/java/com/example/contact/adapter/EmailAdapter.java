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
import android.widget.TextView;

import com.example.contact.R;
import com.example.contact.model.EmailContact;

import java.util.ArrayList;
import java.util.List;

public class EmailAdapter extends ArrayAdapter<EmailContact> {

    private Context context;
    private int resource;
    private List<EmailContact> arrayEmailContact;

    public EmailAdapter(@NonNull Context context, int resource, @NonNull List<EmailContact> objects) {
        super(context, resource, objects);

        this.context=context;
        this.resource=resource;
        this.arrayEmailContact =objects;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

//viewHolder to make a file can hold out list, NO LAG
        ViewHolder viewHolder;

        if(convertView == null)
        {
            viewHolder =new ViewHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.activity_email_adapter,parent,false);
            viewHolder.edtTextEmail = (EditText) convertView.findViewById(R.id.edtText_email);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        EmailContact emailContact = arrayEmailContact.get(position);

//set------------------------------------------------------------------------
//set------------------------------------------------------------------------

        viewHolder.imgViewEmail.setBackgroundResource(R.drawable.ic_message);
        viewHolder.txtViewEmail.setText(R.string.phone);
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
