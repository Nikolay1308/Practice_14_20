package Exercise_14;

import java.util.Date;

public class Movie {
    private final String name_of_movie;
    private final Date date_of_release;
    private float rating;
    private String genre;
    private static int movieCounter =0;
    private static final int ratingForOscar = 9;
    @SuppressWarnings("deprecation") public Movie(String name_of_movie, float rating, String genre){
        this.name_of_movie = name_of_movie;
        this.date_of_release = new Date();
        System.out.println(date_of_release.toLocaleString());
        if (rating >=1 && rating <=10)
            this.rating = rating;
        else System.out.println("Not legal, choose number 1 - 10");
        this.genre = genre;
        movieCounter++;
    }

    public String getName_of_movie() {
        return name_of_movie;
    }

    public Date getDate_of_release() {
        return date_of_release;
    }

    public float getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public static int getMovieCounter() {
        return movieCounter;
    }
   public static int getRatingForOscar(){
        return ratingForOscar;
   }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static void setMovieCounter(int movieCounter) {
        Movie.movieCounter = movieCounter;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name_of_movie='" + name_of_movie + '\'' +
                ", date_of_release=" + date_of_release +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
    public void resetCounter(){
        movieCounter = 0;
    }
    public boolean isWonOscar(){
        if (this.rating>=Movie.ratingForOscar)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Movie m = new Movie("Matrix", 8, "Action");
        Movie m1 = new Movie("The Fast", 7, "Action");
        System.out.println(Movie.getMovieCounter());
    }
}


