package com.company;

public class LP extends Artikel{
    public String nameOfArtist;
    public Integer nrOfRecords;
    @Override
    public void addArtikel() {
        System.out.println("Add name of Artist: " + nameOfArtist);
        System.out.println("Add number of Records: " + nrOfRecords);
    }

    @Override
    public void removeArtikel() {
        System.out.println("Remove name of Artist: " + nameOfArtist);
        System.out.println("Remove number of Records: " + nrOfRecords);
    }
}
