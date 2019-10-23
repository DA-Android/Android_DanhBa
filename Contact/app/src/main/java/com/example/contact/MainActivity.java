package com.example.contact;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.widget.ListView;

import com.example.contact.model.CircleImage;
import com.example.contact.model.CustomListAdapter;
import com.example.contact.model.listitem;
import com.example.contact.model.people;

import android.content.Intent;
import android.widget.ImageButton;
import android.view.GestureDetector;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity{
    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=50;
    private ImageButton btn1;
    //private Button btn1;
    CircleImage circleImage;
    private ImageButton btn_them;
    ListView listView;
    ArrayList<people> arrayList;
    ArrayList<people> arrayListcopy;
    CustomListAdapter adapter;
    SQLite sqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());


        btn1 =findViewById(R.id.suaxoa);
        btn_them = findViewById(R.id.them);
        listView =(ListView) findViewById(R.id.danhsach);
        arrayList=new ArrayList<>();
        SQLite sqLite;
        sqLite=new SQLite(this,"contact_list.sqlite",null,1);
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS CONTACTS(IDCONTACTS INTEGER PRIMARY KEY AUTOINCREMENT, HINH BLOB, FIRSTNAME NVARCHAR(100),LASTNAME NVARCHAR(100), EMAIL NVARCHAR(100), ADDRESS NVARCHAR(100) )");
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS PHONENUMBER(IDNUMBER INTERGER PRIMARY KEY, NUMBERS NVNARCHAR(10), NUMBERKIND NVARCHAR(10), IDCONTACTSNUMBER INTEGER REFERENCES CONTACTS(IDCONTACTS) )");
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS MAIL(IDMAIL INTEGER PRIMARY KEY AUTOINCREMENT, MAIL NVNARCHAR(100), IDCONTACTSMAIL INTEGER REFERENCES CONTACTS(IDCONTACTS) )");
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS DATE(IDDATE INTEGER PRIMARY KEY AUTOINCREMENT, DATETIME DATE(100), DATEKIND NVARCHAR(10), IDCONTACTSDATE INTEGER REFERENCES CONTACTS(IDCONTACTS) )");
        //thêm dữ liệu
        sqLite.Insertnumber("911","dd",1);
//        sqLite.Insertsanpham("R.drawable.hinh1","Ninh","nguyen","quang","911","113","112","115","thehoc");
//        sqLite.Insertsanpham("R.drawable.hinh1","Hoa","nguyen","quang","911","113","112","115","thehoc");
//        sqLite.Insertsanpham("R.drawable.hinh1","Vinh","Nguyễn","QUANGVINH24689@gmail.com","911","113","112","115","thehoc");
//        sqLite.Insertsanpham("R.drawable.hinh1","Hiếu","Lê","tronghieu12a1vvt@gmail.com","912","","","116","TP.HCM");
//        sqLite.Insertsanpham("R.mipmap.h2","Vy","Nguyễn","asxi1998@gmail.com","913","","","117","TP.HCM");
        Toast.makeText(MainActivity.this, "insert thanh cong", LENGTH_SHORT).show();
        Cursor cursor= sqLite.GetData("SELECT * FROM CONTACTS");
        while (cursor.moveToNext()){
            arrayList.add(new people(cursor.getInt(0),
                    cursor.getBlob(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4))
            );
        }
        Collections.sort(arrayList);
        adapter=new CustomListAdapter(this, R.layout.listitem, arrayList);
        listView.setAdapter(adapter);
//        sqLite.QueryData("CREATE TABLE IF NOT EXISTS CONTACTS(ID INTEGER PRIMARY KEY AUTOINCREMENT, FIRSTNAME NVARCHAR(100),LASTNAME NVARCHAR(100), COMPANY NVARCHAR(100) )");
//        sqLite.QueryData("CREATE TABLE IF NOT EXISTS PHONENUMBER(IDNUMBER INTERGER PRIMARY KEY, NUMBERS VNARCHAR(10), NUMBERKIND NVARCHAR(10), IDCONTACTSNUMBER INTEGER REFERENCES CONTACTS(ID) )");
//        sqLite.QueryData("CREATE TABLE IF NOT EXISTS MAIL(IDMAIL INTEGER PRIMARY KEY AUTOINCREMENT, MAIL VNARCHAR(100), IDCONTACTSMAIL INTEGER REFERENCES CONTACTS(ID) )");
//        sqLite.QueryData("CREATE TABLE IF NOT EXISTS DATE(IDDATE INTEGER PRIMARY KEY AUTOINCREMENT, DATETIME DATE(100), DATEKIND NVARCHAR(10), IDCONTACTSDATE INTEGER REFERENCES CONTACTS(ID) )");

//        sqLite.QueryData("INSERT INTO CONTACTS VALUES(null,'HOAN PHUNG THE') ");
        //sqLite =new SQLite(this,"ltdd_database",null,1);
//        Cursor getdata = sqLite.GetData("SELECT * FROM CONTACTS ");
//        while(getdata.moveToNext())
//        {
//            String giatri= getdata.getString(1);
//            Toast.makeText(this,giatri,Toast.LENGTH_SHORT).show();
//        }


//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,DeleteActivity.class);
//                startActivity(intent);
//            }
//        });


        // Khi người dùng click vào các ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent = new Intent(MainActivity.this, activity_thongtinchitiet.class);
                startActivity(intent);
            }
        });

        btn_them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,activity_insert.class);
                startActivity(intent);
            }
        });

    }
    private List<listitem> getListData() {
        List<listitem> list = new ArrayList<listitem>();
        String []ten=new String[]{"Vinh","Chánh","Boa","Anh","Ninh","Hoan"};
        Arrays.sort(ten);
        String images[]={"h1","h2","h3","h4","h5","h6"};
        for (int i=0;i<ten.length;i++)
        {
            list.add(new listitem(ten[i], images[i], ten[i].substring(0,1)));
        }
        return list;
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
            if(event1.getX()- event2.getX()>max && Math.abs(velocityX)>min)
            {
                Toast.makeText(MainActivity.this, "từ phải sang phải", LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, activity_insert.class);
                startActivity(intent);
            }
            return super.onFling(event1,event2,velocityX,velocityY);
        }
    }
//    private String[] getListDataheader() {
//        List<listitem> list = getListData();
//        int size =getListData().size();
//        String []tend=new String[size];
//        int i;
//        for (i=0;i<size;i++)
//        {
//            tend[i]=list.get(i).getCountryName().toString().substring(0,1);
//        }
//        return tend;
//    }
}
