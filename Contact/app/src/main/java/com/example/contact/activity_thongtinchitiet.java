package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_thongtinchitiet extends AppCompatActivity {
    private ImageButton back;
    private Button btn_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinchitiet);
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
}
