package com.example.antoinelafont.smartbookmarkslafont;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Antoine LAFONT on 20/09/2017.
 */

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);
    }

    public void backHome(View view) {
        finish();
    }
}
