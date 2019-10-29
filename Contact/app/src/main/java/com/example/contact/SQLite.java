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

import com.example.contact.model.DATE;

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
    void Insertcontacts( String hinh, String FIRST_NAME, String LAST_NAME,String EMAIL, String ADDRESS)
    {
        //chuyển hình từ Imageview =>byte[]
//        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
//        Bitmap bitmap =drawable.getBitmap();
//        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
//        byte[] hinhanh=byteArray.toByteArray();
        //-----------------------------------------------------------------------------

        SQLiteDatabase db=getWritableDatabase();
        String sql="Insert into PEOPLE values (null,?,?,?,?,?)";
        SQLiteStatement sqLiteStatement=db.compileStatement(sql);
        sqLiteStatement.clearBindings();
        sqLiteStatement.bindString(1,hinh);
        sqLiteStatement.bindString(2,FIRST_NAME);
        sqLiteStatement.bindString(3,LAST_NAME);
        sqLiteStatement.bindString(4,LAST_NAME);
        sqLiteStatement.bindString(5,ADDRESS);
        sqLiteStatement.executeInsert();
    }
    void Insertemail( String MAIL, int IDCONTACTSMAIL)
    {
        //chuyển hình từ Imageview =>byte[]
//        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
//        Bitmap bitmap =drawable.getBitmap();
//        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
//        byte[] hinhanh=byteArray.toByteArray();
        //-----------------------------------------------------------------------------

        SQLiteDatabase db=getWritableDatabase();
        String sql="Insert into MAIL values (null,?,?)";
        SQLiteStatement statement=db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,MAIL);
        statement.bindLong(2,IDCONTACTSMAIL);
        statement.executeInsert();
    }
    void Insertnumber( String NUMBERS,String NUMBERKIND, int IDCONTACTSNUMBER)
    {
        //chuyển hình từ Imageview =>byte[]
//        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
//        Bitmap bitmap =drawable.getBitmap();
//        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
//        byte[] hinhanh=byteArray.toByteArray();
        //-----------------------------------------------------------------------------

        SQLiteDatabase db=getWritableDatabase();
        String sql="Insert into PHONENUMBER values (null,?,?,?)";
        SQLiteStatement statement=db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,NUMBERS);
        statement.bindString(2,NUMBERKIND);
        statement.bindLong(3,IDCONTACTSNUMBER);
        statement.executeInsert();
    }
    void Insertdate(DATE DATETIME, String DATEKIND, int IDCONTACTSDATE)
    {
        //chuyển hình từ Imageview =>byte[]
//        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
//        Bitmap bitmap =drawable.getBitmap();
//        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
//        byte[] hinhanh=byteArray.toByteArray();
        //-----------------------------------------------------------------------------

        SQLiteDatabase db=getWritableDatabase();
        String sql="Insert into DATE values (null,?,?,?)";
        SQLiteStatement statement=db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1,DATETIME.toString());
        statement.bindString(2,DATEKIND);
        statement.bindLong(3,IDCONTACTSDATE);
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
