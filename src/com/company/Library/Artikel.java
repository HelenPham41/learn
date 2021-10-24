package com.company.Library;

abstract class Artikel {
    public Integer nrOfPlayers = 99;
    public Integer averagePlaytime = 100;
    public String writer = "Hồ Quỳnh Hương";
    public String genre = "Trữ Tình";
    public String nameOfArtist = "Lisa - Black Pink";
    public Integer nrOfRecords = 9;

    public abstract void addArtikel();
    public abstract void removeArtikel();
}
