package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieStoreTest {
    @Test
    public void shouldDisplayMoviesInStore(){
        ArrayList<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Django", 2012, "Enoch M", "N/A"));
        movies.add(new Movie("Shrek", 2011, "Albert Mcquin", "N/A"));
        movies.add(new Movie("Mega mind", 2008, "Janice N", "N/A"));
        movies.add(new Movie("Avengers", 2000, "Rose Claire", "N/A"));
        movies.add(new Movie("Moses", 1990, "Paul Crouch", "N/A"));
        movies.add(new Movie("Spiderman", 1999, "Linda Evans", "N/A"));
        movies.add(new Movie("Food Weather", 2004, "Emily Bronte", "N/A"));
        movies.add(new Movie("Man of steel", 2009, "Flint Lockwood", "N/A"));
        movies.add(new Movie("Why did I get married", 1995, "Tyler Perry", "N/A"));
        movies.add(new Movie("Astro boy", 1998, "Grace Gettlefield", "N/A"));
        movies.add(new Movie("Real Steel", 2013, "Bruce Willis", "N/A"));
        movies.add(new Movie("Texas rangers", 1987, "Chuck Norris", "N/A"));
        movies.add(new Movie("One night with a king", 1991, "Esther Berkerly", "N/A"));
        movies.add(new Movie("Justice League", 1998, "Alex Livingstone", "N/A"));
        movies.add(new Movie("Troy", 1956, "Jennifer Antone", "N/A"));

        MovieStore movieStore = new MovieStore();
        assertThat(movies, is(movieStore.availableMoviesInStore()));
    }
    @Test
    public void shouldGetMovieName(){

    }
}
