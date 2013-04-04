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
        /*
        String sMakeTable = "CREATE TABLE dummy (id numeric, response text)";
        String sMakeInsert1 = "INSERT INTO dummy VALUES(1,'Hello from the database')";
        String sMakeInsert2 = "INSERT INTO dummy VALUES (2, 'Testing from the database')";
        String sMakeSelect = "SELECT response from dummy";
        */
        String sMakeTable = "CREATE TABLE movielist (title text, director text, actor text)";
        String sMakeInsert1 = "INSERT INTO movielist VALUES('Mission Impossible', 'bob', 'tom cruise')";
        String sMakeInsert2 = "INSERT INTO movielist VALUES('Mission Impossible 2', 'bob', 'tom cruise')";
        String sMakeSelect1 = "SELECT title from movielist";
        String sMakeSelect2 = "SELECT director from movielist";
         
        // create a database connection
        Connection conn = DriverManager.getConnection(sDbUrl);
        try {
            Statement stmt = conn.createStatement();
            try {
                stmt.setQueryTimeout(iTimeout);
                stmt.executeUpdate( sMakeTable );
                stmt.executeUpdate( sMakeInsert1 );
                stmt.executeUpdate( sMakeInsert2 );
                ResultSet rs1 = stmt.executeQuery(sMakeSelect1);
                //ResultSet rs2 = stmt.executeQuery(sMakeSelect2);
                try {
                    while(rs1.next() /*&& rs2.next()*/) {
                        String sResult1 = rs1.getString("title");
                        //String sResult2 = rs2.getString("director");
                        System.out.println("Movie Title: " + sResult1/* + "\tMovie Director: " + sResult2*/);
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
