package com.codeclan.movie_ranking;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class RankingTest {

    private Ranking movieArray;
    Movie movie1;
    Movie movie2;
    Movie movie3;

    @Before
    public void before(){
        movie1 = new Movie("The Lord of the Rings", "Fantasy", 1);
        movie2 = new Movie("Apocalypse Now", "War", 2);
        movie3 = new Movie("The Godfather", "Mafia", 3);
        movieArray = new Ranking();
        movieArray.add(movie1.getRank(), movie1);
        movieArray.add(movie3.getRank(), movie3);
        movieArray.add(movie2.getRank(), movie2);
        }

    @Test
    public void getRankingsTest() {
        assertNotNull(movieArray.getRanking());

    }





    }




}
