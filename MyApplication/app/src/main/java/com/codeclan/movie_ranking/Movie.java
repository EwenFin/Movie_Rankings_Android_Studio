package com.codeclan.movie_ranking;

public class Movie {

    private String title;
    private String genre;

    public Movie(String title, String genre){
        title = new title();
        genre = new genre();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}