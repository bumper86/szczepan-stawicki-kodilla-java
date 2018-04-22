package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String author;
    private final String title;
    private final int publicationyear;


    public Book(String author, String title, int publicationyear) {
        this.author = author;
        this.title = title;
        this.publicationyear = publicationyear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationyear() {
        return publicationyear;
    }

}
