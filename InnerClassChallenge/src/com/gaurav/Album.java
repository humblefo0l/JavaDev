package com.gaurav;

import java.util.ArrayList;
import java.util.LinkedList;

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.


public class Album {
    private String albumName;
    private SongList albumInner;

    public Album(String name){
        this.albumName = name;
        this.albumInner = new SongList();
    }

    public String getAlbumName() {
        return albumName;
    }

//    public ArrayList<Song> getSongArrayList() {
//        return songArrayList;
//    }



    private class SongList{
        private ArrayList<Song> songArrayList;

        public SongList() {
            this.songArrayList = new ArrayList<Song>();
        }

        private boolean addSongToAlbum(String songName, Double songDuration){
            if(findSong(songName) != null){
                System.out.println(songName + " is already in album.");
                return false;
            }
            songArrayList.add(new Song(songName, songDuration));
            return true;
        }

        private void listSongInAlbum(){
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

        private boolean addSongToPlaylist(String songName, LinkedList<Song> playlist){
            Song checkedSong = findSong(songName);
            if (checkedSong != null){
                playlist.add(checkedSong);
                return true;
            }
            return false;
        }


        private boolean addSongToPlaylist(int track, LinkedList<Song> playlist){
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



    public boolean addSongToAlbum(String songName, Double songDuration){
        return this.albumInner.addSongToAlbum(songName, songDuration);
    }

    public void listSongInAlbum(){
        this.albumInner.listSongInAlbum();
    }

    public Song findSong(String songName){
        return this.albumInner.findSong(songName);
    }

    public boolean addSongToPlaylist(String songName, LinkedList<Song> playlist){
        return this.albumInner.addSongToPlaylist(songName, playlist);
    }

    public boolean addSongToPlaylist(int track, LinkedList<Song> playlist){
        return this.albumInner.addSongToPlaylist(track, playlist);
    }


}
