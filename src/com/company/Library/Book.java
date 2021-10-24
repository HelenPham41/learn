package com.company.Library;

public class Book extends Artikel {

    @Override
    public void addArtikel() {
        System.out.println("Add writer: " + writer);
        System.out.println("Add genre: " + genre);
    }

    @Override
    public void removeArtikel() {
        System.out.println("Remove writer: " + writer);
        System.out.println("Remove genre: " + genre);
    }
}
