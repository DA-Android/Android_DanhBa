package com.example.contact;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import android.text.Editable;
import android.text.TextWatcher;
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
import android.widget.Spinner;
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

    EditText editTextFirstName;
    EditText editTextLastName;


    ImageView imageViewAddress;
    EditText editTextAddrees;
    TextView textViewAddress;

    ConstraintLayout constraintLayoutPhoneInsert1;
    ConstraintLayout constraintLayoutPhoneInsert2;
    ConstraintLayout constraintLayoutPhoneInsert3;
    ConstraintLayout constraintLayoutPhoneInsert4;
    ConstraintLayout constraintLayoutPhoneInsert5;
    ConstraintLayout constraintLayoutPhoneInsert6;
    EditText editTextInsertPhone1;
    EditText editTextInsertPhone2;
    EditText editTextInsertPhone3;
    EditText editTextInsertPhone4;
    EditText editTextInsertPhone5;
    EditText editTextInsertPhone6;

    ConstraintLayout constraintLayoutEmailInsert1;
    ConstraintLayout constraintLayoutEmailInsert2;
    ConstraintLayout constraintLayoutEmailInsert3;
    ConstraintLayout constraintLayoutEmailInsert4;
    ConstraintLayout constraintLayoutEmailInsert5;
    ConstraintLayout constraintLayoutEmailInsert6;
    EditText editTextInsertEmail1;
    EditText editTextInsertEmail2;
    EditText editTextInsertEmail3;
    EditText editTextInsertEmail4;
    EditText editTextInsertEmail5;
    EditText editTextInsertEmail6;

    ConstraintLayout constraintLayoutDateInsert1;
    ConstraintLayout constraintLayoutDateInsert2;
    ConstraintLayout constraintLayoutDateInsert3;
    ConstraintLayout constraintLayoutDateInsert4;
    ConstraintLayout constraintLayoutDateInsert5;
    ConstraintLayout constraintLayoutDateInsert6;
    EditText editTextInsertDate1;
    EditText editTextInsertDate2;
    EditText editTextInsertDate3;
    EditText editTextInsertDate4;
    EditText editTextInsertDate5;
    EditText editTextInsertDate6;



    Spinner spinnerPhone1;
    Spinner spinnerPhone2;
    Spinner spinnerPhone3;
    Spinner spinnerPhone4;
    Spinner spinnerPhone5;
    Spinner spinnerPhone6;

    Spinner spinnerDate1;
    Spinner spinnerDate2;
    Spinner spinnerDate3;
    Spinner spinnerDate4;
    Spinner spinnerDate5;
    Spinner spinnerDate6;





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

        setWidget();

        editTextInsertPhone1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertPhone1.getText().length()>0)
                {
                    constraintLayoutPhoneInsert2.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertPhone2.getText().length()<=0)
                    {
                        constraintLayoutPhoneInsert2.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertPhone2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertPhone2.getText().length()>0)
                {
                    constraintLayoutPhoneInsert3.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertPhone3.getText().length()<=0)
                    {
                        constraintLayoutPhoneInsert3.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertPhone3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertPhone3.getText().length()>0)
                {
                    constraintLayoutPhoneInsert4.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertPhone4.getText().length()<=0)
                    {
                        constraintLayoutPhoneInsert4.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertPhone4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertPhone4.getText().length()>0)
                {
                    constraintLayoutPhoneInsert5.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertPhone5.getText().length()<=0)
                    {
                        constraintLayoutPhoneInsert5.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertPhone5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertPhone5.getText().length()>0)
                {
                    constraintLayoutPhoneInsert6.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertPhone6.getText().length()<=0)
                    {
                        constraintLayoutPhoneInsert6.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextInsertEmail1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertEmail1.getText().length()>0)
                {
                    constraintLayoutEmailInsert2.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertEmail2.getText().length()<=0)
                    {
                        constraintLayoutEmailInsert2.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertEmail2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertEmail2.getText().length()>0)
                {
                    constraintLayoutEmailInsert3.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertEmail3.getText().length()<=0)
                    {
                        constraintLayoutEmailInsert3.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertEmail3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertEmail3.getText().length()>0)
                {
                    constraintLayoutEmailInsert4.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertEmail4.getText().length()<=0)
                    {
                        constraintLayoutEmailInsert4.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertEmail4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertEmail4.getText().length()>0)
                {
                    constraintLayoutEmailInsert5.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertEmail5.getText().length()<=0)
                    {
                        constraintLayoutEmailInsert5.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertEmail5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertEmail5.getText().length()>0)
                {
                    constraintLayoutEmailInsert6.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertEmail6.getText().length()<=0)
                    {
                        constraintLayoutEmailInsert6.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextInsertDate1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertDate1.getText().length()>0)
                {
                    constraintLayoutDateInsert2.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertDate2.getText().length()<=0)
                    {
                        constraintLayoutDateInsert2.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertDate2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertDate2.getText().length()>0)
                {
                    constraintLayoutDateInsert3.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertDate3.getText().length()<=0)
                    {
                        constraintLayoutDateInsert3.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertDate3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertDate3.getText().length()>0)
                {
                    constraintLayoutDateInsert4.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertDate4.getText().length()<=0)
                    {
                        constraintLayoutDateInsert4.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertDate4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertDate4.getText().length()>0)
                {
                    constraintLayoutDateInsert5.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertDate5.getText().length()<=0)
                    {
                        constraintLayoutDateInsert5.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextInsertDate5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextInsertDate5.getText().length()>0)
                {
                    constraintLayoutDateInsert6.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextInsertDate6.getText().length()<=0)
                    {
                        constraintLayoutDateInsert6.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });



        //load spinner
        loadSpinner();



        img = findViewById(R.id.imageView);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertToSQLite();
            }
        });

        registerForContextMenu(img);


    }
    private void insertToSQLite() {
        if(editTextFirstName.getText().length()<=0&& editTextLastName.getText().length()<=0
                &&editTextInsertDate1.getText().length()<=0&&editTextInsertDate2.getText().length()<=0&&editTextInsertDate3.getText().length()<=0&&editTextInsertDate4.getText().length()<=0&&editTextInsertDate5.getText().length()<=0&&editTextInsertDate6.getText().length()<=0
                &&editTextInsertPhone1.getText().length()<=0&&editTextInsertPhone2.getText().length()<=0&&editTextInsertPhone3.getText().length()<=0&&editTextInsertPhone4.getText().length()<=0&&editTextInsertPhone5.getText().length()<=0&&editTextInsertPhone6.getText().length()<=0
                &&editTextAddrees.getText().length()<=0
                &&editTextInsertEmail1.getText().length()<=0&&editTextInsertEmail2.getText().length()<=0&&editTextInsertEmail3.getText().length()<=0&&editTextInsertEmail4.getText().length()<=0&&editTextInsertEmail5.getText().length()<=0&&editTextInsertEmail6.getText().length()<=0)
        {
            onBackPressed();
        }
        else {
            //thêm dữ liệu
            SQLite sqLite=new SQLite(this,"contact_new.sqlite",null,1);

            sqLite.Insertcontacts("R.drawable.hinh1",editTextFirstName.getText().toString(),editTextLastName.getText().toString(),editTextAddrees.getText().toString(),
                editTextInsertPhone1.getText().toString(),spinnerPhone1.getSelectedItem().toString(),editTextInsertPhone2.getText().toString(),spinnerPhone2.getSelectedItem().toString(),editTextInsertPhone3.getText().toString(),spinnerPhone3.getSelectedItem().toString(),editTextInsertPhone4.getText().toString(),spinnerPhone4.getSelectedItem().toString(),editTextInsertPhone5.getText().toString(),spinnerPhone5.getSelectedItem().toString(),editTextInsertPhone6.getText().toString(),spinnerPhone6.getSelectedItem().toString(),
                editTextInsertEmail1.getText().toString(),editTextInsertEmail2.getText().toString(),editTextInsertEmail3.getText().toString(),editTextInsertEmail4.getText().toString(),editTextInsertEmail5.getText().toString(),editTextInsertEmail6.getText().toString(),
                editTextInsertDate1.getText().toString(),spinnerDate1.getSelectedItem().toString(),editTextInsertDate2.getText().toString(),spinnerDate2.getSelectedItem().toString(),editTextInsertDate3.getText().toString(),spinnerDate3.getSelectedItem().toString(),editTextInsertDate4.getText().toString(),spinnerDate4.getSelectedItem().toString(),editTextInsertDate5.getText().toString(),spinnerDate5.getSelectedItem().toString(),editTextInsertDate6.getText().toString(),spinnerDate6.getSelectedItem().toString());


            onBackPressed();
        }
    }

    private void loadSpinner() {
        List<String> list = new ArrayList<>();
        list.add("Mobile");
        list.add("Home");
        list.add("Company");
        list.add("Custom");
        ArrayAdapter<String> adapter = new ArrayAdapter(activity_insert.this,R.layout.support_simple_spinner_dropdown_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerPhone1.setAdapter(adapter);
        spinnerPhone2.setAdapter(adapter);
        spinnerPhone3.setAdapter(adapter);
        spinnerPhone4.setAdapter(adapter);
        spinnerPhone5.setAdapter(adapter);
        spinnerPhone6.setAdapter(adapter);


        List<String> list1 = new ArrayList<>();
        list1.add("Annyversary");
        list1.add("Birthday");
        list1.add("Bigday");
        list1.add("Specialday");
        list1.add("Other");
        ArrayAdapter<String> adapter1 = new ArrayAdapter(activity_insert.this,R.layout.support_simple_spinner_dropdown_item,list1);
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerDate1.setAdapter(adapter1);
        spinnerDate2.setAdapter(adapter1);
        spinnerDate3.setAdapter(adapter1);
        spinnerDate4.setAdapter(adapter1);
        spinnerDate5.setAdapter(adapter1);
        spinnerDate6.setAdapter(adapter1);
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

    public void setWidget() {
        editTextFirstName= findViewById(R.id.editTextFirst);
        editTextLastName= findViewById(R.id.editTextLastName);
        btn_save = findViewById(R.id.btn_saveInsert);


        constraintLayoutPhoneInsert1 = findViewById(R.id.ConstraintlayoutPhoneInsert1);
        constraintLayoutPhoneInsert2 = findViewById(R.id.ConstraintlayoutPhoneInsert2);
        constraintLayoutPhoneInsert3 = findViewById(R.id.ConstraintlayoutPhoneInsert3);
        constraintLayoutPhoneInsert4 = findViewById(R.id.ConstraintlayoutPhoneInsert4);
        constraintLayoutPhoneInsert5 = findViewById(R.id.ConstraintlayoutPhoneInsert5);
        constraintLayoutPhoneInsert6 = findViewById(R.id.ConstraintlayoutPhoneInsert6);
        editTextInsertPhone1 = findViewById(R.id.edtText_phoneinsert1);
        editTextInsertPhone2 = findViewById(R.id.edtText_phoneinsert2);
        editTextInsertPhone3 = findViewById(R.id.edtText_phoneinsert3);
        editTextInsertPhone4 = findViewById(R.id.edtText_phoneinsert4);
        editTextInsertPhone5 = findViewById(R.id.edtText_phoneinsert5);
        editTextInsertPhone6 = findViewById(R.id.edtText_phoneinsert6);

        constraintLayoutEmailInsert1 = findViewById(R.id.ConstraintlayoutEmailInsert1);
        constraintLayoutEmailInsert2 = findViewById(R.id.ConstraintlayoutEmailInsert2);
        constraintLayoutEmailInsert3 = findViewById(R.id.ConstraintlayoutEmailInsert3);
        constraintLayoutEmailInsert4 = findViewById(R.id.ConstraintlayoutEmailInsert4);
        constraintLayoutEmailInsert5 = findViewById(R.id.ConstraintlayoutEmailInsert5);
        constraintLayoutEmailInsert6 = findViewById(R.id.ConstraintlayoutEmailInsert6);
        editTextInsertEmail1 = findViewById(R.id.edtText_emailinsert1);
        editTextInsertEmail2 = findViewById(R.id.edtText_emailinsert2);
        editTextInsertEmail3 = findViewById(R.id.edtText_emailinsert3);
        editTextInsertEmail4 = findViewById(R.id.edtText_emailinsert4);
        editTextInsertEmail5 = findViewById(R.id.edtText_emailinsert5);
        editTextInsertEmail6 = findViewById(R.id.edtText_emailinsert6);

        imageViewAddress = (ImageView) findViewById(R.id.imgView_addressinsert);
        textViewAddress = (TextView) findViewById(R.id.txtView_addressinsert);
        editTextAddrees = (EditText) findViewById(R.id.edtText_addressinsert);

        constraintLayoutDateInsert1 = findViewById(R.id.ConstraintlayoutDateInsert1);
        constraintLayoutDateInsert2 = findViewById(R.id.ConstraintlayoutDateInsert2);
        constraintLayoutDateInsert3 = findViewById(R.id.ConstraintlayoutDateInsert3);
        constraintLayoutDateInsert4 = findViewById(R.id.ConstraintlayoutDateInsert4);
        constraintLayoutDateInsert5 = findViewById(R.id.ConstraintlayoutDateInsert5);
        constraintLayoutDateInsert6 = findViewById(R.id.ConstraintlayoutDateInsert6);
        editTextInsertDate1 = findViewById(R.id.edtText_dateinsert1);
        editTextInsertDate2 = findViewById(R.id.edtText_dateinsert2);
        editTextInsertDate3 = findViewById(R.id.edtText_dateinsert3);
        editTextInsertDate4 = findViewById(R.id.edtText_dateinsert4);
        editTextInsertDate5 = findViewById(R.id.edtText_dateinsert5);
        editTextInsertDate6 = findViewById(R.id.edtText_dateinsert6);

//spinner
        spinnerPhone1 = findViewById(R.id.spinner_kind_phoneinsert1);
        spinnerPhone2 = findViewById(R.id.spinner_kind_phoneinsert2);
        spinnerPhone3 = findViewById(R.id.spinner_kind_phoneinsert3);
        spinnerPhone4 = findViewById(R.id.spinner_kind_phoneinsert4);
        spinnerPhone5 = findViewById(R.id.spinner_kind_phoneinsert5);
        spinnerPhone6 = findViewById(R.id.spinner_kind_phoneinsert6);

        spinnerDate1 = findViewById(R.id.spinner_kind_dateinsert1);
        spinnerDate2 = findViewById(R.id.spinner_kind_dateinsert2);
        spinnerDate3 = findViewById(R.id.spinner_kind_dateinsert3);
        spinnerDate4 = findViewById(R.id.spinner_kind_dateinsert4);
        spinnerDate5 = findViewById(R.id.spinner_kind_dateinsert5);
        spinnerDate6 = findViewById(R.id.spinner_kind_dateinsert6);
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
