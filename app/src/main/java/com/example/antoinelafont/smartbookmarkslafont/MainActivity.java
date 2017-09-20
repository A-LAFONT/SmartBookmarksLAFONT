package com.example.antoinelafont.smartbookmarkslafont;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.antoinelafont.smartbookmarkslafont.helpers.DAO;

public class MainActivity extends AppCompatActivity {

    private DAO datasource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Charger les données depuis la base de données
        datasource = new DAO(this);
        datasource.open();

        //Afficher les données sur la page d'accueil
    }

    public void bookList(View view) {
        Intent i = new Intent(this, BookListActivity.class);
        startActivity(i);
    }

    public void commentList(View view) {
        Intent i = new Intent(this, CommentListActivity.class);
        startActivity(i);
    }

    public void addComment(View view) {
        Intent i = new Intent(this, AddCommentActivity.class);
        startActivity(i);
    }
}
