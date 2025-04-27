/**
 * Filename:SortAndSearch.java
 * Description:This class aims to implement sort and search algorithms on our movies
 * How to compile:javac SortAndSearch.java
 * 
 */
import java.util.ArrayList;
public class SortAndSearch{

    public void sortMoviesByRating(ArrayList<Movie>movies){

        int n = movies.size();
        for (int i = 1; i < n; i++) {
            Movie key = movies.get(i);
            int j = i - 1;

            // Move elements that are smaller than key forward
            while (j >= 0 && movies.get(j).getRating() > key.getRating()) {
                movies.set(j + 1, movies.get(j));
                j--;
            }

            // Place key in the correct position
            movies.set(j + 1, key);
        }
    }

        public void sortMoviesByName(ArrayList<Movie> movies) {
            int n = movies.size();
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
    
                // Find the index of the smallest (alphabetically first) movie title
                for (int j = i + 1; j < n; j++) {
                    if (movies.get(j).getTitle().compareToIgnoreCase(movies.get(minIndex).getTitle()) < 0) {
                        minIndex = j;
                    }
                }
    
                // Swap movies[i] with movies[minIndex]
                Movie temp = movies.get(i);
                movies.set(i, movies.get(minIndex));
                movies.set(minIndex, temp);
            }
    

}
}