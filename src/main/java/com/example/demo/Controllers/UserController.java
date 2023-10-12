package com.example.demo.Controllers;

import com.example.demo.Entity.Media;
import com.example.demo.Entity.Music;
import com.example.demo.Services.MusicService;
import com.example.demo.Services.PodService;
import com.example.demo.Services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {
    @Autowired
    private MusicService musicService;
    @Autowired
    private PodService podService;
    @Autowired
    private VideoService videoService;

    @GetMapping(value = "/artist/{artistid}/media")
    public ResponseEntity<Media> getAllMedia(@PathVariable("artistid") int artistID) {
        Media media = new Media();
        media.setMusicList(musicService.getAllMusic(artistID));
        media.setPodList(podService.getAllPod(artistID));
        media.setVideoList(videoService.getAllVideo(artistID));
        return ResponseEntity.ok(media);
    }
}
