package com.fceh.isaelemoigne.applifceh;

/**
 * Created by isaelemoigne on 15/02/2017.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

class MySQLiteHelper  extends SQLiteOpenHelper {
    public static final String TABLE_JOUEURS = "joueurs";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOM = "nom";
    public static final String COLUMN_PRENOM = "prenom";
    public static final String COLUMN_POSTE = "poste";
    public static final String COLUMN_NUMERO = "numero";
    public static final String COLUMN_EQUIPE = "equipe";


    private static final String DATABASE_NAME = "joueur.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table "
            + TABLE_JOUEURS + "(" + COLUMN_ID
            + " integer primary key autoincrement, " + COLUMN_NOM
            + " text not null, " + COLUMN_PRENOM
            + " text not null, " + COLUMN_POSTE
            + " text not null, " + COLUMN_NUMERO
            + " integer, " + COLUMN_EQUIPE
            + " integer);";

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_JOUEURS);
        onCreate(db);
    }
}