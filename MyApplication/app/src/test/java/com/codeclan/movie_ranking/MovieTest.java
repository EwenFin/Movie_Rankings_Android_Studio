package com.codeclan.movie_ranking;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class MovieTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;

    @Before
    public void before() {
        Movie movie1 = new Movie("The Lord of the Rings", "Fantasy");
        Movie movie2 = new Movie("Apocalypse Now", "War");
        Movie movie3 = new Movie("The Godfather", "Mafia");

    }


    @Test
    public void getTitleTest(){
        assertEquals();
    }

}
