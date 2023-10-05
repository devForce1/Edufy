package com.example.demo.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pod")
public class Pod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "podID")
    private int podID;
    @Column(name = "podTitle")
    private String podTitle;

    @ManyToMany(mappedBy = "musicList", cascade = CascadeType.ALL)
    @JoinColumn(name = "artistID")
    private List<Artist> artistList = new ArrayList<>();

    private Genres genres;

    private Album album;
    private Date releaseDate;

    public Pod(int podID, String podTitle, Artist artist, Genres genres, Album album, Date releaseDate) {
        this.podID = podID;
        this.podTitle = podTitle;
        this.artist = artist;
        this.genres = genres;
        this.album = album;
        this.releaseDate = releaseDate;
    }

    public Pod() {
    }

    public int getPodID() {
        return podID;
    }

    public void setPodID(int podID) {
        this.podID = podID;
    }

    public String getPodTitle() {
        return podTitle;
    }

    public void setPodTitle(String podTitle) {
        this.podTitle = podTitle;
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
