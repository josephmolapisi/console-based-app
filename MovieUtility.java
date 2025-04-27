/**
 * Description:This class takes a list of movies and performs some functions on them
 *Filename:MovieUtility.java 
 * How to compile:javac MovieUtility.java
 */
import java.util.ArrayList;
public class MovieUtility implements Implementables{
   private  ArrayList<Movie> movies;

    public MovieUtility(){
        this.movies=new ArrayList<>();
    }


    /**
     * this method adds movie to the list of movies if it does not already exist
     * @param movie
     * @throws DuplicateMovieException
     */
    public void addMovie(Movie movie) throws DuplicateMovieException{
        for(Movie m:movies){
            if(movie.getTitle().equals(m.getTitle())){
                throw new DuplicateMovieException("Movie already exists!!");

            }

        }
        movies.add(movie);
    }

    /**
     * 
     * @param title
     * @return a movie corresponding to the title
     * @throws MovieNotFoundException
     */

   public  Movie searchMovie(String title)throws MovieNotFoundException{

    for (Movie movie : movies) {
        if (movie.getTitle().equalsIgnoreCase(title)) {
            return movie;
            //System.out.println("Movie"+movie+" found in the watchlist");
        }
    }
    throw new MovieNotFoundException("Movie not found!!!!.");
}

/**
 * method does not return anything, it simply deletes a movie if it exists
 * @param title
 * @throws MovieNotFoundException
 */

public void deleteMovie(String title)throws MovieNotFoundException{
    Movie movie=searchMovie(title);

    movies.remove(movie);

}

/**
 * this method updates some specific information of the movie
 * @param movie
 * @throws MovieNotFoundException
 */

    public void updateMovieDetails(Movie movie)throws MovieNotFoundException{

        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(movie.getTitle())) {
                m.setRating(movie.getRating());
                m.setReleaseDate(movie.getReleaseDate());
                
                return;
            }
        }
        throw new MovieNotFoundException("Movie not found.");




    }
    

    // this method lists all movies
    public void displayMovies() {
        System.out.println("====MY WATCHLIST====");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle() + " (" + movie.getReleaseDate() + ")");
        }
    }



}