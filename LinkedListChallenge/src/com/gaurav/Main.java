package com.gaurav;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static LinkedList<Album> albums = new LinkedList<Album>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the
        // list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the
        // current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only
        // play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a
        // city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        Album album = new Album("Album1");
        album.addSongToAlbum("song1ab1", 3.77);
        album.addSongToAlbum("song2ab1", 2.77);
        album.addSongToAlbum("song3ab1", 5.7);
        album.addSongToAlbum("song4ab1", 3.27);
        album.addSongToAlbum("song5ab1", 7.47);
        album.addSongToAlbum("song6ab1", 8.16);
        albums.add(album);


        Album album2 = new Album("Album2");
        album2.addSongToAlbum("song1ab2", 4.4);
        album2.addSongToAlbum("song2ab2", 5.6);
        album2.addSongToAlbum("song3ab2", 2.11);
        album2.addSongToAlbum("song4ab2", 9.16);
        album2.addSongToAlbum("song5ab2", 6.51);
        album2.addSongToAlbum("song6ab2", 8.77);
        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addSongToPlaylist("song1ab1", playlist);
        albums.get(0).addSongToPlaylist("song2ab1", playlist);
        albums.get(0).addSongToPlaylist(3, playlist);
        albums.get(1).addSongToPlaylist("song4ab2", playlist);
        albums.get(1).addSongToPlaylist("song5ab2", playlist);
        albums.get(1).addSongToPlaylist(6, playlist);

        play(playlist);

    }


    public static void play(LinkedList<Song> playlist){
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> songListIterator = playlist.listIterator();
        if (playlist.size() == 0){
            System.out.println("No song in playlist");
            return;
        }

        while (songListIterator.hasNext()){
            System.out.println("Now playing " + songListIterator.next().toString());
        }

        System.out.println("*******");
        while (!quit){
            printMenu();
            int action = scanner.nextInt();
//            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist completes");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(songListIterator.hasNext()) songListIterator.next();
                    }

                    if(songListIterator.hasNext()){
                        System.out.println("Now playing " + songListIterator.next().toString());
                            forward = true;
                    }else{
                        System.out.println("We have reached the end of the list");
                            forward = false;
                    }

                    break;
                case 2:
                    if (forward) {
                        if(songListIterator.hasPrevious()) songListIterator.previous();
                    }

                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("We are at the start of list");
                        forward = true;
                    }

                    break;
                case 3:
                    if (forward){
                        if(songListIterator.hasPrevious()){
                            System.out.println("Now replaying " + songListIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at starting of the string.");
                        }
                    }else{
                        if(songListIterator.hasNext()){
                            System.out.println("Now replaying " + songListIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }

                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu(){
        System.out.println("Avialabe option:\npress");
        System.out.println("0 - quit\n" +
                "1 - next song\n" +
                "2 - previos song\n" +
                "3 - replay song\n" +
                "4 - list playlist\n" +
                "5 - print options");
    }


    private static void printList(LinkedList<Song> playList){
//        System.out.println("sSIZE-->>"+playList.size());
        Iterator<Song> songIterator = playList.iterator();
        System.out.println("==================");
        while (songIterator.hasNext()){
            System.out.println(songIterator.next().toString());
        }
        System.out.println("==================");

    }
}
