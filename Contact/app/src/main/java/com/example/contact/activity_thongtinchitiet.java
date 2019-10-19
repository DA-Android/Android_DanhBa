package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class activity_thongtinchitiet extends AppCompatActivity {
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=100;
    private ImageButton back;
    private Button btn_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinchitiet);
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
