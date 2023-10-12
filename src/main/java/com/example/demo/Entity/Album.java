package com.example.demo.Entity;

import javax.persistence.*;


@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumID")
    private int albumID;
    @Column(name = "albumTitle")
    private String albumTitle;
    @ManyToOne
    @JoinColumn(name = "artistID")
    private Artist artist;
    @Column(name = "releaseYear")
    private int releaseYear;

    public Album() {
    }

    public Album(int albumID, String albumTitle, Artist artist, int releaseYear) {
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

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
