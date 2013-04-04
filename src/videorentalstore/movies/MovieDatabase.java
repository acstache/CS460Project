package videorentalstore.movies;

/**
 * Created 4/2/13
 * Last Edited 4/2/13
 * @author bslater
 */
public class MovieDatabase {
    public MovieDatabase(String DbUrl) {
        //TODO load database DbUrl, then the movies table
    }
    
    protected void addMovieToDB(Movie movie) {
        //add movie into database
    }
    
    protected void remMovieFromDB(Movie movie) {
        //find movie in database, remove it
    }
    
    protected void editMovieInDB(Movie movie) {
        //find movie in database, compare "changes", if different, make changes
    }
    
    protected void findMoviesByTitle(String title) {
        
    }
    
    protected void findMoviesByDirector(String director) {
        
    }
}