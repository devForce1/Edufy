package com.example.demo.Services;


import com.example.demo.Entity.Album;
import com.example.demo.Entity.Music;

import com.example.demo.Entity.Artist;
import com.example.demo.Entity.Music;
import com.example.demo.Repositories.ArtistRepository;

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



=======

@Service
public class MusicService implements MusicServiceInterface {
    @Autowired
    private MusicRepository musicRepository;
    @Autowired
    private ArtistRepository artistRepository;

    @Override
    public List<Music> getAllMusic(int artistID) {
        Artist artist = artistRepository.findById(artistID).get();
        List<Music> getAllMusic = musicRepository.findMusicByArtist(artist);
        return getAllMusic;
    }

}
