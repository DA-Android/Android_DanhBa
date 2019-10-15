package com.example.contact;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;

public class SQLite extends SQLiteOpenHelper {


    private Context context;
    public SQLite(Context context, String DATABASE_NAME, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME,null, 1);

    }

    public void QueryData(String sql)
    {
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL(sql);
    }
    void Insertsanpham( String hinh, String FIRST_NAME, String LAST_NAME, String EMAIL, String NUMBER_PHONE, String NUMBER_HOME, String NUMBER_COMPANY, String NUMBER_ZALO, String ADDRESS)
    {
        //chuyển hình từ Imageview =>byte[]
//        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
//        Bitmap bitmap =drawable.getBitmap();
//        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
//        byte[] hinhanh=byteArray.toByteArray();
        //-----------------------------------------------------------------------------

        SQLiteDatabase db=getWritableDatabase();
        String sql="Insert into CONTACTS values (null,?,?,?,?,?,?,?,?,?)";
        SQLiteStatement statement=db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,hinh);
        statement.bindString(2,FIRST_NAME);
        statement.bindString(3,LAST_NAME);
        statement.bindString(4,EMAIL);
        statement.bindString(5,NUMBER_PHONE);
        statement.bindString(6,NUMBER_HOME);
        statement.bindString(7,NUMBER_COMPANY);
        statement.bindString(8,NUMBER_ZALO);
        statement.bindString(9,ADDRESS);
        statement.executeInsert();
    }
    public Cursor GetData(String sql)
    {
        SQLiteDatabase db=getReadableDatabase();
        return db.rawQuery(sql,null);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
