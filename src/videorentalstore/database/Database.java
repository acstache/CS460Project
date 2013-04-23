package videorentalstore.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;

import videorentalstore.User.User;
import videorentalstore.movies.Movie;

public class Database {
    private Connection conn;
    private Statement stmt;
    private String DbName, DbUrl;
    private String Jdbc = "jdbc:sqlite";
    private int timeout = 30;
    
    /**
     * 
     * @param DbName
     * @throws Exception
     */
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
    
    //TODO do we need this?
    public void initDatabaseTables() throws Exception {
        executeUpdate("CREATE TABLE \"customer\" (\"customerID\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , \"firstName\" VARCHAR NOT NULL , \"lastName\" VARCHAR NOT NULL , \"email\" VARCHAR NOT NULL , \"password\" VARCHAR NOT NULL , \"birthday\" VARCHAR, \"CreditCardNum\" INTEGER, \"CreditCardExpDate\" VARCHAR, \"address\" VARCHAR, \"city\" VARCHAR, \"state\" VARCHAR, \"zipcode\" INTEGER)");
        executeUpdate("CREATE TABLE \"movies\" (\"movieId\" INTEGER PRIMARY KEY  NOT NULL  UNIQUE , \"title\" VARCHAR NOT NULL , \"genre\" VARCHAR NOT NULL , \"director\" VARCHAR NOT NULL , \"MPAA\" VARCHAR NOT NULL , \"userRating\" INTEGER NOT NULL , \"totalQuantity\" INTEGER NOT NULL  DEFAULT 1, \"leftInStock\" INTEGER NOT NULL  DEFAULT 1, \"actors\" VARCHAR)");
        executeUpdate("CREATE TABLE \"rentals\" (\"rentalID\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE ,\"customerID\" INTEGER NOT NULL ,\"movieID\" INTEGER NOT NULL ,\"timeRented\" DATETIME NOT NULL DEFAULT (CURRENT_DATE) ,\"timeDue\" DATETIME NOT NULL DEFAULT (CURRENT_DATE) )");
        executeUpdate("CREATE TABLE \"billings/payments\""); //TODO fill this in with the proper column names and properties
    }
    
    /**
     * 
     * @param update
     * @throws Exception
     */
    private void executeUpdate(String update) throws Exception {
        stmt = conn.createStatement();
        stmt.setQueryTimeout(timeout);
        stmt.executeUpdate(update);
    }
    
    /**
     * 
     * @param query
     * @return
     * @throws Exception
     */
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
    
    
    @Deprecated
    public void addMovieToDB(Movie movie) {
        addMovieToDB(movie.getTitle(), movie.getGenre(), movie.getDirector(), movie.getMPAARating(), movie.getUserRating(), movie.getActorsList());
    }
    
    public void addMovieToDB(String title, String genre, String director, String MPAA, int userRating, String actors) {
        String findMovie = "SELECT * FROM movies WHERE title='" + title + "'";
        try {
            ResultSet movies = executeQuery(findMovie);
            if (!movies.next()) {
                String addMovie = "INSERT INTO \"movies\" (\"title\", \"genre\", \"director\", \"MPAA\", \"userRating\", \"actors\") VALUES (" + title + ", " + genre + ", " + director + ", " + MPAA + ", " + userRating + ", " + actors + ")";
                executeUpdate(addMovie);
            }
            else {
                while (movies.next()) {
                    String addMovie = "UPDATE movies SET totalQuantity=" + (movies.getInt("totalQuantity")+1) + ", leftInStock=" + (movies.getInt("leftInStock")+1) + " WHERE title='" + title + "'";
                    executeUpdate(addMovie);
                }
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
     * 
     * @param movie
     */
    public void remMovieFromDB(Movie movie, int copies, boolean allCopies) {
        //TODO different logic if it's remove X copies or all copies
    }
    
    /**
     * 
     * @param movie
     */
    public void editMovieInDB(Movie movie) {
        //TODO find movie in database, compare "changes", if different, make changes
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
    
    /**
     * 
     */
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
    
    /**
     * 
     * @param genre
     */
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
    
    public void browseActors() {
        String search = "SELECT DISTINCT actors FROM movies";
        try {
            ResultSet actors = executeQuery(search);
            System.out.println("Actors of movies in stock");
            while (actors.next()) {
                String actorName = actors.getString("actors");
                System.out.println(actorName);
                //TODO make this tie into the GUI
            }
            try {
                actors.close();
            }
            catch (Exception ignore) {}
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void findMoviesWithActor(String actor) {
        //TODO figure out how to send just a set of Movies back
        String search = "SELECT DISTINCT actors, title FROM movies WHERE actors LIKE '%" + actor + "%'";
        HashSet<String> movieSet = new HashSet<String>();
        try {
            ResultSet movies = executeQuery(search);
            System.out.println("Actors with \"" + actor + "\" in their name");
            while (movies.next()) {
                String title = movies.getString("title");
                movieSet.add(title);
                System.out.println(actor + " played in " + title);
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
    
    public void findMoviesOverUserRating(int rating) {
        String search = "SELECT title, userRating FROM movies WHERE userRating>" + rating;
        try {
            ResultSet movies = executeQuery(search);
            System.out.println("Movies with average user ratings over " + rating);
            while (movies.next()) {
                int userRating = movies.getInt("userRating");
                String title = movies.getString("title");
                System.out.println(title + " is rated " + userRating + " by users");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void findMoviesWithMPAARating(String rating) {
        String search = "SELECT title, MPAA FROM movies WHERE MPAA='" + rating + "'";
        try {
            ResultSet movies = executeQuery(search);
            System.out.println("Movies with an MPAA rating of " + rating);
            while (movies.next()) {
                String MPAA = movies.getString("MPAA");
                String title = movies.getString("title");
                System.out.println(title + " is rated " + MPAA);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void findMovieByID(int movieID) {
        String search = "SELECT * FROM movies WHERE movieId=" + movieID;
        try {
            ResultSet movie = executeQuery(search);
            while (movie.next()) {
                String title = movie.getString("title");
                System.out.println("Movie #" + movieID + " titled: " + title);
            }
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
    
    
    /**
     * 
     * @param user
     */
    //TODO update this to do every piece of user data, and to use executeUpdate(String)
    public void addUsertoDB(User user) {
        try {
            String insert = "INSERT INTO \"customer\" (\"firstName\",\"lastName\",\"email\",\"password\") VALUES (" + user.getFirstName() + "," + user.getLastName() + "," + user.getEmail() + "," + user.getPassword() + ")";
            executeUpdate(insert);
        }
        catch (Exception e) {
            System.out.println("Error adding user to Database: \n" + e.toString());
        }
    }
    
    /**
     * 
     * @param ID
     */
    public void searchUserinDBbyID(int ID) {
        try {
            String search = "SELECT * FROM customer WHERE customerID = " + ID ;
            ResultSet searchUserRES = executeQuery(search);
            while (searchUserRES.next()) {
                String user = "\nFirst Name: " + searchUserRES.getString("firstName") + "\nLast Name: " + searchUserRES.getString("lastName") + "\nEmail Address: " + searchUserRES.getString("email") + "\nPassword: " + searchUserRES.getString("password");
                System.out.println("User Found at searched ID: " + ID + user);
            }
        }
        catch (Exception e) {}
    }
    
    /**
     * 
     * @param lastName
     */
    public void searchUserinDBbyLastName(String lastName) {
        try {
            String search = "SELECT * FROM customer WHERE lastName = '" + lastName + "'" ;
            ResultSet searchUserLastNameRES = executeQuery(search);
            while (searchUserLastNameRES.next()) {
                String user = "\nFirst Name: " + searchUserLastNameRES.getString("firstName") + "\nLast Name: " + searchUserLastNameRES.getString("lastName") + "\nEmail Address: " + searchUserLastNameRES.getString("email") + "\nPassword: " + searchUserLastNameRES.getString("password");
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
    
    /**
     * 
     * @param firstName
     * @param lastName
     */
    //TODO can we do this based on the Customer ID instead of the first/last name combo? people may have the same name..
    public void deleteUser(String firstName , String lastName) {
        try {
            String delete = "DELETE FROM customer WHERE lastName ='" + lastName + "' AND firstName='" + firstName + "'";
            executeUpdate(delete);
            System.out.println("User: " + firstName + " " + lastName + " was deleted from the database.");
        }
        catch (Exception e) {
            System.out.println("Error deleting user from Database: " + e.toString());
        }
    }
    

    /* Author Akua Duah
     * isUser checks user email and password against customer table in databse
     * @return iscustomer returns a boolean value which is checked against database
     */
    public boolean isUser(String email, String password) throws Exception {
        String search= " SELECT customerId FROM customer WHERE email='"+email+"' AND password='"+password+"'" ;
        try {
            ResultSet searchUserEmail = executeQuery(search);
            return (!searchUserEmail.next() ? false : true);
        }
        catch (Exception e) {}
        return false;
    }
    
    public boolean isEmloyee(String email) {
        String search = "SELECT isEmployee FROM customer WHERE email='" + email + "'";
        try {
            ResultSet searchEmp = executeQuery(search);
            if (searchEmp.next()) {
                System.out.println("Employee");
                String blah = searchEmp.getString("isEmployee");
                System.out.println(blah);
                return blah.equalsIgnoreCase("true");
            }
            else {
                System.out.println("Not an employee");
                return false;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    
    
    /***************************************
     *                                     *
     *         Rental Table Stuff          *
     *                                     *
     ***************************************/
    
    
    /**
     * 
     * @param customerID
     * @param movieID
     */
    public void addRental(int customerID, int movieID) {
        String addRental = "INSERT INTO \"rentals\" (\"customerID\",\"movieID\") VALUES (" + customerID + ", " + movieID + ")";
        try {
            executeUpdate(addRental);
        }
        catch (Exception e) {}
    }
    
    /**
     * 
     * @param customerID
     */
    public void getRentalHistory(int customerID) {
       String search = "SELECT * FROM rentals WHERE customerID=" + customerID;
       try {
           ResultSet rentHist = executeQuery(search);
           while(rentHist.next()) {
               System.out.println("Customer " + customerID + " rented Movie " + rentHist.getInt("movieID") + " on date " + rentHist.getDate("timeRented")); //TODO fix date, use String and parse
           }
       }
       catch (Exception e) {
           System.out.println(e);
       }
    }
    
    /**
     * 
     */
    public void showAllRentals() {
        String rentals = "SELECT * FROM rentals";
        try {
            ResultSet rs = executeQuery(rentals);
            while(rs.next()) {
                System.out.println("Customer ID: " + rs.getInt("customerID") + "\nMovie ID: " + rs.getInt("movieID") + "\nTime Rented: " + rs.getDate("timeRented") + "\nTime Due: " + rs.getDate("timeDue") + "\n"); //TODO fix date, use String and parse
            }
        }
        catch (Exception e) {}
    }
    
    

    /***************************************
     *                                     *
     *    Payments/Billing Table Stuff     *
     *                                     *
     ***************************************/
}