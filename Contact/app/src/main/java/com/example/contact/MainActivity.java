package com.example.contact;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.widget.ListView;
import android.widget.Toast;

import com.example.contact.model.CircleImage;
import com.example.contact.model.CustomListAdapter;
import com.example.contact.model.listitem;
import android.content.Intent;
import android.widget.ImageButton;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    private ImageButton btn1;
    //private Button btn1;
    CircleImage circleImage;
    private ImageButton btn_them;

    SQLite sqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =findViewById(R.id.suaxoa);
        btn_them = findViewById(R.id.them);


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
        final List<listitem> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.danhsach);

        listView.setAdapter(new CustomListAdapter(this, image_details));

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
//            for(int j=i;j<images.length;j++) {
//
//            }
        }
        return list;
    }
    private String[] getListDataheader() {
        List<listitem> list = getListData();
        int size =getListData().size();
        String []tend=new String[size];
        int i;
        for (i=0;i<size;i++)
        {
            tend[i]=list.get(i).getCountryName().toString().substring(0,1);
        }
        return tend;
    }
}
