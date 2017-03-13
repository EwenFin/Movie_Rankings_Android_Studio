package com.codeclan.movie_ranking;

public class Movie {

    private String title;
    private String genre;
    private int rank;


    public Movie(String title, String genre, int rank){
        this.title = title;
        this.genre = genre;
        this.rank = rank;
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

    public int getRank(){
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        String result = getTitle() + ", " + getGenre() + ", Ranking: " + getRank();
        return result;
    }


}
