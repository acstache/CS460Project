package videorentalstore.movies;

/**
 * Created 4/2/13
 * Last Edited 4/2/13
 * @author bslater
 */
public class Movie {
    private String title, director;
    private String actors;
    
    
    public Movie(String title, String director, String actors) {
        setTitle(title);
        setDirector(director);
        setActors(actors);
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
    
    private void setTitle(String title) {
        this.title = title;
    }
    
    private void setDirector(String director) {
        this.director = director;
    }
    
    private void setActors(String actors) {
        this.actors = actors;
    }
}