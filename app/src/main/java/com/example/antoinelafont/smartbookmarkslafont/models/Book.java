package com.example.antoinelafont.smartbookmarkslafont.models;

import java.util.ArrayList;

/**
 * Created by Antoine LAFONT on 20/09/2017.
 */

public class Book {

    public Book() {
        comments = new ArrayList<Comment>();
    }

    public int id;
    public String title;
    public String author;
    public String genre;
    public ArrayList<Comment> comments;

}
