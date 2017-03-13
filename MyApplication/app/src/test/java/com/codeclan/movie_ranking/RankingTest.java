package com.codeclan.movie_ranking;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RankingTest {

    public Ranking movieArray;
    Movie movie1;
    Movie movie2;
    Movie movie3;

    @Before
    public void before(){
        movie1 = new Movie("The Lord of the Rings", "Fantasy", 1);
        movie2 = new Movie("Apocalypse Now", "War", 2);
        movie3 = new Movie("The Godfather", "Mafia", 3);
        movieArray = new Ranking();
        movieArray.add(0, movie1);
        movieArray.add(1, movie3);
        movieArray.add(2, movie2);
        }

    @Test
    public void getRankingsTest() {
        assertNotNull(movieArray.getRanking());

    }

    @Test
    public void getMovieAtRankTest() {
        Movie result = movieArray.getMovieAtRank(1);
        assertEquals("The Lord of the Rings, Fantasy, Ranking: 1", result.toString());
    }










}
