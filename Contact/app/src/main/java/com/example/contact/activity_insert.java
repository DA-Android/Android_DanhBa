package com.example.contact;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GestureDetectorCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.contact.adapter.DateAdapter;
import com.example.contact.adapter.EmailAdapter;
import com.example.contact.adapter.PhoneAdapter;
import com.example.contact.model.DateContact;
import com.example.contact.model.EmailContact;
import com.example.contact.model.PhoneContact;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class activity_insert extends AppCompatActivity {
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=100;
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

    ImageButton btn_save;
    private ImageView img;

    int REQ = 123;

    int btn_Camera = 0;// 0 : chon anh 1 : Chup anh


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        mDetector = new GestureDetectorCompat(this, new activity_insert.MyGestureListener());
        actionBar= getSupportActionBar();
//        actionBar.setTitle(getString(R.string.cancel));
//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);

        setWidget();

        img = findViewById(R.id.imageView);

        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });

        registerForContextMenu(img);


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
    //bat su kien menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context,menu);
        menu.setHeaderTitle("Chọn ảnh");
        super.onCreateContextMenu(menu, v, menuInfo);
    }



    //chọn ảnh hay chụp ảnh
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.Anh_TV :
            {
                if(ContextCompat.checkSelfPermission(activity_insert.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_insert.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
                }
                else {
                    btn_Camera = 0;
                    Intent intent = new Intent(Intent.ACTION_PICK);
                    intent.setType("image/*");
                    startActivityForResult(intent, REQ);
                }
                break;
            }

            case R.id.Chup_anh :
            {

                if(ContextCompat.checkSelfPermission(activity_insert.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_insert.this,new String[]{Manifest.permission.CAMERA},1);
                }
                else {
                    btn_Camera = 1;
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent, REQ);
                }
                break;
            }
        }
        return super.onContextItemSelected(item);
    }



    // Luu anh vao img
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if(requestCode == REQ && resultCode == RESULT_OK && data != null)
        {
            if(btn_Camera == 0) {
                try {
                    Uri uri = data.getData();
                    InputStream inputStream = getContentResolver().openInputStream(uri);
                    Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                    img.setImageBitmap(bitmap);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else
            {
                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                img.setImageBitmap(bitmap);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.menu_top_finish,menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//
//        switch (item.getItemId())
//        {
//            case android.R.id.home:
//                onBackPressed();
//                return true;
//            case R.menu.menu_top_finish:
//
//
//                onBackPressed();
//
//            case R.id.imageView:
//
//
//
//            default:break;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

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







    @Override
    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final String DEBUG_TAG = "Gestures";

        @Override
        public boolean onDown(MotionEvent event) {
            Log.d(DEBUG_TAG,"onDown: " + event.toString());
            return true;
        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
            if(event2.getX()- event1.getX()>max && Math.abs(velocityY)>min)
            {
                Toast.makeText(activity_insert.this, "từ trái sang phải", LENGTH_SHORT).show();
                onBackPressed();
            }
            return super.onFling(event1,event2,velocityX,velocityY);
        }
    }
}
