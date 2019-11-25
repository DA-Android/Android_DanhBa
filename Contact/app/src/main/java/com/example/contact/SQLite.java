package com.example.contact;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.provider.Contacts;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.contact.model.DATE;

import java.io.ByteArrayOutputStream;

public class SQLite extends SQLiteOpenHelper {


    private Context context;
    public SQLite(Context context, String DATABASE_NAME, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME,null, 1);

    }

    SQLiteDatabase db = this.getWritableDatabase();
    public void QueryData(String sql)
    {
         db=getWritableDatabase();
        db.execSQL(sql);
    }
    void Upadatecontacts(String ID,String hinh, String FIRST_NAME, String LAST_NAME, String ADDRESS,
                         String NUMBERS1, String NUMBERKIND1, String NUMBERS2, String NUMBERKIND2, String NUMBERS3, String NUMBERKIND3, String NUMBERS4, String NUMBERKIND4, String NUMBERS5, String NUMBERKIND5, String NUMBERS6, String NUMBERKIND6,
                         String MAIL1, String MAIL2, String MAIL3, String MAIL4, String MAIL5, String MAIL6,
                         String DATETIME1, String DATEKIND1, String DATETIME2, String DATEKIND2, String DATETIME3, String DATEKIND3, String DATETIME4, String DATEKIND4, String DATETIME5, String DATEKIND5, String DATETIME6, String DATEKIND6)
    {
        ContentValues values= new ContentValues();
        values.put("HINH",hinh);
        values.put("FIRSTNAME",FIRST_NAME);
        values.put("LASTNAME",LAST_NAME);
        values.put("ADDRESS",ADDRESS);
        values.put("NUMBERS1",NUMBERS1);
        values.put("NUMBERKIND1",NUMBERKIND1);
        values.put("NUMBERS2",NUMBERS2);
        values.put("NUMBERKIND2",NUMBERKIND2);
        values.put("NUMBERS3",NUMBERS3);
        values.put("NUMBERKIND3",NUMBERKIND3);
        values.put("NUMBERS4",NUMBERS4);
        values.put("NUMBERKIND4",NUMBERKIND4);
        values.put("NUMBERS5",NUMBERS5);
        values.put("NUMBERKIND5",NUMBERKIND5);
        values.put("NUMBERS6",NUMBERS6);
        values.put("NUMBERKIND6",NUMBERKIND6);
        values.put("MAIL1",MAIL1);
        values.put("MAIL2",MAIL2);
        values.put("MAIL3",MAIL3);
        values.put("MAIL4",MAIL4);
        values.put("MAIL5",MAIL5);
        values.put("MAIL6",MAIL6);
        values.put("DATETIME1",DATETIME1);
        values.put("DATEKIND1",DATEKIND1);
        values.put("DATETIME2",DATETIME2);
        values.put("DATEKIND2",DATEKIND2);
        values.put("DATETIME3",DATETIME3);
        values.put("DATEKIND3",DATEKIND3);
        values.put("DATETIME4",DATETIME4);
        values.put("DATEKIND4",DATEKIND4);
        values.put("DATETIME5",DATETIME5);
        values.put("DATEKIND5",DATEKIND5);
        values.put("DATEKIND6",DATETIME6);
        values.put("DATETIME6",DATEKIND6);

        int resurft=db.update("PEOPLE",values, "IDCONTACTS = ?", new String[] { ID });
        db.close();
        if(resurft==0)
        {
            //fail
        }
        else
        {
            //success
        }
    }
    void Deletecontacts(String ID)
    {
        int resurft=db.delete("PEOPLE", "IDCONTACTS = ?", new String[] { ID });
        db.close();
        if(resurft==0)
        {
            //fail
        }
        else
        {
            //success
        }
    }
    void Insertcontacts(String hinh, String FIRST_NAME, String LAST_NAME, String ADDRESS,
                        String NUMBERS1, String NUMBERKIND1, String NUMBERS2, String NUMBERKIND2, String NUMBERS3, String NUMBERKIND3, String NUMBERS4, String NUMBERKIND4, String NUMBERS5, String NUMBERKIND5, String NUMBERS6, String NUMBERKIND6,
                        String MAIL1, String MAIL2, String MAIL3, String MAIL4, String MAIL5, String MAIL6,
                        String DATETIME1, String DATEKIND1, String DATETIME2, String DATEKIND2, String DATETIME3, String DATEKIND3, String DATETIME4, String DATEKIND4, String DATETIME5, String DATEKIND5, String DATETIME6, String DATEKIND6)
    {
        //chuyển hình từ Imageview =>byte[]
//        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
//        Bitmap bitmap =drawable.getBitmap();
//        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
//        byte[] hinhanh=byteArray.toByteArray();
        //-----------------------------------------------------------------------------

         db=getWritableDatabase();
        String sql="Insert into PEOPLE values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        SQLiteStatement sqLiteStatement=db.compileStatement(sql);
        sqLiteStatement.clearBindings();
        sqLiteStatement.bindString(1,hinh);
        sqLiteStatement.bindString(2,FIRST_NAME);
        sqLiteStatement.bindString(3,LAST_NAME);
        sqLiteStatement.bindString(4,ADDRESS);
        sqLiteStatement.bindString(5,NUMBERS1);
        sqLiteStatement.bindString(6,NUMBERKIND1);
        sqLiteStatement.bindString(7,NUMBERS2);
        sqLiteStatement.bindString(8,NUMBERKIND2);
        sqLiteStatement.bindString(9,NUMBERS3);
        sqLiteStatement.bindString(10,NUMBERKIND3);
        sqLiteStatement.bindString(11,NUMBERS4);
        sqLiteStatement.bindString(12,NUMBERKIND4);
        sqLiteStatement.bindString(13,NUMBERS5);
        sqLiteStatement.bindString(14,NUMBERKIND5);
        sqLiteStatement.bindString(15,NUMBERS6);
        sqLiteStatement.bindString(16,NUMBERKIND6);
        sqLiteStatement.bindString(17,MAIL1);
        sqLiteStatement.bindString(18,MAIL2);
        sqLiteStatement.bindString(19,MAIL3);
        sqLiteStatement.bindString(20,MAIL4);
        sqLiteStatement.bindString(21,MAIL5);
        sqLiteStatement.bindString(22,MAIL6);
        sqLiteStatement.bindString(23,DATETIME1);
        sqLiteStatement.bindString(24,DATEKIND1);
        sqLiteStatement.bindString(25,DATETIME2);
        sqLiteStatement.bindString(26,DATEKIND2);
        sqLiteStatement.bindString(27,DATETIME3);
        sqLiteStatement.bindString(28,DATEKIND3);
        sqLiteStatement.bindString(29,DATETIME4);
        sqLiteStatement.bindString(30,DATEKIND4);
        sqLiteStatement.bindString(31,DATETIME5);
        sqLiteStatement.bindString(32,DATEKIND5);
        sqLiteStatement.bindString(33,DATETIME6);
        sqLiteStatement.bindString(34,DATEKIND6);
        sqLiteStatement.executeInsert();
    }
//    void Insertemail( String MAIL, int IDCONTACTSMAIL)
//    {
//        //chuyển hình từ Imageview =>byte[]
////        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
////        Bitmap bitmap =drawable.getBitmap();
////        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
////        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
////        byte[] hinhanh=byteArray.toByteArray();
//        //-----------------------------------------------------------------------------
//
//        SQLiteDatabase db=getWritableDatabase();
//        String sql="Insert into MAIL values (null,?,?)";
//        SQLiteStatement statement=db.compileStatement(sql);
//        statement.clearBindings();
//        statement.bindString(1,MAIL);
//        statement.bindLong(2,IDCONTACTSMAIL);
//        statement.executeInsert();
//    }
//    void Insertnumber( String NUMBERS,String NUMBERKIND, int IDCONTACTSNUMBER)
//    {
//        //chuyển hình từ Imageview =>byte[]
////        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
////        Bitmap bitmap =drawable.getBitmap();
////        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
////        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
////        byte[] hinhanh=byteArray.toByteArray();
//        //-----------------------------------------------------------------------------
//
//        SQLiteDatabase db=getWritableDatabase();
//        String sql="Insert into PHONENUMBER values (null,?,?,?)";
//        SQLiteStatement statement=db.compileStatement(sql);
//        statement.clearBindings();
//        statement.bindString(1,NUMBERS);
//        statement.bindString(2,NUMBERKIND);
//        statement.bindLong(3,IDCONTACTSNUMBER);
//        statement.executeInsert();
//    }
//    void Insertdate(String DATETIME, String DATEKIND, int IDCONTACTSDATE)
//    {
//        //chuyển hình từ Imageview =>byte[]
////        BitmapDrawable drawable= (BitmapDrawable) img.getDrawable();
////        Bitmap bitmap =drawable.getBitmap();
////        ByteArrayOutputStream byteArray =new ByteArrayOutputStream();
////        bitmap.compress(Bitmap.CompressFormat.PNG,60,byteArray);
////        byte[] hinhanh=byteArray.toByteArray();
//        //-----------------------------------------------------------------------------
//
//        SQLiteDatabase db=getWritableDatabase();
//        String sql="Insert into DATE values (null,?,?,?)";
//        SQLiteStatement statement=db.compileStatement(sql);
//        statement.clearBindings();
//        statement.bindString(1,DATETIME.toString());
//        statement.bindString(2,DATEKIND);
//        statement.bindLong(3,IDCONTACTSDATE);
//        statement.executeInsert();
//    }
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
