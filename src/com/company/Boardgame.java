package com.company;

public class Boardgame extends Artikel {
    public Integer nrOfPlayers;
    public Integer averagePlaytime;

    @Override
    public void addArtikel() {
        System.out.println("Add number of player: " + nrOfPlayers);
        System.out.println("Add average playtime: " + averagePlaytime);
    }

    @Override
    public void removeArtikel() {
        System.out.println("Remove number of player: " + nrOfPlayers);
        System.out.println("Remove average playtime: " + averagePlaytime);
    }
}
