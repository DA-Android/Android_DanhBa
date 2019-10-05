package com.example.contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.contact.adapter.PhoneAdapter;
import com.example.contact.model.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class DeleteActivity extends AppCompatActivity {

    List<PhoneContact> arrayListPhone;
    EditText editTextPhone;
    EditText editTextKindPhone;
    ImageView imageView;
    TextView textView;

    ListView listView;
    PhoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        ActionBar actionBar= getSupportActionBar();
//        actionBar.setTitle(Html.fromHtml("<h6>" + "CANCEL" + "</h6>"));
        actionBar.setTitle(getString(R.string.cancel));
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        setWidget();
        arrayListPhone= new ArrayList<>();
//        if(arrayListPhone.size()==0)
//            CreateNullPhone();
        adapter=new PhoneAdapter(this,R.layout.activity_phone_adapter,arrayListPhone);
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_top_delete,menu);
//        MenuItem item=menu.getItem(0);
//        switch (item.getItemId())
//        {
//            case R.id.Finish:item.setTitle(Html.fromHtml("<h1>" + "Finish" + "</h1>"));
//
//            break;
//        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    public void setWidget(){
        editTextPhone= (EditText) findViewById(R.id.edtText_phone);
        editTextKindPhone= (EditText) findViewById(R.id.edtText_kind_phone);
        imageView= (ImageView) findViewById(R.id.imageView);
        textView= (TextView) findViewById(R.id.txtView_phone);
        listView= (ListView) findViewById(R.id.lstViewPhone);
    }

    public void CreateNullPhone(){
        PhoneContact contact= new PhoneContact("","");
        arrayListPhone.add(contact);
        adapter.notifyDataSetChanged();
    }
}
