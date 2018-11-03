package com.gaurav;

public class Song {
    private String songName;
    private double songDuration;

    public Song(String name, double duration) {
        this.songName = name;
        this.songDuration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return songName + " : " + songDuration;
    }
}


