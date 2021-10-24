package com.company.Library;

import com.company.Library.Boardgame;
import com.company.Library.Book;
import com.company.Library.LP;

public class Main {
    public static void main(String[] args) {
        //LP
        LP lp = new LP();
        lp.addArtikel();
        lp.removeArtikel();

        //Book
        Book book = new Book();
        book.addArtikel();
        book.removeArtikel();

        //Boardgame
        Boardgame boardgame = new Boardgame();
        boardgame.addArtikel();
        boardgame.removeArtikel();
    }

}
