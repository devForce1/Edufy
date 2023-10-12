package com.example.demo.Repositories;

import com.example.demo.Entity.Artist;
import com.example.demo.Entity.Music;
import com.example.demo.Entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {
    List<Video> findVideoByArtist(Artist artist);
}
