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

import com.example.contact.model.CustomListAdapter;
import com.example.contact.model.listitem;
import com.example.contact.model.people;

import android.content.Intent;
import android.widget.ImageButton;
import android.view.GestureDetector;
import android.widget.SearchView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
    int max=100;
    int min=50;
    private ImageButton btn1;
    //private Button btn1;
    private ImageButton btn_them;
    ListView listView;
    ArrayList<people> arrayList;
    ArrayList<people> arrayListcopy;
    CustomListAdapter adapter;
    SQLite sqLite;
    SearchView editsearch;

    int vitri =0;

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
        sqLite=new SQLite(this,"contact_contact.sqlite",null,1);
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS PEOPLE(IDCONTACTS INTEGER PRIMARY KEY AUTOINCREMENT, HINH BLOB, FIRSTNAME NVARCHAR(100),LASTNAME NVARCHAR(100), ADDRESS NVARCHAR(100) )");
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS PHONENUMBER(IDNUMBER INTEGER PRIMARY KEY AUTOINCREMENT, NUMBERS NVNARCHAR(10), NUMBERKIND NVARCHAR(10), IDCONTACTSNUMBER INTEGER, FOREIGN KEY(IDCONTACTSNUMBER) REFERENCES PEOPLE(IDCONTACTS) )");
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS MAIL(IDMAIL INTEGER PRIMARY KEY AUTOINCREMENT, MAIL NVNARCHAR(100), IDCONTACTSMAIL INTEGER, FOREIGN KEY(IDCONTACTSMAIL) REFERENCES PEOPLE(IDCONTACTS) )");
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS DATE(IDDATE INTEGER PRIMARY KEY AUTOINCREMENT, DATETIME DATE(100), DATEKIND NVARCHAR(10), IDCONTACTSDATE INTEGER, FOREIGN KEY(IDCONTACTSDATE) REFERENCES PEOPLE(IDCONTACTS) )");
        //thêm dữ liệu
//        sqLite.Insertcontacts("R.drawable.hinh1","Hoan","Phung","thehoc");
//        sqLite.Insertnumber("0322555","",1);
//        sqLite.Insertdate("20/05/1998","",1);
//        sqLite.Insertemail("@hufi",1);
//
//        sqLite.Insertcontacts("R.drawable.hinh1","Vinh","Nguyen","thehoc");
//        sqLite.Insertnumber("0322333","",2);
//        sqLite.Insertdate("20/05/1998","",2);
//        sqLite.Insertemail("@hufi",2);
//
//        sqLite.Insertcontacts("R.drawable.hinh1","Hieu","Trong","thehoc");
//        sqLite.Insertnumber("0322666","",3);
//        sqLite.Insertdate("20/05/1998","",3);
//        sqLite.Insertemail("@hufi",3);
//
//        sqLite.Insertcontacts("R.drawable.hinh1","Hoa","Nguyen","thehoc");
//        sqLite.Insertnumber("0322222","",4);
//        sqLite.Insertdate("20/05/1998","",4);
//        sqLite.Insertemail("@hufi",4);
//
//        sqLite.Insertcontacts("R.drawable.hinh1","Thu","Tran","thehoc");
//        sqLite.Insertnumber("0322111","",5);
//        sqLite.Insertdate("20/05/1998","",5);
//        sqLite.Insertemail("@hufi",5);
//
//        sqLite.Insertcontacts("R.drawable.hinh1","Ninh","Bui","thehoc");
//        sqLite.Insertnumber("0322999","",6);
//        sqLite.Insertdate("20/05/1998","",6);
//        sqLite.Insertemail("@hufi",6);

        Toast.makeText(MainActivity.this, "insert thanh cong", LENGTH_SHORT).show();
        Cursor cursor= sqLite.GetData("SELECT * FROM PEOPLE, PHONENUMBER, MAIL, DATE WHERE PEOPLE.IDCONTACTS=PHONENUMBER.IDCONTACTSNUMBER AND PEOPLE.IDCONTACTS=MAIL.IDCONTACTSMAIL AND PEOPLE.IDCONTACTS=DATE.IDCONTACTSDATE");
       //Cursor cursor=sqLite.GetData("DELETE FROM DATE");
        while (cursor.moveToNext()){
            arrayList.add(new people(cursor.getInt(0),
                    cursor.getBlob(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getInt(5),
                    cursor.getString(6),
                    cursor.getString(7),
                    cursor.getInt(8),
                    cursor.getInt(9),
                    cursor.getString(10),
                    cursor.getInt(11),
                    cursor.getInt(12),
                    cursor.getString(13),
                    cursor.getString(14),
                    cursor.getInt(15)
                    )
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
        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setOnQueryTextListener(this);
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

    public boolean onQueryTextSubmit(String query) {

        return false;
    }

    public boolean onQueryTextChange(String newText) {
        String text = newText;
        adapter.filter(text);
        return false;
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
