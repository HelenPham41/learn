package com.company.Studio;

import com.company.Studio.*;

public class CDPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Play CD Player");
    }

    @Override
    public void stop() {
        System.out.println("Stop CD Player");
    }

    @Override
    public void pause() {
        System.out.println("Pause CD Player");
    }

    @Override
    public void reverse() {
        System.out.println("Reverse CD Player");
    }
}
