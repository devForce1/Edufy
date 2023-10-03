package com.example.demo.Entity;

import java.time.Year;
import java.util.Date;

public class Album {
    private int albumID;
    private String albumTitle;
    private Artist artist;
    private Year releaseYear;

    public Album() {
    }

    public Album(int albumID, String albumTitle, Artist artist, Year releaseYear) {
        this.albumID = albumID;
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.releaseYear = releaseYear;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }
}
