package com.example.demo.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistID")
    private int artistID;
    @Column(name = "artistName")
    private String artistName;
    @Column(name = "artistFollowers")
    private int artistFollowers;

    @ManyToMany(mappedBy = "artistList", cascade = CascadeType.ALL)
    @JoinColumn(name = "musicID")
    private List<Music> musicList = new ArrayList<>();

    public Artist() {
    }

    public Artist(int artistID, String artistName, int artistFollowers) {
        this.artistID = artistID;
        this.artistName = artistName;
        this.artistFollowers = artistFollowers;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getArtistFollowers() {
        return artistFollowers;
    }

    public void setArtistFollowers(int artistFollowers) {
        this.artistFollowers = artistFollowers;
    }
}
