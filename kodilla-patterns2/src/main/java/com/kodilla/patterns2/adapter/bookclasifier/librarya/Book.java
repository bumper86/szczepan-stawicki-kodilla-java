package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publicationyear;
    private final String signature;

    public Book(String author, String title, int publicationyear, String signature) {
        this.author = author;
        this.title = title;
        this.publicationyear = publicationyear;
        this.signature = signature;
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

    public String getSignature() {
        return signature;
    }
}
