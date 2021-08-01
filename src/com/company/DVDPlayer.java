package com.company;

public class DVDPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Play DVD Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop DVD Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause DVD Player");
    }

    @Override
    public void reverse() {
        System.out.println("Reverse DVD Player");
    }
}
