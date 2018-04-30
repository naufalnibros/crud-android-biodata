package com.android.naufalnibros.crudbiodata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "daftarmahasiswa.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE mahasiswa(no INTEGER PRIMARY KEY AUTOINCREMENT, nama text null, tgl text null, jk text null, jurusan text null);";
        Log.d("Data", "onCreate : " + sql);
        db.execSQL(sql);


//        sql = "INSERT INTO mahasiswa(nama, tgl, jk, jurusan) VALUES ( 'tes', '1922', 'Laki-laki','tes');";
//        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
