package com.codeclan.movie_ranking;

import org.junit.*;

import static org.junit.Assert.*;


public class MovieTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;

    @Before
    public void before() {
        movie1 = new Movie("The Lord of the Rings", "Fantasy", 1);
        movie2 = new Movie("Apocalypse Now", "War", 2);
        movie3 = new Movie("The Godfather", "Mafia", 3);
    }

    @Test
    public void getTitleTest(){
        assertEquals("The Lord of the Rings", movie1.getTitle());
    }

    @Test
    public void getGenreTest(){
        assertEquals("War", movie2.getGenre());
    }

    @Test
    public void setTitleTest(){
        movie3.setTitle("Blade Runner");
        assertEquals("Blade Runner", movie3.getTitle());
    }

    @Test
    public void setGenreTest(){
        movie1.setGenre("Adventure");
        assertEquals("Adventure", movie1.getGenre());
    }

    @Test
    public void getRankTest(){
        assertEquals(1, movie1.getRank());
    }

    @Test
    public void setRankTest(){
        movie3.setRank(1);
        assertEquals(1, movie3.getRank());
    }

    @Test
    public void toStringTest(){
        assertEquals("The Lord of the Rings, Fantasy, Ranking: 1", movie1.toString());
    }






}
