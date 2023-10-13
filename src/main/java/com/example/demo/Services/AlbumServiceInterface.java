package com.example.demo.Services;
import com.example.demo.Entity.Album;
import java.util.List;

public interface AlbumServiceInterface {

    Album findAlbumByTitle(String albumTitle);

    List<Album>findAlbumsByArtistName(String artistName);

    List<Album>findAllAlbums();
}
