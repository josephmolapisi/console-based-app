/**


*/
import java.util.ArrayList;;
public interface Implementables{
    void displayMovies();
    void addMovie(Movie movie)throws DuplicateMovieException;
    Movie searchMovie(String title)throws MovieNotFoundException;
    void updateMovieDetails(Movie movie)throws MovieNotFoundException;
    void deleteMovie(String title)throws MovieNotFoundException;
   
    
    

}