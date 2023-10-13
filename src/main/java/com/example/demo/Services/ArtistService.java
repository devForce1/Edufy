package com.example.demo.Services;

import com.example.demo.Entity.Artist;
import com.example.demo.Repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService implements ArtistServiceInterface {

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist addArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public Artist updateArtist(Artist artist) {

        return artistRepository.save(artist);
    }

    @Override
    public void deleteArtist(int id) {
        artistRepository.deleteById(id);
    }

    @Override
    public Artist getArtistById(int id) {
        Optional<Artist> artist = artistRepository.findById(id);
        if(artist.isPresent()) {
            return artist.get();
        }
        return null;  // exception here in the future
    }
}
