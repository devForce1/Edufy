package com.example.demo.Services;

import com.example.demo.Entity.Music;
import com.example.demo.Entity.Video;

import java.util.List;

public interface VideoServiceInterface {
    List<Video> getAllVideo(int artistID);
}
