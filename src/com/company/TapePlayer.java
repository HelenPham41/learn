package com.company;

public class TapePlayer implements Player, Recorder {
    @Override
    public void play() {
        System.out.println("Play Tape Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop Tape Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause Tape Player");
    }

    @Override
    public void reverse() {
        System.out.println("Reverse Tape Player");
    }

    @Override
    public void record() {
        System.out.println("Record Tape Player");
    }
}
