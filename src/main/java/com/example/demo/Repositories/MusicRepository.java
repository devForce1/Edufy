package com.example.demo.Repositories;

import com.example.demo.Entity.Album;
import com.example.demo.Entity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Artist;


import java.util.List;
@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {

    List<Music> findMusicByAlbumOrderByMusicTitle(Album album);

 
   List<Music> findMusicByArtist(Artist artist);


}
