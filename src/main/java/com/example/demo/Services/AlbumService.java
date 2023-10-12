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
        List<Album> albums = albumRepository.findAlbumsByArtistName(artistName);
        return albums;
    }

    @Override
    public Album findAlbumByTitle(String albumTitle) {
        Album album = albumRepository.findAlbumByAlbumTitleContainsIgnoreCase(albumTitle);
    return album;

    }
}
