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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.contact.model.CustomListAdapter_ttct;
import com.example.contact.model.people;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import static android.widget.Toast.LENGTH_SHORT;

public class activity_thongtinchitiet extends AppCompatActivity {
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=100;
    private ImageButton back;
    private Button btn_update;

    private ImageButton btn_Call;
    private ImageButton btn_SMS;
    private ImageButton btn_CVideo;
    private ImageButton btn_GPS;
    TextView textViewname, textViewdc, textView2, textViewsdt, textView3, textViewsdt1, textView4,textViewsdt2, textView5, textViewsdt3, textViewmail;

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
        textViewname=findViewById(R.id.textView);
        textViewdc=findViewById(R.id.dc);
        textView2=findViewById(R.id.textView2);
        textViewsdt=findViewById(R.id.sdt);
        textViewmail=findViewById(R.id.txtemail);
        textView3=findViewById(R.id.textView3);
        textViewsdt1=findViewById(R.id.sdt1);
        textViewdc=findViewById(R.id.dc);
        textView4=findViewById(R.id.textView4);
        textViewsdt2=findViewById(R.id.sdt2);
        textView5=findViewById(R.id.textView5);
        textViewsdt3=findViewById(R.id.sdt3);
        Intent intent = getIntent();
        textViewname.setText(intent.getStringExtra("firstname")+" "+intent.getStringExtra("lastname"));
        textViewdc.setText(intent.getStringExtra("dc"));
        textView2.setText(intent.getStringExtra("numberkind"));
        textViewsdt.setText(intent.getStringExtra("numberphone"));
        textViewmail.setText(intent.getStringExtra("Mail"));

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
        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(activity_thongtinchitiet.this,DeleteActivity.class);
                startActivity(intent);
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
                    Call(123);
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
                    SMS(900);
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
        Intent intent  = new Intent(Intent.ACTION_VIEW,Uri.parse("sms:"+number));
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
}
