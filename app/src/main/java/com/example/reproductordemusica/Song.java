package com.example.reproductordemusica;

public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtsit){
        id=songID;
        title=songTitle;
        artist=songArtsit;
    }

    public long getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }


}
