package com.codeclan.movie_ranking;

public class Movie {

    private String title;
    private String genre;
    private int ranking;


    public Movie(String title, String genre, int ranking){
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
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

    public int getRanking(){
        return ranking;
    }

    public void setRanking(int rank) {
        this.ranking = rank;
    }

    @Override
    public String toString(){
        String result = getTitle() + ", " + getGenre() + ", " + "Ranking: " + getRanking();
        return result;
    }


}
