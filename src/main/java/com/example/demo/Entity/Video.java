package com.example.demo.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "video")
public class Video {
    private int videoID;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "podID")

    private String videoTitle;
    @ManyToMany(mappedBy = "musicList", cascade = CascadeType.ALL)
    @JoinColumn(name = "artistID")
    private List<Artist> artistList = new ArrayList<>();
    private Album album;
    private Genres genres;
    private Date releaseDate;

    public Video() {
    }

    public Video(int videoID, String videoTitle, Artist artist, Album album, Genres genres, Date releaseDate) {
        this.videoID = videoID;
        this.videoTitle = videoTitle;
        this.artist = artist;
        this.album = album;
        this.genres = genres;
        this.releaseDate = releaseDate;
    }

    public int getVideoID() {
        return videoID;
    }

    public void setVideoID(int videoID) {
        this.videoID = videoID;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}

