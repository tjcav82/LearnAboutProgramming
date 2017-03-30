package com.example.tjcav_000.trial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
 
/**
 * Created by ProgrammingKnowledge on 4/3/2015.
 */
class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MOVIES";
    public static final String TABLE_NAME = "Action";// Table for each category
    public static final String TABLE_NAME2 ="Comedy";
    public static final String TABLE_NAME3 ="Romance";
    public static final String TABLE_NAME4 ="Horror";
    public static final String COL_1 = "Difficulty";//index of row
    public static final String COL_2 = "Picture";//the recoreded lvl of stress that day
    public static final String COL_3 = "Answer";//stress lvl number calculated for category


 
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (Difficulty TEXT,Picture TEXT,Answer TEXT)");
        db.execSQL("create table " + TABLE_NAME2 +" (Difficulty TEXT,Picture TEXT,Answer TEXT)");
        db.execSQL("create table " + TABLE_NAME3 +" (Difficulty TEXT,Picture TEXT,Answer TEXT)");
        db.execSQL("create table " + TABLE_NAME4+" (Difficulty TEXT,Picture TEXT,Answer TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME4);
        onCreate(db);
    }


 
    public boolean insertData(String dif,String pic,String answer, String table) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, dif);
        contentValues.put(COL_2,pic);
        contentValues.put(COL_3,answer);
        long result = db.insert(table,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
 
    public Cursor getAllData(String table) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+table,null);
        return res;
    }
 
    public boolean updateData(String id, String dif, String pic, String answer, String table) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,dif);
        contentValues.put(COL_2,pic);
        contentValues.put(COL_3,answer);

        db.update(table, contentValues, "ID = ?",new String[] { id });
        return true;
    }
 
    public Integer deleteData (String id,String table) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(table, "ID = ?",new String[] {id});
    }
}