package com.example.contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.contact.adapter.DateAdapter;
import com.example.contact.adapter.EmailAdapter;
import com.example.contact.adapter.PhoneAdapter;
import com.example.contact.model.DateContact;
import com.example.contact.model.EmailContact;
import com.example.contact.model.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class activity_insert extends AppCompatActivity {

    ImageView imageViewAddress;
    EditText editTextAddrees;
    TextView textViewAddress;

    List<PhoneContact> arrayListPhone;
    ListView listViewPhone;
    PhoneAdapter adapterPhone;

    List<EmailContact> arrayListEmail;
    ListView listViewEmail;
    EmailAdapter adapterEmail;

    List<DateContact> arrayListDate;
    ListView listViewDate;
    DateAdapter adapterDate;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);


        actionBar= getSupportActionBar();
//        actionBar.setTitle(getString(R.string.cancel));
//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);

        setWidget();

        arrayListPhone= new ArrayList<PhoneContact>();
        adapterPhone=new PhoneAdapter(this,arrayListPhone);
        listViewPhone.setAdapter(adapterPhone);

        arrayListEmail= new ArrayList<EmailContact>();
        adapterEmail=new EmailAdapter(this,arrayListEmail);
        listViewEmail.setAdapter(adapterEmail);

        arrayListDate= new ArrayList<DateContact>();
        adapterDate=new DateAdapter(this,arrayListDate);
        listViewDate.setAdapter(adapterDate);

        if(arrayListPhone.size()==0){
            CreateNewPhone();
        }
        if(arrayListEmail.size()==0){
            CreateNewEmail();
        }
        if(arrayListDate.size()==0){
            CreateNewDate();
        }

        //editTextAddrees.clearFocus();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_top_finish,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.menu.menu_top_finish:


                onBackPressed();

            case R.id.imageView:



            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setWidget(){
        imageViewAddress= (ImageView) findViewById(R.id.imgView_address);
        textViewAddress= (TextView) findViewById(R.id.txtView_address);
        editTextAddrees= (EditText) findViewById(R.id.edtText_address);

        listViewPhone= (ListView) findViewById(R.id.lstViewPhone);

        listViewEmail= (ListView) findViewById(R.id.lstViewEmail);

        listViewDate= (ListView) findViewById(R.id.lstViewDate);
    }

    public void CreateNewPhone(){
        List<String> listphone = new ArrayList<>();
        listphone.add("Mobile");
        listphone.add("Home");
        listphone.add("Work");
        listphone.add("Main");
        listphone.add("Other");
        listphone.add("Custom");
        ArrayAdapter<String> adapterSpinner = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,listphone);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        PhoneContact contactphone= new PhoneContact("","",getText(R.string.phone).toString(),R.drawable.ic_phone,listphone);
        arrayListPhone.add(contactphone);
    }

    public void CreateNewEmail(){
        //---------------------------------------------Create new Email-------------------------------------------
        EmailContact contactemail = new EmailContact("",getText(R.string.email).toString(),R.drawable.ic_message);
        arrayListEmail.add(contactemail);
    }

    public void CreateNewDate(){
        //---------------------------------------------Create new Date-------------------------------------------
        List<String> listdate = new ArrayList<>();
        listdate.add("Annyversary");
        listdate.add("BirthDay");
        listdate.add("Other");
        listdate.add("Custom");
        DateContact contactdate= new DateContact("","",getText(R.string.date).toString(),R.drawable.ic_calender,listdate);
        arrayListDate.add(contactdate);
    }








}
