package com.example.contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GestureDetectorCompat;

import android.accounts.OnAccountsUpdateListener;
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
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=100;
    ImageView imageViewAddress;
    EditText editTextAddrees;
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


        //click delete------------------------------------------------------------------------------

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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

        btndelete= findViewById(R.id.btnDelete);

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
