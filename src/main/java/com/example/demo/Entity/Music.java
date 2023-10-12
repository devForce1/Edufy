package com.example.demo.Entity;
import javax.persistence.*;
import java.util.Date;
@Entity

public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int musicID;
    @Column
    private String musicTitle;
    @ManyToOne
    @JoinColumn(name = "artistName")
    private Artist artist;
    @ManyToOne
    @JoinColumn(name = "gengreName")
    private Genres genres;
    @ManyToOne
    @JoinColumn(name = "gengreName")
    private Album album;
    @Column
    private Date releaseDate;

    public Music() {
    }

    public Music(int musicID, String musicTitle, Artist artist, Genres genres, Album album, Date releaseDate) {
        this.musicID = musicID;
        this.musicTitle = musicTitle;
        this.artist = artist;
        this.genres = genres;
        this.album = album;
        this.releaseDate = releaseDate;
    }

    public int getMusicID() {
        return musicID;
    }

    public void setMusicID(int musicID) {
        this.musicID = musicID;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
