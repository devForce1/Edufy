package com.example.demo.Controllers;

import com.example.demo.Entity.Artist;
import com.example.demo.Services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist")
public class ArtistController {

    @Autowired
    private ArtistService artistService;


    @PostMapping("/")
    public Artist addArtist(@RequestBody Artist artist) {
        return artistService.addArtist(artist);
    }

    @PutMapping("/{artistID}")
    public Artist updateArtist(@PathVariable int artistID, @RequestBody Artist artist) {
        artist.setArtistID(artistID);
        return artistService.updateArtist(artist);
    }

    @DeleteMapping("/{artistID}")
    public void deleteArtist(@PathVariable int artistID) {
        artistService.deleteArtist(artistID);
    }

    @GetMapping("/")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }
}
