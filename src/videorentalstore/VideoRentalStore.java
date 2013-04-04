/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalstore;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.DatabaseMetaData;


/**
 *
 * @author bslater
 */
public class VideoRentalStore {

    /**
     * @param args the command line arguments
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        // register the driver 
        String sDriverName = "org.sqlite.JDBC";
        Class.forName(sDriverName);
        
        // now we set up a set of fairly basic string variables to use in the body of the code proper
        String sTempDb = "movies.db"; //hello.db -> movies.db
        String sJdbc = "jdbc:sqlite";
        String sDbUrl = sJdbc + ":" + sTempDb;
        // which will produce a legitimate Url for SqlLite JDBC :
        // jdbc:sqlite:movies.db
        int iTimeout = 30;
        /*String sMakeInsert1 = "CREATE TABLE \"customer\" (\"customerId\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL  UNIQUE , \"firstName\" VARCHAR NOT NULL , \"lastName\" VARCHAR NOT NULL , \"email\" VARCHAR NOT NULL , \"password\" VARCHAR NOT NULL , \"birthday\" VARCHAR, \"creditCardNum\" INTEGER, \"creditCardExpDate\" VARCHAR, \"address\" VARCHAR, \"city\" VARCHAR, \"state\" VARCHAR, \"zipcode\" INTEGER)";
        String sMakeInsert2 = "CREATE TABLE \"movies\" (\"movieId\" INTEGER PRIMARY KEY  NOT NULL  UNIQUE , \"title\" VARCHAR NOT NULL , \"genre\" VARCHAR NOT NULL , \"director\" VARCHAR NOT NULL , \"MPAA\" VARCHAR NOT NULL , \"userRating\" INTEGER NOT NULL )";
        String sMakeInsert3 = "CREATE TABLE \"rentals\" (\"rentalID\" INTEGER PRIMARY KEY  NOT NULL ,\"customerID\" INTEGER NOT NULL ,\"movieID\" INTEGER NOT NULL ,\"timeRented\" DATETIME NOT NULL  DEFAULT (CURRENT_DATE) ,\"timeDue\" DATETIME NOT NULL  DEFAULT (CURRENT_DATE) )";*/
        String sMakeInsert4 = "INSERT INTO \"main\".\"movies\" (\"title\",\"genre\",\"director\",\"MPAA\",\"userRating\") VALUES ('Star Wars', 'Action', 'George Lucas', 'G', 100)";
        
        //String sMakeSelect1 = "SELECT userRating, title from movies"; //pulls 2 columns from table movies
        String sMakeInsert5 = "INSERT INTO \"main\".\"customer\" (\"firstName\",\"lastName\",\"email\",\"password\",\"birthday\",\"creditCardNum\",\"creditCardExpDate\",\"address\",\"city\",\"state\",\"zipcode\") VALUES ('Bob', 'Test', 'bobTest@gmail.com', 'password', 'March 30 1970', 1234567890123456, 'April 2015', '123 Fake St', 'Hartford', 'Connecticut', 06117)";
        String sMakeSelect1 = "SELECT email FROM customer WHERE password = 'password' ";
        //String sMakeSelect2 = "SELECT director from movielist";
         
        // create a database connection
        Connection conn = DriverManager.getConnection(sDbUrl);
        
        try {
            Statement stmt = conn.createStatement();
            try {
                stmt.setQueryTimeout(iTimeout);
                //stmt.executeUpdate( sMakeTable );
                //stmt.executeUpdate( sMakeInsert1 );
                //stmt.executeUpdate( sMakeInsert2 );
                //stmt.executeUpdate( sMakeInsert3 );
                //stmt.executeUpdate( sMakeInsert4 );
                //stmt.executeUpdate( sMakeInsert5 );
                ResultSet rs1 = stmt.executeQuery(sMakeSelect1);
                //ResultSet rs2 = stmt.executeQuery(sMakeSelect2);
                try {
                    while(rs1.next() /*&& rs2.next()*/) {
                        //Integer sResult = rs1.getInt("userRating");
                        //String Result = rs1.getString("title");
                        String emailResult = rs1.getString("email");
                        //String sResult1 = rs1.getString("title");
                        //String sResult2 = rs2.getString("director");
                        //System.out.println("Movie Title: " + Result + "\tUser Rating: " + sResult);
                        System.out.println("Email: " + emailResult );
                    }
                } finally {
                    try {
                        rs1.close();
                    }
                    catch (Exception ignore) {}
                }
            } finally {
                try {
                    stmt.close();
                }
                catch (Exception ignore) {}
            }
        } finally {
            try { 
                conn.close();
            }
            catch (Exception ignore) {}
        }
    }
}
