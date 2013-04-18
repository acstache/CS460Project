package videorentalstore;

import videorentalstore.User.User;
import videorentalstore.database.Database;


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
        Database rentalStore = new Database("movies.db");
        System.out.println("Database loaded\n");
        //rentalStore.initDatabaseTables();
        //System.out.println("Tables created");
        //rentalStore.findMoviesByTitle("Star Wars");
        //System.out.print("\n");
        rentalStore.findMoviesByTitle("of the");
        System.out.println();
        rentalStore.findMoviesByDirector("Lucas");
        System.out.println();
        rentalStore.browseMoviesByTitles();
        System.out.println();
        rentalStore.browseMoviesByGenre("Adventure");
        System.out.println();
        rentalStore.browseDirectors();
        System.out.println();
        //TODO include actors, user ratings searches/browse options
        
        //User u = new User(1,"Will","Acheson","willyach07","password");
        
        //rentalStore.addUsertoDB(u);
        
        //rentalStore.searchUserinDBbyID(50);
        rentalStore.searchUserinDBbyID(2);
        System.out.println();
        rentalStore.searchUserinDBbyLastName("Acheson");
        //rentalStore.deleteUser("Will", "Acheson");
        
        /*rentalStore.addRental(2, 6);
        rentalStore.addRental(2, 11);
        rentalStore.addRental(1, 3);*/
        
        rentalStore.showAllRentals();
        

        System.out.println("\nDone running");
    }
}
