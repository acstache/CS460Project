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
    }
    
    //TODO do we need this?
    public void initDatabaseTables() throws Exception {
        executeUpdate("CREATE TABLE \"customer\" (\"customerID\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , \"firstName\" VARCHAR NOT NULL , \"lastName\" VARCHAR NOT NULL , \"email\" VARCHAR NOT NULL , \"password\" VARCHAR NOT NULL , \"birthday\" VARCHAR, \"CreditCardNum\" CHAR(16), \"CreditCardExpDate\" VARCHAR, \"address\" VARCHAR, \"city\" VARCHAR, \"state\" CHAR(2), \"zipcode\" CHAR(5))");
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
                String addMovie = "INSERT INTO \"movies\" (\"title\", \"genre\", \"director\", \"MPAA\", \"userRating\" , \"actors\" ) VALUES ('" + title + "', '" + genre + "', '" + director + "', '" + MPAA + "', " + userRating + ", '" + actors +  "')";
                executeUpdate(addMovie);
            }
            else {
                String addMovie = "UPDATE movies SET totalQuantity=" + (movies.getInt("totalQuantity")+1) + ", leftInStock=" + (movies.getInt("leftInStock")+1) + " WHERE title='" + title + "'";
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
    
    /**
     * 
     * @param movie
     */
    public void remMovieFromDB(Movie movie, int copies, boolean allCopies) {
        String findMovie = "SELECT * FROM movies WHERE title='" + movie.getTitle() + "'";
        try {
            ResultSet movies = executeQuery(findMovie);
            if (!movies.next()) {
                System.out.println("No movie of that title in stock");
            }
            else {
                movies.previous(); // If there was actually a movie found, you must go back to make sure the pointer is in the right spot
                if (allCopies) {
                    String purge = "DELETE FROM movies WHERE title='" + movie.getTitle() + "'";
                    executeUpdate(purge);
                }
                else {
                    if (copies > movies.getInt("totalQuantity")) {
                        String purge = "DELETE FROM movies WHERE title='" + movie.getTitle() + "'";
                        executeUpdate(purge);
                    }
                    else {
                        String removeMovies = "UPDATE moviesSET totalQuantity=" + (movies.getInt("totalQuantity")-copies) + ", leftInStock=" + (movies.getInt("leftInStock")-copies) + " WHERE title='" + movie.getTitle() + "'";
                        executeUpdate(removeMovies);
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * 
     * @param movie
     */
    public void editMovieInDB(int movieID, Movie movie) {
        String findMovie = "SELECT * FROM movies WHERE movieId=" + movieID;
        try {
            ResultSet movies = executeQuery(findMovie);
            if (!movies.next()) {
                System.out.println("That movie is not in stock");
            }
            else {
                movies.previous();
                String updateMovie = "UPDATE movies SET title='" + movie.getTitle() + "', genre='" + movie.getGenre() + "', director='" + movie.getDirector() + "', MPAA='" + movie.getMPAARating() + "', userRating='" + movie.getUserRating() + "', actors='" + movie.getActors() + "' WHERE movieId=" + movieID;
                executeUpdate(updateMovie);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Search the database of movies based on provided Movie Title
     * @param title the title (or part of) provided
     */
    public ResultSet findMoviesByTitle(String title) {
        String search = "SELECT * FROM movies WHERE title LIKE '%" + title + "%'";
        ResultSet movies = null;
        try {
            movies = executeQuery(search);
            return movies;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return movies;
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
    public ResultSet browseMoviesByGenre(String genre) {
        String search = "SELECT * FROM movies WHERE genre='" + genre + "'";
        ResultSet movies = null;
        try {
            movies = executeQuery(search);
            System.out.println("Movies tagged with genre: \"" + genre + "\"");
            
            return movies;
        }
            catch (Exception e) {
            System.out.println(e);
        }
        return movies;
    }
    
    /**
     *
     * @param genre
     * @param string
     */
    public ResultSet browseMoviesByGenre(String genre, String string) {
        String search = "SELECT * FROM movies WHERE genre='" + genre + "' AND (title LIKE '%" + string + "%' OR director LIKE '%" + string + "%' OR actors LIKE '%" + string + "%')";
        ResultSet movies = null;
        try {
            movies = executeQuery(search);
            System.out.println("Movies tagged with genre: \"" + genre + "\"");
            
            return movies;
        }
            catch (Exception e) {
            System.out.println(e);
        }
        return movies;
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
        String search = "SELECT DISTINCT actors, title FROM movies WHERE actors LIKE '%" + actor + "%'";
        try {
            ResultSet actors = executeQuery(search);
            System.out.println("Actors with \"" + actor + "\" in their name");
            while (actors.next()) {
                String title = actors.getString("title");
                System.out.println(actor + " played in " + title);
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
    
    public ResultSet findMoviesWithMPAARating(String rating) {
        String search = "SELECT * FROM movies WHERE MPAA='" + rating + "'";
        ResultSet movies = null;
        try {
            movies = executeQuery(search);
            return movies;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return movies;
    }
    
    public ResultSet findMoviesWithMPAARating(String rating, String string) {
        String search = "SELECT * FROM movies WHERE MPAA='" + rating + "' AND (title LIKE '%" + string + "%' OR director LIKE '%" + string + "%' OR actors LIKE '%" + string + "%')";
        ResultSet movies = null;
        try {
            movies = executeQuery(search);
            return movies;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return movies;
    }
    
    /*
     * This method will return a result set of the Movie table which is to be used
     * when displaying the table in a JTable
     */
    public ResultSet displayMovieTable(){
        String fetchMovieTable = "SELECT * FROM movies" ;
        ResultSet movieDisplay = null;
        try {
            movieDisplay = executeQuery(fetchMovieTable);
            return movieDisplay;
        }
        catch(Exception e){
            System.out.println(e);
            return movieDisplay;
        }
    }
    
    
    public ResultSet generalSearch(String search){
        String generalSearch = "SELECT * FROM movies WHERE title LIKE '%" + search + "%' OR director LIKE '%" + search + "%' OR actors LIKE '%" + search + "%'";
        System.out.println(generalSearch);
        ResultSet generalMovies = null;
        try {
            generalMovies = executeQuery(generalSearch);
            return generalMovies;
        }
        catch (Exception e) {
            System.out.println(e);
            return generalMovies;
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
    @Deprecated
    public void addUsertoDB(User user) {
        addUsertoDB(user.getLastName(), user.getFirstName(), user.getEmail(), user.getPassword(), user.getBirthday(), user.getCCNum(), user.getCCExpDate(), user.getAddress(), user.getCity(), user.getState(), user.getZipCode(), user.isEmployee());
    }
    
    //TODO should we return a String that says the results of the add user call? "account created/already exists/promoted successfully/etc"?
    public void addUsertoDB(String lastName, String firstName, String email, String password, String birthday, String ccNum, String ccExp, String address, String city, String state, String zipcode, boolean isEmployee) {
        String search = "SELECT * FROM customer WHERE email='" + email + "'"; 
        try {
            ResultSet user = executeQuery(search);
            if (!user.next()) {
                String insert = "INSERT INTO customer (lastName , firstName , email, password, birthday, creditCardNum, creditCardExpDate, address, city, state, zipCode, isEmployee) VALUES ('" + lastName + "', '" + firstName + "', '" + email + "', '" + password + "', '" + birthday + "', '" + ccNum + "', '" + ccExp + "', '" + address + "', '" + city + "', '" + state + "', '" + zipcode + "', '" + isEmployee +"')";
                executeUpdate(insert);
            }
            else if (isEmployee) {
                user.previous(); // If there was actually an account found, you must go back to make sure the pointer is in the right spot
                if(user.getString("isEmployee").equalsIgnoreCase("true")) {
                    System.out.println("User is already an Employee");
                }
                else {
                    String promote = "UPDATE customer SET isEmployee='true' WHERE email='" + email + "'";
                    executeUpdate(promote);
                }
            }
            else {
                System.out.println("There is already an existing account with that email");
            }
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
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public int getCustomerID(String email) {
        try {
            String search = "SELECT customerID FROM customer WHERE email='" + email + "'";
            ResultSet custID = executeQuery(search);
            return custID.getInt("customerID");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
    
    /**
     * 
     * @param email
     */
    public void deleteUser(String email) {
        try {
            String delete = "DELETE FROM customer WHERE email ='" + email + "'";
            executeUpdate(delete);
        }
        catch (Exception e) {
            System.out.println("Error deleting user from Database: " + e.toString());
        }
    }
    
    /** Author Akua Duah
     * isUser checks user email and password against customer table in database
     * @param email username
     * @param password password
     * @return returns true if the email/password combo is correct, false in all other cases
     */
    public User isUser(String email, String password) throws Exception {
        String search= " SELECT * FROM customer WHERE email='"+email+"' AND password='"+password+"'" ;
        try {
            ResultSet searchUserEmail = executeQuery(search);
            return (!searchUserEmail.next() ? null : new User(searchUserEmail.getString("firstName"), searchUserEmail.getString("lastName"), searchUserEmail.getString("email"), searchUserEmail.getString("password"), searchUserEmail.getString("birthday"), searchUserEmail.getString("creditCardNum"), searchUserEmail.getString("creditCardExpDate"), searchUserEmail.getString("address"), searchUserEmail.getString("city"), searchUserEmail.getString("state"), searchUserEmail.getString("zipcode"), searchUserEmail.getString("isEmployee").equalsIgnoreCase("true")));
        }
        catch (Exception e) {}
        return null;
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
        catch (Exception e) {
           System.out.println(e);
       }
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
               System.out.println("Customer " + customerID + " rented Movie " + rentHist.getInt("movieID") + " on date " + rentHist.getDate("timeRented"));
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
                System.out.println("Customer ID: " + rs.getInt("customerID") + "\nMovie ID: " + rs.getInt("movieID") + "\nTime Rented: " + rs.getDate("timeRented") + "\nTime Due: " + rs.getDate("timeDue") + "\n");
            }
        }
        catch (Exception e) {
           System.out.println(e);
       }
    }
    
    

    /***************************************
     *                                     *
     *    Payments/Billing Table Stuff     *
     *                                     *
     ***************************************/
}