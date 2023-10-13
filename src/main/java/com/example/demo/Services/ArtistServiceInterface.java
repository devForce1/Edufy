package com.example.demo.Services;

import com.example.demo.Entity.Artist;
import java.util.List;

public interface ArtistServiceInterface {


    List<Artist> getAllArtists();


    Artist addArtist(Artist artist);


    Artist updateArtist(Artist artist);


    void deleteArtist(int id);


    Artist getArtistById(int id);
}
