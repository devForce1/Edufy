package com.example.demo.Entity;

public class Genres {
    private int genresID;
    private String genres;

    public Genres() {
    }

    public Genres(int genresID, String genres) {
        this.genresID = genresID;
        this.genres = genres;
    }

    public int getGenresID() {
        return genresID;
    }

    public void setGenresID(int genresID) {
        this.genresID = genresID;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}
