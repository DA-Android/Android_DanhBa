package com.example.contact;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.widget.ListView;

import com.example.contact.model.CustomListAdapter;
import com.example.contact.model.Custommycard;
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
    ListView listView,listView1;
    ArrayList<people> arrayList;
    ArrayList<people> arrayListmycard;
    ArrayList<people> arrayListcopy;
    CustomListAdapter adapter;
    Custommycard adaptermycard;
    SQLite sqLite;
    SearchView editsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());


        btn_them = findViewById(R.id.them);
        listView =(ListView) findViewById(R.id.danhsach);
        //listView1=findViewById(R.id.mycard);
        arrayList=new ArrayList<people>();
        arrayListmycard=new ArrayList<people>();
        SQLite sqLite;
        sqLite=new SQLite(this,"contact_new.sqlite",null,2);
        sqLite.QueryData("CREATE TABLE IF NOT EXISTS PEOPLE(IDCONTACTS INTEGER PRIMARY KEY AUTOINCREMENT, HINH BLOB, FIRSTNAME NVARCHAR(100),LASTNAME NVARCHAR(100), ADDRESS NVARCHAR(100), " +
                "NUMBERS1 NVNARCHAR(13), NUMBERKIND1 NVARCHAR(100), NUMBERS2 NVNARCHAR(13), NUMBERKIND2 NVARCHAR(100), NUMBERS3 NVNARCHAR(13), NUMBERKIND3 NVARCHAR(100), NUMBERS4 NVNARCHAR(13), NUMBERKIND4 NVARCHAR(100), NUMBERS5 NVNARCHAR(13), NUMBERKIND5 NVARCHAR(100), NUMBERS6 NVNARCHAR(13), NUMBERKIND6 NVARCHAR(100), " +
                "MAIL1 NVNARCHAR(100), MAIL2 NVNARCHAR(100), MAIL3 NVNARCHAR(100), MAIL4 NVNARCHAR(100), MAIL5 NVNARCHAR(100), MAIL6 NVNARCHAR(100), " +
                "DATETIME1 DATE(100), DATEKIND1 NVARCHAR(100), DATETIME2 DATE(100), DATEKIND2 NVARCHAR(100), DATETIME3 DATE(100), DATEKIND3 NVARCHAR(100), DATETIME4 DATE(100), DATEKIND4 NVARCHAR(100), DATETIME5 DATE(100), DATEKIND5 NVARCHAR(100), DATETIME6 DATE(100), DATEKIND6 NVARCHAR(100))");

//        sqLite.QueryData("CREATE TABLE IF NOT EXISTS MYCARD(IDCONTACTS INTEGER PRIMARY KEY AUTOINCREMENT, HINH BLOB, FIRSTNAME NVARCHAR(100),LASTNAME NVARCHAR(100), ADDRESS NVARCHAR(100), " +
//                "NUMBERS1 NVNARCHAR(13), NUMBERKIND1 NVARCHAR(100), NUMBERS2 NVNARCHAR(13), NUMBERKIND2 NVARCHAR(100), NUMBERS3 NVNARCHAR(13), NUMBERKIND3 NVARCHAR(100), NUMBERS4 NVNARCHAR(13), NUMBERKIND4 NVARCHAR(100), NUMBERS5 NVNARCHAR(13), NUMBERKIND5 NVARCHAR(100), NUMBERS6 NVNARCHAR(13), NUMBERKIND6 NVARCHAR(100), " +
//                "MAIL1 NVNARCHAR(100), MAIL2 NVNARCHAR(100), MAIL3 NVNARCHAR(100), MAIL4 NVNARCHAR(100), MAIL5 NVNARCHAR(100), MAIL6 NVNARCHAR(100), " +
//                "DATETIME1 DATE(100), DATEKIND1 NVARCHAR(100), DATETIME2 DATE(100), DATEKIND2 NVARCHAR(100), DATETIME3 DATE(100), DATEKIND3 NVARCHAR(100), DATETIME4 DATE(100), DATEKIND4 NVARCHAR(100), DATETIME5 DATE(100), DATEKIND5 NVARCHAR(100), DATETIME6 DATE(100), DATEKIND6 NVARCHAR(100))");
       // sqLite.QueryData("CREATE TABLE IF NOT EXISTS PHONENUMBER(IDNUMBER INTEGER PRIMARY KEY AUTOINCREMENT, NUMBERS NVNARCHAR(10), NUMBERKIND NVARCHAR(10), IDCONTACTSNUMBER INTEGER, FOREIGN KEY(IDCONTACTSNUMBER) REFERENCES PEOPLE(IDCONTACTS) )");
       // sqLite.QueryData("CREATE TABLE IF NOT EXISTS MAIL(IDMAIL INTEGER PRIMARY KEY AUTOINCREMENT, MAIL NVNARCHAR(100), IDCONTACTSMAIL INTEGER, FOREIGN KEY(IDCONTACTSMAIL) REFERENCES PEOPLE(IDCONTACTS) )");
       // sqLite.QueryData("CREATE TABLE IF NOT EXISTS DATE(IDDATE INTEGER PRIMARY KEY AUTOINCREMENT, DATETIME DATE(100), DATEKIND NVARCHAR(10), IDCONTACTSDATE INTEGER, FOREIGN KEY(IDCONTACTSDATE) REFERENCES PEOPLE(IDCONTACTS) )");
        //thêm dữ liệu
//        sqLite.Insertcontacts("R.drawable.hinh1","Hoan","Phùng","thehoc",
//                "0398704477","Phone","0869871185","Home","","","","","","","","",
//                "@hufi","","","","","",
//                "14/07/1998","sinhnhat","","","","","","","","","","");
//        sqLite.Insertcontacts("R.drawable.hinh1","Vinh","Nguyen","thehoc",
//                "0869871185","Phone","","","","","","","","","","",
//                "@hufi","","","","","",
//                "20/05/1998","sinhnhat","","","","","","","","","","");
//        sqLite.Insertcontacts("R.drawable.hinh1","Hieu","Trong","thehoc",
//                "0358166699","Phone","","","","","","","","","","",
//                "@hufi","","","","","",
//                "11/05/1998","sinhnhat","","","","","","","","","","");
//        sqLite.Insertcontacts("R.drawable.hinh1","Thu","Trần","thehoc",
//                "0985924900","Phone","","","","","","","","","","",
//                "@hufi","","","","","",
//                "12/12/1998","sinhnhat","","","","","","","","","","");
//        sqLite.Insertcontacts("R.drawable.hinh1","Ninh","Bùi","thehoc",
//                "0376007840","Phone","0376007840","Zalo","","","","","","","","",
//                "@hufi","","","","","",
//                "12/12/1998","sinhnhat","","","","","","","","","","");

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

        Cursor cursor= sqLite.GetData("SELECT * FROM PEOPLE");
       //Cursor cursor=sqLite.GetData("DELETE FROM PEOPLE");
        while (cursor.moveToNext()){
            arrayList.add(new people(cursor.getInt(0),
                    cursor.getBlob(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7),
                    cursor.getString(8),
                    cursor.getString(9),
                    cursor.getString(10),
                    cursor.getString(11),
                    cursor.getString(12),
                    cursor.getString(13),
                    cursor.getString(14),
                    cursor.getString(15),
                    cursor.getString(16),
                    cursor.getString(17),
                    cursor.getString(18),
                    cursor.getString(19),
                    cursor.getString(20),
                    cursor.getString(21),
                    cursor.getString(22),
                    cursor.getString(23),
                    cursor.getString(24),
                    cursor.getString(25),
                    cursor.getString(26),
                    cursor.getString(27),
                    cursor.getString(28),
                    cursor.getString(29),
                    cursor.getString(30),
                    cursor.getString(31),
                    cursor.getString(32),
                    cursor.getString(33),
                    cursor.getString(34)
                    )
            );
        }
        Collections.sort(arrayList);
        adapter = new CustomListAdapter(this, R.layout.listitem, arrayList);
        listView.setAdapter(adapter);

//        sqLite.Insertmycard("R.drawable.hinh1","Hoan","Phùng","thehoc",
//                "0398704477","Phone","0869871185","Home","","","","","","","","",
//                "@hufi","","","","","",
//                "14/07/1998","sinhnhat","","","","","","","","","","");
//        Cursor cursor1= sqLite.GetData("SELECT * FROM MYCARD");
//        while (cursor1.moveToNext()){
//            arrayListmycard.add(new people(cursor.getInt(0),
//                            cursor.getBlob(1),
//                            cursor.getString(2),
//                            cursor.getString(3),
//                            cursor.getString(4),
//                            cursor.getString(5),
//                            cursor.getString(6),
//                            cursor.getString(7),
//                            cursor.getString(8),
//                            cursor.getString(9),
//                            cursor.getString(10),
//                            cursor.getString(11),
//                            cursor.getString(12),
//                            cursor.getString(13),
//                            cursor.getString(14),
//                            cursor.getString(15),
//                            cursor.getString(16),
//                            cursor.getString(17),
//                            cursor.getString(18),
//                            cursor.getString(19),
//                            cursor.getString(20),
//                            cursor.getString(21),
//                            cursor.getString(22),
//                            cursor.getString(23),
//                            cursor.getString(24),
//                            cursor.getString(25),
//                            cursor.getString(26),
//                            cursor.getString(27),
//                            cursor.getString(28),
//                            cursor.getString(29),
//                            cursor.getString(30),
//                            cursor.getString(31),
//                            cursor.getString(32),
//                            cursor.getString(33),
//                            cursor.getString(34)
//                    )
//            );
//
//        }
//
//        adaptermycard = new Custommycard(this, R.layout.itemmycard, arrayListmycard);
//        listView1.setAdapter(adaptermycard);

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
                intent.putExtra("id", String.valueOf(arrayList.get(position).getID()));
                intent.putExtra("firstname", String.valueOf(arrayList.get(position).getFIRST_NAME()));
                intent.putExtra("lastname", String.valueOf(arrayList.get(position).getLAST_NAME()));
                intent.putExtra("dc", String.valueOf(arrayList.get(position).getADDRESS()));
                intent.putExtra("numberkind1", String.valueOf(arrayList.get(position).getNUMBERKIND1()));
                intent.putExtra("numberphone1", String.valueOf(arrayList.get(position).getNUMBERS1()));
                intent.putExtra("numberkind2", String.valueOf(arrayList.get(position).getNUMBERKIND2()));
                intent.putExtra("numberphone2", String.valueOf(arrayList.get(position).getNUMBERS2()));
                intent.putExtra("numberkind3", String.valueOf(arrayList.get(position).getNUMBERKIND3()));
                intent.putExtra("numberphone3", String.valueOf(arrayList.get(position).getNUMBERS3()));
                intent.putExtra("numberkind4", String.valueOf(arrayList.get(position).getNUMBERKIND4()));
                intent.putExtra("numberphone4", String.valueOf(arrayList.get(position).getNUMBERS4()));
                intent.putExtra("numberkind5", String.valueOf(arrayList.get(position).getNUMBERKIND5()));
                intent.putExtra("numberphone5", String.valueOf(arrayList.get(position).getNUMBERS5()));
                intent.putExtra("numberkind6", String.valueOf(arrayList.get(position).getNUMBERKIND6()));
                intent.putExtra("numberphone6", String.valueOf(arrayList.get(position).getNUMBERS6()));
                intent.putExtra("Mail1", String.valueOf(arrayList.get(position).getMAIL1()));
                intent.putExtra("Mail2", String.valueOf(arrayList.get(position).getMAIL2()));
                intent.putExtra("Mail3", String.valueOf(arrayList.get(position).getMAIL3()));
                intent.putExtra("Mail4", String.valueOf(arrayList.get(position).getMAIL4()));
                intent.putExtra("Mail5", String.valueOf(arrayList.get(position).getMAIL5()));
                intent.putExtra("Mail6", String.valueOf(arrayList.get(position).getMAIL6()));
                intent.putExtra("datekind1", String.valueOf(arrayList.get(position).getDATEKIND1()));
                intent.putExtra("date1", String.valueOf(arrayList.get(position).getDATETIME1()));
                intent.putExtra("datekind2", String.valueOf(arrayList.get(position).getDATEKIND2()));
                intent.putExtra("date2", String.valueOf(arrayList.get(position).getDATETIME2()));
                intent.putExtra("datekind3", String.valueOf(arrayList.get(position).getDATEKIND3()));
                intent.putExtra("date3", String.valueOf(arrayList.get(position).getDATETIME3()));
                intent.putExtra("datekind4", String.valueOf(arrayList.get(position).getDATEKIND4()));
                intent.putExtra("date4", String.valueOf(arrayList.get(position).getDATETIME4()));
                intent.putExtra("datekind5", String.valueOf(arrayList.get(position).getDATEKIND5()));
                intent.putExtra("date5", String.valueOf(arrayList.get(position).getDATETIME5()));
                intent.putExtra("datekind6", String.valueOf(arrayList.get(position).getDATEKIND6()));
                intent.putExtra("date6", String.valueOf(arrayList.get(position).getDATETIME6()));
                startActivity(intent);
            }
        });



        btn_them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,activity_insert.class);
                startActivity(intent);
                adapter.notifyDataSetChanged();
            }
        });
        editsearch = (SearchView) findViewById(R.id.search);
        editsearch.setQuery("",false);
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
