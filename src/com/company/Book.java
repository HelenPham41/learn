package com.company;

public class Book extends Artikel{
    public String writer;
    public String genre;
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
