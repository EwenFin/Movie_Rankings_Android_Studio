package com.codeclan.movie_ranking;

public class Movie {

    private String title;
    private String genre;


    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;

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
