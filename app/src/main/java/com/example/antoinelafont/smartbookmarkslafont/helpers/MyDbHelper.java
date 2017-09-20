package com.example.antoinelafont.smartbookmarkslafont.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Antoine LAFONT on 20/09/2017.
 */

public class MyDbHelper extends SQLiteOpenHelper {

    public static final String TABLE_BOOK = "Books";
    public static final String BOOK_ID = "id";
    public static final String BOOK_TITLE = "title";
    public static final String BOOK_AUTHOR = "author";
    public static final String BOOK_GENRE = "genre";

    public static final String TABLE_COMMENTS = "Comments";
    public static final String COMMENTS_ID = "id";
    public static final String COMMENTS_BOOK_ID = "bookId";
    public static final String COMMENTS_COMMENT = "comment";
    public static final String COMMENTS_DATE = "date";

    public MyDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_BOOK + " (" +
                BOOK_ID + " INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , " +
                BOOK_TITLE + " VARCHAR NOT NULL , " +
                BOOK_AUTHOR + " VARCHAR NOT NULL , " +
                BOOK_GENRE + " VARCHAR NOT NULL ); ");
        db.execSQL("CREATE TABLE " + TABLE_COMMENTS + " (" +
                COMMENTS_ID + " PRIMARY KEY  NOT NULL , " +
                COMMENTS_BOOK_ID + " NOT NULL , " +
                COMMENTS_COMMENT + " NOT NULL , " +
                COMMENTS_DATE + " NOT NULL ); ");
        insertExampleValues(db);
    }

    public void insertExampleValues(SQLiteDatabase db) {
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(1,'Les fleurs du mal','Charles Baudelaire','Poèmes'); ");
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(2,'Germinal','Emile Zola','Roman'); ");
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(3,'Les misérables','Victor Hugo','Roman'); ");
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(4,'1984','George Orwell','Science-Fiction'); ");
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(5,'Le Meilleur des mondes','Aldous Huxley','Science-Fiction'); ");
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(6,'Vingt mille lieues sous les mers','Jules Verne','Aventure'); ");
        db.execSQL("INSERT INTO " + TABLE_BOOK + " VALUES(7,'Les Trois Mousquetaires','Alexandre Dumas','Aventure'); ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_COMMENTS + ";");
        db.execSQL("DROP TABLE " + TABLE_BOOK + ";");
        onCreate(db);
    }
}
