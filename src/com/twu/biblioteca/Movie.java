package com.twu.biblioteca;

public class Movie {
    private String nameOfMovie;
    private int year;
    private String directorOfMovie;
    private  String rating = "N/A";
    private String movieName;

    public Movie(String nameOfMovie, int year, String directorOfMovie, String rating) {
        this.nameOfMovie = nameOfMovie;
        this.year = year;
        this.directorOfMovie = directorOfMovie;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (year != movie.year) return false;
        if (!directorOfMovie.equals(movie.directorOfMovie)) return false;
        if (!nameOfMovie.equals(movie.nameOfMovie)) return false;
        if (!rating.equals(movie.rating)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nameOfMovie.hashCode();
        result = 31 * result + year;
        result = 31 * result + directorOfMovie.hashCode();
        result = 31 * result + rating.hashCode();
        return result;
    }

    public String getMovieName() {
        return movieName;
    }
}
