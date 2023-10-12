package com.example.demo.Repositories;

import com.example.demo.Entity.Artist;
import com.example.demo.Entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicRepository extends JpaRepository<Music, Integer> {
    List<Music> findMusicByArtist(Artist artist);

}
