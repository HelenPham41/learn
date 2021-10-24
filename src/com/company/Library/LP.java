package com.company.Library;

public class LP extends Artikel {

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
