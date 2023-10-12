package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistID;
    @Column
    private String artistName;
    @Column
    private int artistFollowers;

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
