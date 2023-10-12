package com.example.demo.Services;

import com.example.demo.Entity.Music;
import com.example.demo.Entity.Pod;
import com.example.demo.Entity.Video;

import java.util.List;

public interface MusicServiceInterface {
    List<Music> getAllMusic(int artistID);

}
