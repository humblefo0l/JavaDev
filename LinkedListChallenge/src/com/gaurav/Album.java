package com.gaurav;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private ArrayList<Song> songArrayList;

    public Album(String name){
        this.albumName = name;
        this.songArrayList = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }


    public boolean addSongToAlbum(String songName, Double songDuration){
        if(findSong(songName) != null){
            System.out.println(songName + " is already in album.");
            return false;
        }
        songArrayList.add(new Song(songName, songDuration));
        return true;
    }

    public void listSongInAlbum(){
        for(int i=0; i<this.songArrayList.size(); i++){
            Song song = this.songArrayList.get(i);
            System.out.println((i+1) + ". " + song.getSongName() + " :" +
                    song.getSongDuration());
        }
    }

    private Song findSong(String songName){
        for(int i=0; i<this.songArrayList.size(); i++){
            if (this.songArrayList.get(i).getSongName().equals(songName)){
                return songArrayList.get(i);
            }
        }
        return null;
    }

    public boolean addSongToPlaylist(String songName, LinkedList<Song> playlist){
        Song checkedSong = findSong(songName);
        if (checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        return false;
    }


    public boolean addSongToPlaylist(int track, LinkedList<Song> playlist){
        int index = track-1;
//        System.out.println("index = " + index);
//        System.out.println("array size = " + this.songArrayList.size());
        if(index >=0 && index<= this.songArrayList.size()-1){
            playlist.add(this.songArrayList.get(index));
            return true;
        }
        System.out.println("This album does not have a track number: " + track);
        return false;

    }
}
