package com.example.demo.Entity;
import javax.persistence.*;

@Entity

public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int genresID;
    @Column (name = "genre")
    private String genreName;

    public Genres() {
    }

    public Genres(int genresID, String genres) {
        this.genresID = genresID;
        this.genreName = genres;
    }

    public int getGenresID() {
        return genresID;
    }

    public void setGenresID(int genresID) {
        this.genresID = genresID;
    }

    public String getGenres() {
        return genreName;
    }

    public void setGenres(String genres) {
        this.genreName = genres;
    }
}
