package com.example.demo.Services;

import com.example.demo.Entity.Album;
import com.example.demo.Entity.Music;
import com.example.demo.Repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService implements MusicServiceInterface{
@Autowired
private MusicRepository musicRepository;

    @Override
    public List<Music> listAllMusicForAlbum(Album album) {
        return musicRepository.findMusicByAlbumOrderByMusicTitle(album);
    }



}
