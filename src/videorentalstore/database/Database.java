package videorentalstore.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

import videorentalstore.movies.Movie;

public class Database {
    private Connection conn;
    private Statement stmt;
    private String DbName, DbUrl;
    private String Jdbc = "jdbc:sqlite";
    private int timeout = 30;
    private Collection<Movie> movies;
    
    public Database(String DbName) throws Exception {
        // register the JDBC driver 
        String sDriverName = "org.sqlite.JDBC";
        Class.forName(sDriverName);
        
        // create the database url to connect to
        this.DbName = DbName;
        DbUrl = Jdbc + ":" + this.DbName;
        
        // create the connection
        this.conn = DriverManager.getConnection(DbUrl);
        
        //createMovieObjects(); no actors column in movies table
    }
    
    public void initDatabaseTables() throws Exception {
        executeUpdate("CREATE TABLE \"customer\" (\"customerId\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE , \"firstName\" VARCHAR NOT NULL , \"lastName\" VARCHAR NOT NULL , \"email\" VARCHAR NOT NULL , \"password\" VARCHAR NOT NULL , \"birthday\" VARCHAR, \"creditCardNum\" INTEGER, \"creditCardExpDate\" VARCHAR, \"address\" VARCHAR, \"city\" VARCHAR, \"state\" VARCHAR, \"zipcode\" INTEGER)");
        executeUpdate("CREATE TABLE \"movies\" (\"movieId\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE , \"title\" VARCHAR NOT NULL , \"genre\" VARCHAR NOT NULL , \"director\" VARCHAR NOT NULL , \"MPAA\" VARCHAR NOT NULL , \"userRating\" INTEGER NOT NULL )");
        executeUpdate("CREATE TABLE \"rentals\" (\"rentalID\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE ,\"customerID\" INTEGER NOT NULL ,\"movieID\" INTEGER NOT NULL ,\"timeRented\" DATETIME NOT NULL DEFAULT (CURRENT_DATE) ,\"timeDue\" DATETIME NOT NULL DEFAULT (CURRENT_DATE) )");
    }
    
    private void createMovieObjects() throws Exception {
        stmt = conn.createStatement();
        stmt.setQueryTimeout(timeout);
        ResultSet rs = stmt.executeQuery("SELECT * FROM movies");
        while(rs.next()) {
            movies.add(new Movie(rs.getInt("movieId"), rs.getString("title"), rs.getString("director"), rs.getString("actors"), rs.getInt("userRating"), rs.getString("MPAA")));
        }
    }
    
    private void executeUpdate(String update) throws Exception {
        stmt = conn.createStatement();
        stmt.setQueryTimeout(timeout);
        stmt.executeUpdate(update);
    }
    
    private ResultSet executeQuery(String query) throws Exception {
        stmt = conn.createStatement();
        stmt.setQueryTimeout(timeout);
        return stmt.executeQuery(query);
    }
    
    
    /***************************************
     *                                     *
     *         Movies Table Stuff          *
     *                                     *
     ***************************************/
    
    
    public void addMovieToDB(Movie movie) {
        //add movie into database
    }
    
    public void remMovieFromDB(Movie movie) {
        //find movie in database, remove it
    }
    
    public void editMovieInDB(Movie movie) {
        //find movie in database, compare "changes", if different, make changes
    }
    
    /**
     * Search the database of movies based on provided Movie Title
     * @param title the title (or part of) provided
     */
    public void findMoviesByTitle(String title) {
        String search = "SELECT title FROM movies WHERE title LIKE '%" + title + "%'";
        try {
            ResultSet movies = executeQuery(search);
            System.out.println("Movies with \"" + title + "\" in the title:");
            while (movies.next()) {
                String movie = movies.getString("title");
                System.out.println(movie);
                //TODO make this tie into the GUI
            }
            try {
                movies.close();
            }
            catch (Exception ignore) {}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Browse the database of all unique movies
     */
    public void browseMoviesByTitles() {
        String search = "SELECT DISTINCT title FROM movies";
        try {
            ResultSet movies = executeQuery(search);
            System.out.println("A List of all Movies in stock");
            while (movies.next()) {
                String movie = movies.getString("title");
                System.out.println(movie);
                //TODO make this tie into the GUI
            }
            try {
                movies.close();
            }
            catch (Exception ignore) {}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Search the database for a list of directors of movies in stock
     * @param director the name (or part of) of the director
     */
    public void findMoviesByDirector(String director) {
        String search = "SELECT DISTINCT director, title FROM movies WHERE director LIKE '%" + director + "%'";
        try {
            ResultSet directors = executeQuery(search);
            System.out.println("Directors with \"" + director + "\" in their name");
            while (directors.next()) {
                String dirName = directors.getString("director");
                String title = directors.getString("title");
                System.out.println(dirName + " directed " + title);
                //TODO make this tie into the GUI
            }
            try {
                directors.close();
            }
            catch (Exception ignore) {}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void browseDirectors() {
        String search = "SELECT DISTINCT director FROM movies";
        try {
            ResultSet directors = executeQuery(search);
            System.out.println("Directors of movies in stock");
            while (directors.next()) {
                String dirName = directors.getString("director");
                System.out.println(dirName);
                //TODO make this tie into the GUI
            }
            try {
                directors.close();
            }
            catch (Exception ignore) {}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void browseMoviesByGenre(String genre) {
        String search = "SELECT DISTINCT title, genre FROM movies WHERE genre='" + genre + "'";
        try {
            ResultSet movies = executeQuery(search);
            System.out.println("Movies tagged with genre: \"" + genre + "\"");
            while (movies.next()) {
                String movieName = movies.getString("title");
                System.out.println(movieName);
                //TODO make this tie into the GUI
            }
            try {
                movies.close();
            }
            catch (Exception ignore) {}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    /***************************************
     *                                     *
     *        Customer Table Stuff         *
     *                                     *
     ***************************************/
    
    
    
    /***************************************
     *                                     *
     *         Rental Table Stuff          *
     *                                     *
     ***************************************/
}