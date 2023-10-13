package com.example.demo.Controllers;

import com.example.demo.Entity.Album;
import com.example.demo.Entity.Music;
import com.example.demo.Services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/albums/oneAlbum") //ändra endpoint kanske. Synkronisera med Album controller.
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping ("/albumSongs")
    public List<Music> listAllSongs(@RequestBody Album album){
        return musicService.listAllMusicForAlbum(album);
    }
}
