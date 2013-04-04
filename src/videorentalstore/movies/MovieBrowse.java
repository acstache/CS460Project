package videorentalstore.movies;

import java.util.Collection;

/**
 *
 * @author bslater
 */
public class MovieBrowse {
    private MovieDatabase movieDB;
    
    public Collection<Movie> browseByTitle(String title) {
        movieDB.addMovieToDB(new Movie("movie", "Director", "Bruce Willis"));
        return null;
    }
}