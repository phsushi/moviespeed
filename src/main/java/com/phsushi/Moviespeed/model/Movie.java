package com.phsushi.Moviespeed.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tblMovie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_movie;
    private String title;
    private Float rating;
    private String director;
    private String synopsis;
    private LocalDate releaseDate;

    public Movie() {
    }

    public Movie(Long id_movie, String title, Float rating, String director, String synopsis, LocalDate realeaseDate) {
        this.id_movie = id_movie;
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.synopsis = synopsis;
        this.releaseDate = realeaseDate;
    }

    public Long getId_movie() {
        return id_movie;
    }

    public void setId_movie(Long id_movie) {
        this.id_movie = id_movie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate realeaseDate) {
        this.releaseDate = realeaseDate;
    }




}
