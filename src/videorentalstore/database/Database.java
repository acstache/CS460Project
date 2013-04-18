package videorentalstore.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

import videorentalstore.User.User;
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
        executeUpdate("CREATE TABLE \"customer\" (\"customerID\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , \"firstName\" VARCHAR NOT NULL , \"lastName\" VARCHAR NOT NULL , \"email\" VARCHAR NOT NULL , \"password\" VARCHAR NOT NULL , \"birthday\" VARCHAR, \"CreditCardNum\" INTEGER, \"CreditCardExpDate\" VARCHAR, \"address\" VARCHAR, \"city\" VARCHAR, \"state\" VARCHAR, \"zipcode\" INTEGER)");
        executeUpdate("CREATE TABLE \"movies\" (\"movieId\" INTEGER PRIMARY KEY  NOT NULL  UNIQUE , \"title\" VARCHAR NOT NULL , \"genre\" VARCHAR NOT NULL , \"director\" VARCHAR NOT NULL , \"MPAA\" VARCHAR NOT NULL , \"userRating\" INTEGER NOT NULL , \"totalQuantity\" INTEGER NOT NULL  DEFAULT 1, \"leftInStock\" INTEGER NOT NULL  DEFAULT 1, \"actors\" VARCHAR)");
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
        String findMovie = "SELECT * FROM movies WHERE title='" + movie.getTitle() + "'";
        try {
            ResultSet movies = executeQuery(findMovie);
            while (movies.next()) {
                String addMovie = "UPDATE movies SET totalQuantity=" + (movies.getInt("totalQuantity")+1) + ", leftInStock=" + (movies.getInt("leftInStock")+1) + " WHERE title='" + movie.getTitle() + "'";
                executeUpdate(addMovie);
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
    
    
    public void addUsertoDB(User user) {
        boolean userAddRES;
        try {
            String insert = "INSERT INTO \"customer\" (\"firstName\",\"lastName\",\"email\",\"password\") VALUES (" + user.getFirstName() + "," + user.getLastName() + "," + user.getEmail() + "," + user.getPassword() + ")";
            System.out.println(insert);
            stmt = conn.createStatement();
            userAddRES = stmt.execute(insert);
        }
        catch (Exception e) {
            System.out.println("Error adding user to Database: " + e.toString());
            try {
                conn.close();
            }
            catch (Exception e1) {}
        }
    }
    
    public void searchUserinDBbyID(int ID) {
        try {
            String search = "SELECT * FROM customer WHERE customerID = " + ID ;
            ResultSet searchUserRES = executeQuery(search);
            while (searchUserRES.next()) {
                String user = "\nFirst Name: " + searchUserRES.getString("firstName") + "\nLast Name: " + searchUserRES.getString("lastName") + "\nEmail Address: " + searchUserRES.getString("email") + "\nPassword: " + searchUserRES.getString("password");
                System.out.println("User Found at searched ID: " + ID + user);
            }
        }
        catch (Exception e) {
            try {
                conn.close();
            }
            catch (Exception e1) {}
        }
        
    }
   
    public void searchUserinDBbyLastName(String lastName) {
        try {
            String search = "SELECT * FROM customer WHERE lastName = '" + lastName + "'" ;
            ResultSet searchUserLastNameRES = executeQuery(search);
            while (searchUserLastNameRES.next()) {
                String user = "\nFirst Name: " + searchUserLastNameRES.getString("firstName") + "\nLast Name: " + searchUserLastNameRES.getString("lastName") + "\nEmail Address" + searchUserLastNameRES.getString("email") + "\nPassword: " + searchUserLastNameRES.getString("password");
                System.out.println("User Found at Last Name: " + lastName + user);
            }
        }
        catch (Exception e) {
            try {
                conn.close();
            }
            catch (Exception e1) {}
        }
    }
    
    public void deleteUser(String firstName , String lastName) {
        boolean userDeleteRES;
        try {
            String delete = "DELETE FROM customer WHERE lastName ='" + lastName + "' AND firstName='" + firstName + "'";
            System.out.println(delete);
            stmt = conn.createStatement();
            userDeleteRES = stmt.execute(delete);
            System.out.println("User: " + firstName + " " + lastName + " was deleted from the database.");
        }
        catch (Exception e) {
            System.out.println("Error deleting user from Database: " + e.toString());
            try {
                conn.close();
            }
            catch (Exception e1) {
            }
        }
    }
    
    
    
    /***************************************
     *                                     *
     *         Rental Table Stuff          *
     *                                     *
     ***************************************/
    
    
    public void addRental(int customerID, int movieID) {
        String addRental = "INSERT INTO \"rentals\" (\"customerID\",\"movieID\",\"timeRented\",\"timeDue\") VALUES (" + customerID + ", " + movieID + ", CURRENT_DATE, CURRENT_DATE";
        try {
            executeUpdate(addRental);
        }
        catch (Exception e) {}
    }
    
    public void showAllRentals() {
        String rentals = "SELECT * FROM rentals";
        try {
            ResultSet rs = executeQuery(rentals);
            while(rs.next()) {
                System.out.println("Customer ID: " + rs.getInt("customerID") + "\nMovie ID: " + rs.getInt("movieID") + "\nTime Rented: " + rs.getDate("timeRented") + "\nTime Due: " + rs.getDate("timeDue") + "\n");
            }
        }
        catch (Exception e) {}
    }
}