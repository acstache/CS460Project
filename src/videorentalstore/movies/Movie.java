package videorentalstore.movies;

/**
 * Created 4/2/13
 * Last Edited 4/16/13
 * @author bslater
 */
public class Movie {
    private String title, genre, director, mpaaRating, actorList;
    private String[] actors;
    private int movieID, userRating;
    
    
    public Movie(int movieID, String title, String genre, String director, String actorList, int userRating, String mpaaRating) {
        setMovieID(movieID);
        setTitle(title);
        setGenre(genre);
        setDirector(director);
        setActors(actorList);
        setUserRating(userRating);
        setMPAARating(mpaaRating);
    }
    
    public int getMovieID() {
        return this.movieID;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getGenre() {
        return this.genre;
    }
    
    public String getDirector() {
        return this.director;
    }
    
    public String[] getActors() {
        return this.actors;
    }
    
    public String getActorsList() {
        return this.actorList;
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
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    /**
     * Sets the Array of Actor/Actress names given a comma separated list of names
     * @param actors the comma separated list of names
     */
    public void setActors(String actors) {
        this.actorList = actors;
        this.actors = actors.split(",");
    }
    
    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }
    
    public void setMPAARating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
}