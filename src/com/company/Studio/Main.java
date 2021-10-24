package com.company.Studio;

import com.company.Studio.CDPlayer;
import com.company.Studio.DVDPlayer;
import com.company.Studio.TapePlayer;

public class Main {
    public static void main(String[] args) {
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
    }
}
