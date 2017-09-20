package com.example.antoinelafont.smartbookmarkslafont.helpers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Antoine LAFONT on 20/09/2017.
 */

public class DAO {

    private SQLiteDatabase database;
    private MyDbHelper dbHelper;

    public DAO(Context context) {
        dbHelper = new MyDbHelper(context, "SmartBookmartksBDD", null, 1);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    //Ecrire toutes les méthodes permettant d'insérer/supprimer/modifier les données de la base
}
