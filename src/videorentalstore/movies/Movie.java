package videorentalstore.movies;

/**
 * Created 4/2/13
 * Last Edited 4/2/13
 * @author bslater
 */
public class Movie {
    private String title, director, mpaaRating;
    private String actors; //possibly make this a list?
    private int movieID, userRating;
    
    
    public Movie(int movieID, String title, String director, String actors, int userRating, String mpaaRating) {
        setMovieID(movieID);
        setTitle(title);
        setDirector(director);
        setActors(actors);
        setUserRating(userRating);
        setMPAARating(mpaaRating);
    }
    
    public int getMovieID() {
        return this.movieID;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getDirector() {
        return this.director;
    }
    
    public String getActors() {
        return this.actors;
    }
    
    public int getUserRating() {
        return this.userRating;
    }
    
    public String getMPAARating() {
        return this.mpaaRating;
    }
    
    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public void setActors(String actors) {
        this.actors = actors;
    }
    
    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
    
    public void setMPAARating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
}