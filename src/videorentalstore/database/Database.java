package videorentalstore.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import videorentalstore.movies.Movie;

public class Database {
    private Connection conn;
    private Statement stmt;
    private String DbName, DbUrl;
    private String Jdbc = "jdbc:sqlite";
    private int timeout = 30;
    
    public Database(String DbName) throws Exception {
        // register the driver 
        String sDriverName = "org.sqlite.JDBC";
        Class.forName(sDriverName);
        
        this.DbName = DbName;
        DbUrl = Jdbc + ":" + this.DbName;
        
        this.conn = DriverManager.getConnection(DbUrl);
    }
    
    public void initDatabaseTables() throws Exception {
        executeUpdate("CREATE TABLE \"customer\" (\"customerId\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE , \"firstName\" VARCHAR NOT NULL , \"lastName\" VARCHAR NOT NULL , \"email\" VARCHAR NOT NULL , \"password\" VARCHAR NOT NULL , \"birthday\" VARCHAR, \"creditCardNum\" INTEGER, \"creditCardExpDate\" VARCHAR, \"address\" VARCHAR, \"city\" VARCHAR, \"state\" VARCHAR, \"zipcode\" INTEGER)");
        executeUpdate("CREATE TABLE \"movies\" (\"movieId\" INTEGER PRIMARY KEY NOT NULL UNIQUE , \"title\" VARCHAR NOT NULL , \"genre\" VARCHAR NOT NULL , \"director\" VARCHAR NOT NULL , \"MPAA\" VARCHAR NOT NULL , \"userRating\" INTEGER NOT NULL )");
        executeUpdate("CREATE TABLE \"rentals\" (\"rentalID\" INTEGER PRIMARY KEY NOT NULL UNIQUE ,\"customerID\" INTEGER NOT NULL ,\"movieID\" INTEGER NOT NULL ,\"timeRented\" DATETIME NOT NULL DEFAULT (CURRENT_DATE) ,\"timeDue\" DATETIME NOT NULL DEFAULT (CURRENT_DATE) )");
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
    
    
    public void findMoviesByTitle(String title) {
        String search = "SELECT title FROM movies WHERE title LIKE '%" + title + "%'";
        try {
            ResultSet movies = executeQuery(search);
            while (movies.next()) {
                String movie = movies.getString("title");
                System.out.println(movie);
                //TODO make this do something else, possibly add to a collection of Movie Objects
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
    
    public void findMoviesByDirector(String director) {
        String search = "SELECT director FROM movies WHERE director LIKE '%" + director + "%'";
        try {
            ResultSet directors = executeQuery(search);
            while (directors.next()) {
                String dirName = directors.getString("director");
                System.out.println(dirName);
                //TODO make this do something else, possibly add to a collection of Movie Objects
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