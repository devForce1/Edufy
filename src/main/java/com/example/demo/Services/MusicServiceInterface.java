package com.example.demo.Services;

import com.example.demo.Entity.Album;
import com.example.demo.Entity.Music;

import java.util.List;

public interface MusicServiceInterface {
    List<Music> listAllMusicForAlbum (Album album);

}
