package com.example.demo.Services;
import com.example.demo.Entity.Album;
import com.example.demo.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlbumService implements AlbumServiceInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public List<Album> findAlbumsByArtistName(String artistName) {
        System.out.println(artistName);
        return albumRepository.findAlbumsByArtistName(artistName);
    }

    @Override
    public List<Album> findAllAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public Album findAlbumByTitle(String albumTitle) {
    return albumRepository.findAlbumByAlbumTitleContainsIgnoreCase(albumTitle);
    }
}
