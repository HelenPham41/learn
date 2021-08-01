package com.company;

public class Main {

    public static void main(String[] args) {
        //interface
        //DVDPlayer
        DVDPlayer dvdPlayer = new DVDPlayer();
        dvdPlayer.play();
        dvdPlayer.stop();
        dvdPlayer.pause();
        dvdPlayer.reverse();

        //CDPlayer
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();
        cdPlayer.stop();
        cdPlayer.pause();
        cdPlayer.reverse();

        //TapePlayer
        TapePlayer tapePlayer = new TapePlayer();
        tapePlayer.play();
        tapePlayer.stop();
        tapePlayer.pause();
        tapePlayer.reverse();
        tapePlayer.record();

        //abstract
        //LP
        LP lp = new LP();
        lp.nameOfArtist = "Lisa - Black Pink";
        lp.nrOfRecords = 9;
        lp.addArtikel();
        lp.removeArtikel();

        //Book
        Book book = new Book();
        book.writer = "Hồ Quỳnh Hương";
        book.genre = "Trữ Tình";
        book.addArtikel();
        book.removeArtikel();

        //Boardgame
        Boardgame boardgame = new Boardgame();
        boardgame.nrOfPlayers = 99;
        boardgame.averagePlaytime = 100;
        boardgame.addArtikel();
        boardgame.removeArtikel();

    }
}
