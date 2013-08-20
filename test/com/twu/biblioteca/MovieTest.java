package com.twu.biblioteca;

import com.twu.biblioteca.Movie;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieTest {
    @Test
    public void shouldCreateMovie(){
        Movie movie = new Movie("Sholay", 1975, "Ramesh Sippy", "N/A");
        assertThat(movie, is(new Movie("Sholay", 1975, "Ramesh Sippy", "N/A")));
    }
    @Test
    public void shouldGetNameOfMovie(){
        Movie movie = new Movie("Sholay", 1975, "Ramesh Sippy", "N/A");
        assertThat("Sholay", is(movie.getMovieName()));
    }
}
