package com.codeclan.movie_ranking;

import java.util.ArrayList;

public class Ranking {

    private ArrayList<Movie> ranking;

    public Ranking(){

        ranking = new ArrayList<Movie>();

    }

    public Ranking(ArrayList<Movie> new_movies){
        ranking = new_movies;
    }


    public ArrayList<Movie> getRanking() {
        return new ArrayList<Movie>(ranking);
    }

    public void setRanking(ArrayList<Movie> ranking) {
        this.ranking = ranking;
    }

    public void add(int index, Movie movie) {
        ranking.add(index, movie);
    }

    public Movie getMovieAtRank(int index){
        return ranking.get(index - 1);

    }


}
