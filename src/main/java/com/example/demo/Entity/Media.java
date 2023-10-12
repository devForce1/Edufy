package com.example.demo.Entity;

import java.util.List;

public class Media {
    private List<Music> musicList;
    private List<Pod> podList;
    private List<Video> videoList;

    public Media() {
    }

    public Media(List<Music> musicList, List<Pod> podList, List<Video> videoList) {
        this.musicList = musicList;
        this.podList = podList;
        this.videoList = videoList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Pod> getPodList() {
        return podList;
    }

    public void setPodList(List<Pod> podList) {
        this.podList = podList;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }
}
