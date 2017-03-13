package com.codeclan.movie_ranking;

import org.junit.*;


import java.util.ArrayList;

import static org.junit.Assert.*;


public class MovieTest {

    ArrayList<Movie>  movieArray;

    @Before
    public void before() {
        movieArray = new ArrayList<Movie>();
        Movie movie1 = new Movie("The Lord of the Rings", "Fantasy");
        Movie movie2 = new Movie("Apocalypse Now", "War");
        Movie movie3 = new Movie("The Godfather", "Mafia");
        movieArray.add(movie1);
        movieArray.add(movie2);
        movieArray.add(movie3);


    }

    @Test
    public void getTitleTest(){
        assertEquals("The Lord of the Rings", movieArray.get(0).getTitle());
    }

    @Test
    public void getGenreTest(){
        assertEquals("War", movieArray.get(1).getGenre());
    }

    @Test
    public void setTitleTest(){
        movieArray.get(0).setTitle("Blade Runner");
        assertEquals("Blade Runner", movieArray.get(0).getTitle());
    }

    @Test
    public void setGenreTest(){
        movieArray.get(0).setGenre("Adventure");
        assertEquals("Adventure", movieArray.get(0).getGenre());
    }




}
