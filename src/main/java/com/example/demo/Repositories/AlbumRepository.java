package com.example.demo.Repositories;
import com.example.demo.Entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AlbumRepository  extends JpaRepository<Album, Integer> {

    Album findAlbumByAlbumTitleContainsIgnoreCase(@Param("albumTitle")String  albumTitle);

    @Query("SELECT a FROM Album a JOIN a.artist artist WHERE artist.artistName = :artistName")
    List<Album> findAlbumsByArtistName(@Param("artistName") String artistName);

}
