package com.example.contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;

import android.accounts.OnAccountsUpdateListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
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

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class DeleteActivity extends AppCompatActivity {
    private static String ID = null;
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=100;
    EditText editTextFirstName;
    EditText editTextLastName;




    ImageView imageViewAddress;
    TextView textViewAddress;

    ConstraintLayout constraintLayoutPhoneDelete1;
    ConstraintLayout constraintLayoutPhoneDelete2;
    ConstraintLayout constraintLayoutPhoneDelete3;
    ConstraintLayout constraintLayoutPhoneDelete4;
    ConstraintLayout constraintLayoutPhoneDelete5;
    ConstraintLayout constraintLayoutPhoneDelete6;
    EditText editTextDeletePhone1;
    EditText editTextDeletePhone2;
    EditText editTextDeletePhone3;
    EditText editTextDeletePhone4;
    EditText editTextDeletePhone5;
    EditText editTextDeletePhone6;

    ConstraintLayout constraintLayoutEmailDelete1;
    ConstraintLayout constraintLayoutEmailDelete2;
    ConstraintLayout constraintLayoutEmailDelete3;
    ConstraintLayout constraintLayoutEmailDelete4;
    ConstraintLayout constraintLayoutEmailDelete5;
    ConstraintLayout constraintLayoutEmailDelete6;
    EditText editTextDeleteEmail1;
    EditText editTextDeleteEmail2;
    EditText editTextDeleteEmail3;
    EditText editTextDeleteEmail4;
    EditText editTextDeleteEmail5;
    EditText editTextDeleteEmail6;

    EditText editTextAddrees;

    ConstraintLayout constraintLayoutDateDelete1;
    ConstraintLayout constraintLayoutDateDelete2;
    ConstraintLayout constraintLayoutDateDelete3;
    ConstraintLayout constraintLayoutDateDelete4;
    ConstraintLayout constraintLayoutDateDelete5;
    ConstraintLayout constraintLayoutDateDelete6;
    EditText editTextDeleteDate1;
    EditText editTextDeleteDate2;
    EditText editTextDeleteDate3;
    EditText editTextDeleteDate4;
    EditText editTextDeleteDate5;
    EditText editTextDeleteDate6;

    List<PhoneContact> arrayListPhone;
    List<EmailContact> arrayListEmail;
    List<DateContact> arrayListDate;

    ActionBar actionBar;

    ImageButton btndelete;
    ImageButton btnSave;


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


    ConstraintLayout constraintLayoutDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        mDetector = new GestureDetectorCompat(this, new DeleteActivity.MyGestureListener());
        actionBar= getSupportActionBar();

        setWidget();

        //text changed------------------------------------------------------------------------------

        editTextDeletePhone1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeletePhone1.getText().length()>0)
                {
                    constraintLayoutPhoneDelete2.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeletePhone2.getText().length()<=0)
                    {
                        constraintLayoutPhoneDelete2.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeletePhone2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeletePhone2.getText().length()>0)
                {
                    constraintLayoutPhoneDelete3.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeletePhone3.getText().length()<=0)
                    {
                        constraintLayoutPhoneDelete3.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeletePhone3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeletePhone3.getText().length()>0)
                {
                    constraintLayoutPhoneDelete4.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeletePhone4.getText().length()<=0)
                    {
                        constraintLayoutPhoneDelete4.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeletePhone4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeletePhone4.getText().length()>0)
                {
                    constraintLayoutPhoneDelete5.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeletePhone5.getText().length()<=0)
                    {
                        constraintLayoutPhoneDelete5.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeletePhone5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeletePhone5.getText().length()>0)
                {
                    constraintLayoutPhoneDelete6.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeletePhone6.getText().length()<=0)
                    {
                        constraintLayoutPhoneDelete6.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextDeleteEmail1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteEmail1.getText().length()>0)
                {
                    constraintLayoutEmailDelete2.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteEmail2.getText().length()<=0)
                    {
                        constraintLayoutEmailDelete2.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteEmail2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteEmail2.getText().length()>0)
                {
                    constraintLayoutEmailDelete3.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteEmail3.getText().length()<=0)
                    {
                        constraintLayoutEmailDelete3.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteEmail3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteEmail3.getText().length()>0)
                {
                    constraintLayoutEmailDelete4.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteEmail4.getText().length()<=0)
                    {
                        constraintLayoutEmailDelete4.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteEmail4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteEmail4.getText().length()>0)
                {
                    constraintLayoutEmailDelete5.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteEmail5.getText().length()<=0)
                    {
                        constraintLayoutEmailDelete5.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteEmail5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteEmail5.getText().length()>0)
                {
                    constraintLayoutEmailDelete6.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteEmail6.getText().length()<=0)
                    {
                        constraintLayoutEmailDelete6.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextDeleteDate1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteDate1.getText().length()>0)
                {
                    constraintLayoutDateDelete2.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteDate2.getText().length()<=0)
                    {
                        constraintLayoutDateDelete2.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteDate2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteDate2.getText().length()>0)
                {
                    constraintLayoutDateDelete3.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteDate3.getText().length()<=0)
                    {
                        constraintLayoutDateDelete3.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteDate3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteDate3.getText().length()>0)
                {
                    constraintLayoutDateDelete4.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteDate4.getText().length()<=0)
                    {
                        constraintLayoutDateDelete4.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteDate4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteDate4.getText().length()>0)
                {
                    constraintLayoutDateDelete5.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteDate5.getText().length()<=0)
                    {
                        constraintLayoutDateDelete5.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editTextDeleteDate5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextDeleteDate5.getText().length()>0)
                {
                    constraintLayoutDateDelete6.setVisibility(View.VISIBLE);

                }
                else
                {
                    if(editTextDeleteDate6.getText().length()<=0)
                    {
                        constraintLayoutDateDelete6.setVisibility(View.GONE);
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //load du lieu tu thong tin chi tiet--------------------------------------------------------

        loadData();

        //click delete------------------------------------------------------------------------------

        final SQLite sqLite=new SQLite(this,"contact_new.sqlite",null,1);
        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqLite.Deletecontacts(ID);
                finish();
            }
        });
        //click save------------------------------------------------------------------------------

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateToSQLite();
                finish();
            }
        });

    
    }

    private void loadData() {

        Intent intent= getIntent();
        ID=intent.getStringExtra("id");
        editTextFirstName.setText(intent.getStringExtra("Fname"));
        editTextLastName.setText(intent.getStringExtra("Lname"));
        editTextAddrees.setText(intent.getStringExtra("dc"));
        spinnerPhone1.setSelection(intent.getIntExtra("numberkind1",1));
        spinnerPhone2.setSelection(intent.getIntExtra("numberkind2",1));
        spinnerPhone3.setSelection(intent.getIntExtra("numberkind3",1));
        spinnerPhone4.setSelection(intent.getIntExtra("numberkind4",1));
        spinnerPhone5.setSelection(intent.getIntExtra("numberkind5",1));
        spinnerPhone6.setSelection(intent.getIntExtra("numberkind6",1));
        editTextDeletePhone1.setText(intent.getStringExtra("numberphone1"));
        editTextDeletePhone2.setText(intent.getStringExtra("numberphone2"));
        editTextDeletePhone3.setText(intent.getStringExtra("numberphone3"));
        editTextDeletePhone4.setText(intent.getStringExtra("numberphone4"));
        editTextDeletePhone5.setText(intent.getStringExtra("numberphone5"));
        editTextDeletePhone6.setText(intent.getStringExtra("numberphone6"));
        editTextDeleteEmail1.setText(intent.getStringExtra("Mail1"));
        editTextDeleteEmail1.setText(intent.getStringExtra("Mail2"));
        editTextDeleteEmail1.setText(intent.getStringExtra("Mail3"));
        editTextDeleteEmail1.setText(intent.getStringExtra("Mail4"));
        editTextDeleteEmail1.setText(intent.getStringExtra("Mail5"));
        editTextDeleteEmail1.setText(intent.getStringExtra("Mail6"));
        spinnerDate1.setSelection(intent.getIntExtra("datekind1",1));
        spinnerDate2.setSelection(intent.getIntExtra("datekind2",1));
        spinnerDate3.setSelection(intent.getIntExtra("datekind3",1));
        spinnerDate4.setSelection(intent.getIntExtra("datekind4",1));
        spinnerDate5.setSelection(intent.getIntExtra("datekind5",1));
        spinnerDate6.setSelection(intent.getIntExtra("datekind6",1));
        editTextDeleteDate1.setText(intent.getStringExtra("date1"));
        editTextDeleteDate1.setText(intent.getStringExtra("date2"));
        editTextDeleteDate1.setText(intent.getStringExtra("date3"));
        editTextDeleteDate1.setText(intent.getStringExtra("date4"));
        editTextDeleteDate1.setText(intent.getStringExtra("date5"));
        editTextDeleteDate1.setText(intent.getStringExtra("date6"));

    }

    private void updateToSQLite() {
        if(editTextFirstName.getText().length()<=0&& editTextLastName.getText().length()<=0
                &&editTextDeleteDate1.getText().length()<=0&&editTextDeleteDate2.getText().length()<=0&&editTextDeleteDate3.getText().length()<=0&&editTextDeleteDate4.getText().length()<=0&&editTextDeleteDate5.getText().length()<=0&&editTextDeleteDate6.getText().length()<=0
                &&editTextDeletePhone1.getText().length()<=0&&editTextDeletePhone2.getText().length()<=0&&editTextDeletePhone3.getText().length()<=0&&editTextDeletePhone4.getText().length()<=0&&editTextDeletePhone5.getText().length()<=0&&editTextDeletePhone6.getText().length()<=0
                &&editTextAddrees.getText().length()<=0
                &&editTextDeleteEmail1.getText().length()<=0&&editTextDeleteEmail2.getText().length()<=0&&editTextDeleteEmail3.getText().length()<=0&&editTextDeleteEmail4.getText().length()<=0&&editTextDeleteEmail5.getText().length()<=0&&editTextDeleteEmail6.getText().length()<=0)
        {
            onBackPressed();
        }
        else {
            //thêm dữ liệu
            SQLite sqLite=new SQLite(this,"contact_new.sqlite",null,1);
            String spinPhone1= "";
            String spinPhone2= "";
            String spinPhone3= "";
            String spinPhone4= "";
            String spinPhone5= "";
            String spinPhone6= "";
            if(spinnerPhone1.getSelectedItem()!=null&&editTextDeletePhone1.getText().length()>0) {
                spinPhone1 = spinnerPhone1.getSelectedItem().toString();
            }
            if(spinnerPhone2.getSelectedItem()!=null&&editTextDeletePhone2.getText().length()>0) {
                spinPhone2 = spinnerPhone2.getSelectedItem().toString();
            }
            if(spinnerPhone3.getSelectedItem()!=null&&editTextDeletePhone3.getText().length()>0) {
                spinPhone3 = spinnerPhone3.getSelectedItem().toString();
            }
            if(spinnerPhone4.getSelectedItem()!=null&&editTextDeletePhone4.getText().length()>0) {
                spinPhone4 = spinnerPhone4.getSelectedItem().toString();
            }
            if(spinnerPhone5.getSelectedItem()!=null&&editTextDeletePhone5.getText().length()>0) {
                spinPhone5 = spinnerPhone5.getSelectedItem().toString();
            }
            if(spinnerPhone6.getSelectedItem()!=null&&editTextDeletePhone6.getText().length()>0) {
                spinPhone6 = spinnerPhone6.getSelectedItem().toString();
            }

            String spinDate1= "";
            String spinDate2= "";
            String spinDate3= "";
            String spinDate4= "";
            String spinDate5= "";
            String spinDate6= "";
            if(spinnerDate1.getSelectedItem()!=null&&editTextDeleteDate1.getText().length()>0) {
                spinDate1 = spinnerDate1.getSelectedItem().toString();
            }
            if(spinnerDate2.getSelectedItem()!=null&&editTextDeleteDate2.getText().length()>0) {
                spinDate2 = spinnerDate2.getSelectedItem().toString();
            }
            if(spinnerDate3.getSelectedItem()!=null&&editTextDeleteDate3.getText().length()>0) {
                spinDate3 = spinnerDate3.getSelectedItem().toString();
            }
            if(spinnerDate4.getSelectedItem()!=null&&editTextDeleteDate4.getText().length()>0) {
                spinDate4 = spinnerDate4.getSelectedItem().toString();
            }
            if(spinnerDate5.getSelectedItem()!=null&&editTextDeleteDate5.getText().length()>0) {
                spinDate5 = spinnerDate5.getSelectedItem().toString();
            }
            if(spinnerDate6.getSelectedItem()!=null&&editTextDeleteDate6.getText().length()>0) {
                spinDate6 = spinnerDate6.getSelectedItem().toString();
            }


            sqLite.Upadatecontacts(ID,"R.drawable.hinh1",editTextFirstName.getText().toString(),editTextLastName.getText().toString(),editTextAddrees.getText().toString(),
                    editTextDeletePhone1.getText().toString(),spinPhone1,editTextDeletePhone2.getText().toString(),spinPhone2,editTextDeletePhone3.getText().toString(),spinPhone3,editTextDeletePhone4.getText().toString(),spinPhone4,editTextDeletePhone5.getText().toString(),spinPhone5,editTextDeletePhone6.getText().toString(),spinPhone6,
                    editTextDeleteEmail1.getText().toString(),editTextDeleteEmail2.getText().toString(),editTextDeleteEmail3.getText().toString(),editTextDeleteEmail4.getText().toString(),editTextDeleteEmail5.getText().toString(),editTextDeleteEmail6.getText().toString(),
                    editTextDeleteDate1.getText().toString(),spinDate1,editTextDeleteDate2.getText().toString(),spinDate2,editTextDeleteDate3.getText().toString(),spinDate3,editTextDeleteDate4.getText().toString(),spinDate4,editTextDeleteDate5.getText().toString(),spinDate5,editTextDeleteDate6.getText().toString(),spinDate6);


            finish();
            startActivity(getIntent());
        }
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

        editTextFirstName= findViewById(R.id.editTextFirstDelete);
        editTextLastName= findViewById(R.id.editTextLastNameDelete);

        btndelete= findViewById(R.id.btnDelete);
        btnSave= findViewById(R.id.btnSave);


        imageViewAddress= (ImageView) findViewById(R.id.imgView_addressdelete);
        textViewAddress= (TextView) findViewById(R.id.txtView_addressdelete);
        editTextAddrees= (EditText) findViewById(R.id.edtText_addressdelete);

        constraintLayoutPhoneDelete1=findViewById(R.id.ConstraintlayoutPhoneDelete1);
        constraintLayoutPhoneDelete2=findViewById(R.id.ConstraintlayoutPhoneDelete2);
        constraintLayoutPhoneDelete3=findViewById(R.id.ConstraintlayoutPhoneDelete3);
        constraintLayoutPhoneDelete4=findViewById(R.id.ConstraintlayoutPhoneDelete4);
        constraintLayoutPhoneDelete5=findViewById(R.id.ConstraintlayoutPhoneDelete5);
        constraintLayoutPhoneDelete6=findViewById(R.id.ConstraintlayoutPhoneDelete6);
        editTextDeletePhone1= findViewById(R.id.edtText_phonedelete1);
        editTextDeletePhone2= findViewById(R.id.edtText_phonedelete2);
        editTextDeletePhone3= findViewById(R.id.edtText_phonedelete3);
        editTextDeletePhone4= findViewById(R.id.edtText_phonedelete4);
        editTextDeletePhone5= findViewById(R.id.edtText_phonedelete5);
        editTextDeletePhone6= findViewById(R.id.edtText_phonedelete6);

        constraintLayoutEmailDelete1=findViewById(R.id.ConstraintlayoutEmailDelete1);
        constraintLayoutEmailDelete2=findViewById(R.id.ConstraintlayoutEmailDelete2);
        constraintLayoutEmailDelete3=findViewById(R.id.ConstraintlayoutEmailDelete3);
        constraintLayoutEmailDelete4=findViewById(R.id.ConstraintlayoutEmailDelete4);
        constraintLayoutEmailDelete5=findViewById(R.id.ConstraintlayoutEmailDelete5);
        constraintLayoutEmailDelete6=findViewById(R.id.ConstraintlayoutEmailDelete6);
        editTextDeleteEmail1= findViewById(R.id.edtText_emaildelete1);
        editTextDeleteEmail2= findViewById(R.id.edtText_emaildelete2);
        editTextDeleteEmail3= findViewById(R.id.edtText_emaildelete3);
        editTextDeleteEmail4= findViewById(R.id.edtText_emaildelete4);
        editTextDeleteEmail5= findViewById(R.id.edtText_emaildelete5);
        editTextDeleteEmail6= findViewById(R.id.edtText_emaildelete6);

        constraintLayoutDateDelete1=findViewById(R.id.ConstraintlayoutDateDelete1);
        constraintLayoutDateDelete2=findViewById(R.id.ConstraintlayoutDateDelete2);
        constraintLayoutDateDelete3=findViewById(R.id.ConstraintlayoutDateDelete3);
        constraintLayoutDateDelete4=findViewById(R.id.ConstraintlayoutDateDelete4);
        constraintLayoutDateDelete5=findViewById(R.id.ConstraintlayoutDateDelete5);
        constraintLayoutDateDelete6=findViewById(R.id.ConstraintlayoutDateDelete6);
        editTextDeleteDate1= findViewById(R.id.edtText_datedelete1);
        editTextDeleteDate2= findViewById(R.id.edtText_datedelete2);
        editTextDeleteDate3= findViewById(R.id.edtText_datedelete3);
        editTextDeleteDate4= findViewById(R.id.edtText_datedelete4);
        editTextDeleteDate5= findViewById(R.id.edtText_datedelete5);
        editTextDeleteDate6= findViewById(R.id.edtText_datedelete6);


        //spinner
        spinnerPhone1 = findViewById(R.id.spinner_kind_phonedelete1);
        spinnerPhone2 = findViewById(R.id.spinner_kind_phonedelete2);
        spinnerPhone3 = findViewById(R.id.spinner_kind_phonedelete3);
        spinnerPhone4 = findViewById(R.id.spinner_kind_phonedelete4);
        spinnerPhone5 = findViewById(R.id.spinner_kind_phonedelete5);
        spinnerPhone6 = findViewById(R.id.spinner_kind_phonedelete6);

        spinnerDate1 = findViewById(R.id.spinner_kind_datedelete1);
        spinnerDate2 = findViewById(R.id.spinner_kind_datedelete2);
        spinnerDate3 = findViewById(R.id.spinner_kind_datedelete3);
        spinnerDate4 = findViewById(R.id.spinner_kind_datedelete4);
        spinnerDate5 = findViewById(R.id.spinner_kind_datedelete5);
        spinnerDate6 = findViewById(R.id.spinner_kind_datedelete6);





//        Intent intent = getIntent();
//        String[] output = intent.getStringExtra("name").split("\\s");
//        editTextFirst.setText(output[0]);
//        editTextLast.setText(output[1]);
//        editTextAddrees.setText(intent.getStringExtra("dc"));
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
                Toast.makeText(DeleteActivity.this, "từ trái sang phải", LENGTH_SHORT).show();
                onBackPressed();
            }
            return super.onFling(event1,event2,velocityX,velocityY);
        }
    }


}
