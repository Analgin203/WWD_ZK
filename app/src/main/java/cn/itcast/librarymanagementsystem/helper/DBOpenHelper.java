package cn.itcast.librarymanagementsystem.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import cn.itcast.librarymanagementsystem.model.UserData;

public class DBOpenHelper extends SQLiteOpenHelper {
    private SQLiteDatabase db;
    public DBOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        db = getReadableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL("CREATE TABLE IF NOT EXISTS user(" +
                "_id INIEGER PRIMARY KEY AUTOINCREMENT," +
                "username TEXT," +
                "password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }


    public void add(String username,String password){
        db.execSQL("INSERT INTO user(username,password)VALUES(?,?)",new Object[]{username,password});
    }
    public ArrayList<UserData>getAllData(){
        ArrayList<UserData>list=new ArrayList<UserData>();
        @SuppressLint("Recycle")Cursor cursor=db.query("user",null,null,null,null,null,"username DESC");
        while (cursor.moveToNext()){
            @SuppressLint("Range") String username=cursor.getString(cursor.getColumnIndex("username"));
            @SuppressLint("Range") String password=cursor.getString(cursor.getColumnIndex("password"));
            list.add(new UserData(username,password));
        }
        return list;
    }
}
