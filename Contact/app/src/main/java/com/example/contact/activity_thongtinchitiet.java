package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GestureDetectorCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.contact.model.CustomListAdapter_ttct;
import com.example.contact.model.people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static android.widget.Toast.LENGTH_SHORT;

public class activity_thongtinchitiet extends AppCompatActivity {
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=100;
    private ImageButton back;
    private Button btn_update;
    private String s;
    private ImageButton btn_Call;
    private ImageButton btn_SMS;
    private ImageButton btn_CVideo;
    private ImageButton btn_GPS;
    LinearLayout email1,email2,email3,email4,email5,email6,sodt1,sodt2,sodt3,sodt4,sodt5,sodt6,ngay1,ngay2,ngay3,ngay4,ngay5,ngay6;
    TextView textViewname, textViewdc,
            numberkind1, sdt1,  numberkind2, sdt2,  numberkind3, sdt3,  numberkind4, sdt4, numberkind5, sdt5, numberkind6, sdt6, mail1,mail2,mail3,mail4,mail5,mail6,
            datekind1, date1,datekind2, date2, datekind3, date3, datekind4, date4, datekind5, date5, datekind6, date6 ;

    ListView listView;
    ArrayList<Set<String>> peopleArrayList;
    ArrayList<people> arrayList_ttct;
    CustomListAdapter_ttct adapter_ttct;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinchitiet);
        arrayList_ttct= new ArrayList<>();
        ngay1=findViewById(R.id.ngay1);
        ngay2=findViewById(R.id.ngay2);
        ngay3=findViewById(R.id.ngay3);
        ngay4=findViewById(R.id.ngay4);
        ngay5=findViewById(R.id.ngay5);
        ngay6=findViewById(R.id.ngay6);
        sodt1=findViewById(R.id.sodt1);
        sodt2=findViewById(R.id.sodt2);
        sodt3=findViewById(R.id.sodt3);
        sodt4=findViewById(R.id.sodt4);
        sodt5=findViewById(R.id.sodt5);
        sodt6=findViewById(R.id.sodt6);
        email1=findViewById(R.id.email1);
        email2=findViewById(R.id.email2);
        email3=findViewById(R.id.email3);
        email4=findViewById(R.id.email4);
        email5=findViewById(R.id.email5);
        email6=findViewById(R.id.email6);
        textViewname=findViewById(R.id.textView);
        textViewdc=findViewById(R.id.dc);
        textViewdc.setEnabled(false);
        numberkind1=findViewById(R.id.numberkind1);
        sdt1=findViewById(R.id.sdt1);
        sdt1.setEnabled(false);
        numberkind2=findViewById(R.id.numberkind2);
        sdt2=findViewById(R.id.sdt2);
        sdt2.setEnabled(false);
        numberkind3=findViewById(R.id.numberkind3);
        sdt3=findViewById(R.id.sdt3);
        sdt3.setEnabled(false);
        numberkind4=findViewById(R.id.numberkind4);
        sdt4=findViewById(R.id.sdt4);
        sdt4.setEnabled(false);
        numberkind5=findViewById(R.id.numberkind5);
        sdt5=findViewById(R.id.sdt5);
        sdt5.setEnabled(false);
        numberkind6=findViewById(R.id.numberkind6);
        sdt6=findViewById(R.id.sdt6);
        mail1=findViewById(R.id.txtemail1);
        mail1.setEnabled(false);
        mail2=findViewById(R.id.txtemail2);
        mail2.setEnabled(false);
        mail3=findViewById(R.id.txtemail3);
        mail3.setEnabled(false);
        mail4=findViewById(R.id.txtemail4);
        mail4.setEnabled(false);
        mail5=findViewById(R.id.txtemail5);
        mail5.setEnabled(false);
        mail6=findViewById(R.id.txtemail6);
        mail6.setEnabled(false);
        datekind1=findViewById(R.id.datekind1);
        date1=findViewById(R.id.date1);
        date1.setEnabled(false);
        datekind2=findViewById(R.id.datekind2);
        date2=findViewById(R.id.date2);
        date2.setEnabled(false);
        datekind3=findViewById(R.id.datekind3);
        date3=findViewById(R.id.date3);
        date3.setEnabled(false);
        datekind4=findViewById(R.id.datekind4);
        date4=findViewById(R.id.date4);
        date4.setEnabled(false);
        datekind5=findViewById(R.id.datekind5);
        date5=findViewById(R.id.date5);
        date5.setEnabled(false);
        datekind6=findViewById(R.id.datekind6);
        date6=findViewById(R.id.date6);
        date6.setEnabled(false);
        Intent intent = getIntent();
        s=intent.getStringExtra("id");
        textViewname.setText(intent.getStringExtra("firstname")+" "+intent.getStringExtra("lastname"));
        textViewdc.setText(intent.getStringExtra("dc"));
        if(ktnull2(intent.getStringExtra("numberkind1"),intent.getStringExtra("numberphone1"))==false)
        {
            numberkind1.setVisibility(View.GONE);
            sdt1.setVisibility(View.GONE);
        }
        else {
            numberkind1.setText(intent.getStringExtra("numberkind1"));
            sdt1.setText(intent.getStringExtra("numberphone1"));
        }
        if(ktnull2(intent.getStringExtra("numberkind2"),intent.getStringExtra("numberphone2"))==false)
        {
            numberkind2.setVisibility(View.GONE);
            sdt2.setVisibility(View.GONE);
        }
        else {
            numberkind2.setText(intent.getStringExtra("numberkind2"));
            sdt2.setText(intent.getStringExtra("numberphone2"));
        }
        if(ktnull2(intent.getStringExtra("numberkind3"),intent.getStringExtra("numberphone3"))==false)
        {
            numberkind3.setVisibility(View.GONE);
            sdt3.setVisibility(View.GONE);
        }
        else {
            numberkind3.setText(intent.getStringExtra("numberkind3"));
            sdt3.setText(intent.getStringExtra("numberphone3"));
        }
        if(ktnull2(intent.getStringExtra("numberkind4"),intent.getStringExtra("numberphone4"))==false)
        {
            numberkind4.setVisibility(View.GONE);
            sdt4.setVisibility(View.GONE);
        }
        else {
            numberkind4.setText(intent.getStringExtra("numberkind4"));
            sdt4.setText(intent.getStringExtra("numberphone4"));
        }
        if(ktnull2(intent.getStringExtra("numberkind5"),intent.getStringExtra("numberphone5"))==false)
        {
            numberkind5.setVisibility(View.GONE);
            sdt5.setVisibility(View.GONE);
        }
        else {
            numberkind5.setText(intent.getStringExtra("numberkind5"));
            sdt5.setText(intent.getStringExtra("numberphone5"));
        }
        if(ktnull2(intent.getStringExtra("numberkind6"),intent.getStringExtra("numberphone6"))==false)
        {
            numberkind6.setVisibility(View.GONE);
            sdt6.setVisibility(View.GONE);
        }
        else {
            numberkind6.setText(intent.getStringExtra("numberkind6"));
            sdt6.setText(intent.getStringExtra("numberphone6"));
        }
        if(ktnull(intent.getStringExtra("Mail1"))==false) {
            email1.setVisibility(View.GONE);
        }
        else {
            mail1.setText(intent.getStringExtra("Mail1"));
        }
        if(ktnull(intent.getStringExtra("Mail2"))==false) {
            email2.setVisibility(View.GONE);
        }
        else {
            mail2.setText(intent.getStringExtra("Mail2"));
        }
        if(ktnull(intent.getStringExtra("Mail3"))==false) {
            email3.setVisibility(View.GONE);
        }
        else {
            mail3.setText(intent.getStringExtra("Mail3"));
        }
        if(ktnull(intent.getStringExtra("Mail4"))==false) {
            email4.setVisibility(View.GONE);
        }
        else {
            mail4.setText(intent.getStringExtra("Mail4"));
        }
        if(ktnull(intent.getStringExtra("Mail5"))==false) {
            email5.setVisibility(View.GONE);
        }
        else {
            mail5.setText(intent.getStringExtra("Mail5"));
        }
        if(ktnull(intent.getStringExtra("Mail6"))==false) {
            email6.setVisibility(View.GONE);
        }
        else {
            mail6.setText(intent.getStringExtra("Mail6"));
        }
        if(ktnull2(intent.getStringExtra("datekind1"),intent.getStringExtra("date1"))==false)
        {
            ngay1.setVisibility(View.GONE);
        }
        else {
            datekind1.setText(intent.getStringExtra("datekind1"));
            date1.setText(intent.getStringExtra("date1"));
        }
        if(ktnull2(intent.getStringExtra("datekind2"),intent.getStringExtra("date2"))==false)
        {
            ngay2.setVisibility(View.GONE);
        }
        else {
            datekind1.setText(intent.getStringExtra("datekind2"));
            date1.setText(intent.getStringExtra("date2"));
        }
        if(ktnull2(intent.getStringExtra("datekind3"),intent.getStringExtra("date3"))==false)
        {
           ngay3.setVisibility(View.GONE);
        }
        else {
            datekind1.setText(intent.getStringExtra("datekind3"));
            date1.setText(intent.getStringExtra("date3"));
        }
        if(ktnull2(intent.getStringExtra("datekind4"),intent.getStringExtra("date4"))==false)
        {
            ngay4.setVisibility(View.GONE);
        }
        else {
            datekind1.setText(intent.getStringExtra("datekind4"));
            date1.setText(intent.getStringExtra("date4"));
        }
        if(ktnull2(intent.getStringExtra("datekind5"),intent.getStringExtra("date5"))==false)
        {
            ngay5.setVisibility(View.GONE);
        }
        else {
            datekind1.setText(intent.getStringExtra("datekind5"));
            date1.setText(intent.getStringExtra("date5"));
        }
        if(ktnull2(intent.getStringExtra("datekind6"),intent.getStringExtra("date6"))==false)
        {
            ngay6.setVisibility(View.GONE);
        }
        else {
            datekind1.setText(intent.getStringExtra("datekind6"));
            date1.setText(intent.getStringExtra("date6"));
        }
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());
        back =findViewById(R.id.back);
        //quay trở về trang chính
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(activity_thongtinchitiet.this,MainActivity.class);
//                startActivity(intent);
                onBackPressed();//chỗ này quay lại nhé (Là nó hiển thị lại lần nào nữa đâu nha) !
            }
        });

        btn_update =findViewById(R.id.update);
        final String Fname=intent.getStringExtra("firstname");
        final String Lname=intent.getStringExtra("lastname");
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_thongtinchitiet.this,DeleteActivity.class);
                intent.putExtra("id", s);
                intent.putExtra("Fname",Fname);
                intent.putExtra("Lname",Lname);
                intent.putExtra("dc", textViewdc.getText().toString());
                intent.putExtra("numberkind1",getpositionofSpinnerPhone( numberkind1.getText().toString()));
                intent.putExtra("numberphone1", sdt1.getText().toString());
                intent.putExtra("numberkind2",getpositionofSpinnerPhone( numberkind2.getText().toString()));
                intent.putExtra("numberphone2", sdt2.getText().toString());
                intent.putExtra("numberkind3", getpositionofSpinnerPhone(numberkind3.getText().toString()));
                intent.putExtra("numberphone3", sdt3.getText().toString());
                intent.putExtra("numberkind4", getpositionofSpinnerPhone(numberkind4.getText().toString()));
                intent.putExtra("numberphone4", sdt4.getText().toString());
                intent.putExtra("numberkind5", getpositionofSpinnerPhone(numberkind5.getText().toString()));
                intent.putExtra("numberphone5", sdt5.getText().toString());
                intent.putExtra("numberkind6",getpositionofSpinnerPhone( numberkind6.getText().toString()));
                intent.putExtra("numberphone6", sdt6.getText().toString());
                intent.putExtra("Mail1", mail1.getText().toString());
                intent.putExtra("Mail2", mail2.getText().toString());
                intent.putExtra("Mail3", mail3.getText().toString());
                intent.putExtra("Mail4", mail4.getText().toString());
                intent.putExtra("Mail5", mail5.getText().toString());
                intent.putExtra("Mail6", mail6.getText().toString());
                intent.putExtra("datekind1",getpositionofSpinnerDate( datekind1.getText().toString()));
                intent.putExtra("date1", date1.getText().toString());
                intent.putExtra("datekind2", getpositionofSpinnerDate( datekind2.getText().toString()));
                intent.putExtra("date2", date2.getText().toString());
                intent.putExtra("datekind3", getpositionofSpinnerDate( datekind3.getText().toString()));
                intent.putExtra("date3", date3.getText().toString());
                intent.putExtra("datekind4", getpositionofSpinnerDate( datekind4.getText().toString()));
                intent.putExtra("date4", date4.getText().toString());
                intent.putExtra("datekind5",getpositionofSpinnerDate(  datekind5.getText().toString()));
                intent.putExtra("date5", date5.getText().toString());
                intent.putExtra("datekind6", getpositionofSpinnerDate( datekind6.getText().toString()));
                intent.putExtra("date6", date6.getText().toString());
                startActivity(intent);
            }
        });

        sodt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt1.getText().toString()));
                }
            }
        });
        sodt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt2.getText().toString()));
                }
            }
        });
        sodt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt3.getText().toString()));
                }
            }
        });
        sodt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt4.getText().toString()));
                }
            }
        });
        sodt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt4.getText().toString()));
                }
            }
        });
        sodt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt5.getText().toString()));
                }
            }
        });
        sodt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt6.getText().toString()));
                }
            }
        });
        btn_Call = findViewById(R.id.Call);
        btn_Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else {
                    Call(Integer.parseInt(sdt1.getText().toString()));
                }
            }
        });

        btn_SMS = findViewById(R.id.message);
        btn_SMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ContextCompat.checkSelfPermission(activity_thongtinchitiet.this, Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED)
                {
                    ActivityCompat.requestPermissions(activity_thongtinchitiet.this,new String[]{Manifest.permission.SEND_SMS},1);
                }
                else {
                    SMS(Integer.parseInt(sdt1.getText().toString()));
                }
            }
        });

        btn_CVideo = findViewById(R.id.videocall);
        btn_CVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setPackage("com.zing.zalo");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn_GPS = findViewById(R.id.Location);
        btn_GPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setPackage("com.google.android.apps.maps");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


    }
    public boolean ktnull(String s)
    {
        if(s.length()<=0)
        {
            return false;
        }
        return true;
    }
    public boolean ktnull2(String s1, String s2)
    {
        if(s1.length()<=0 && s2.length()<=0 )
        {
            return false;
        }
        return true;
    }
    public void check_permissions()
    {
        String[] permissions = new String[]{Manifest.permission.CALL_PHONE, Manifest.permission.SEND_SMS, Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};
        for(String permission : permissions)
        {
            if(ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(this, permissions,1);
            }
        }
    }

    //  gọi
    public void Call(int number)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel: +84"+number));
        startActivity(intent);
    }
    //  nhắn tin
    public  void SMS(int number)
    {
        Intent intent  = new Intent(Intent.ACTION_VIEW,Uri.parse("sms: +84"+number));
        startActivity(intent);
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
            if(event1.getX()- event2.getX()>max && Math.abs(velocityY)>min)
            {
                Toast.makeText(activity_thongtinchitiet.this, "từ phải sang trái", LENGTH_SHORT).show();
                Intent intent = new Intent(activity_thongtinchitiet.this, DeleteActivity.class);
                startActivity(intent);
            }
            if(event2.getX()- event1.getX()>max && Math.abs(velocityY)>min)
            {
                Toast.makeText(activity_thongtinchitiet.this, "từ trái sang phải", LENGTH_SHORT).show();
                onBackPressed();
            }
            return super.onFling(event1,event2,velocityX,velocityY);
        }
    }

    public int getpositionofSpinnerPhone(String spinner)
    {
        ArrayAdapter<String> adapter;
        List<String> list = new ArrayList<>();
        list.add("Mobile");
        list.add("Home");
        list.add("Company");
        list.add("Custom");
        adapter = new ArrayAdapter(activity_thongtinchitiet.this,R.layout.support_simple_spinner_dropdown_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

        return adapter.getPosition(spinner);
    }
    public int getpositionofSpinnerDate(String spinner)
    {
        ArrayAdapter<String> adapter1;
        List<String> list1 = new ArrayList<>();
        list1.add("Annyversary");
        list1.add("Birthday");
        list1.add("Bigday");
        list1.add("Specialday");
        list1.add("Other");
        adapter1 = new ArrayAdapter(activity_thongtinchitiet.this,R.layout.support_simple_spinner_dropdown_item,list1);
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);

       return adapter1.getPosition(spinner);
    }
}
