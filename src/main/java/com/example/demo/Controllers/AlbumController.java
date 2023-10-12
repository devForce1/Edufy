package com.example.demo.Controllers;
import com.example.demo.Entity.Album;
import com.example.demo.Services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumServices;

    @GetMapping("/albumbyartistname/{artistName}")
    public List<Album>getAlbumsByArtistName(@PathVariable("artistName") String artistName) {
        return albumServices.findAlbumsByArtistName(artistName);
    }
    @GetMapping("/albumbytitle/{albumTitle}")
    public Album AlbumgetAlbumsByTitle(@PathVariable("albumTitle") String albumTitle) {
        return albumServices.findAlbumByTitle(albumTitle);
    }

}
