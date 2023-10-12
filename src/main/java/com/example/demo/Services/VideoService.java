package com.example.demo.Services;

import com.example.demo.Entity.Music;
import com.example.demo.Entity.Video;
import com.example.demo.Repositories.ArtistRepository;
import com.example.demo.Repositories.MusicRepository;
import com.example.demo.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService implements VideoServiceInterface {
    @Autowired
    private VideoRepository videoRepository;
    @Autowired
    private ArtistRepository artistRepository;
    @Override
    public List<Video> getAllVideo(int artistID) {
        List<Video> getAllVideo = videoRepository.findVideoByArtist(artistRepository.findById(artistID).get());
        return getAllVideo;
    }
}
