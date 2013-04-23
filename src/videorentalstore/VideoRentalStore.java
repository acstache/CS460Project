package videorentalstore;

import videorentalstore.database.Database;
import videorentalstore.gui.Account_SignIn;

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
        rentalStore.browseActors();
        System.out.println();
        rentalStore.findMoviesWithActor("Hugo Weaving");
        System.out.println();
        rentalStore.findMoviesOverUserRating(80);
        System.out.println();
        rentalStore.findMoviesWithMPAARating("R");
        System.out.println();
        rentalStore.findMovieByID(16);
        System.out.println();
        
        //User u = new User(1,"Will","Acheson","willyach07","password");
        
        //rentalStore.addUsertoDB(u);
        
        //rentalStore.searchUserinDBbyID(50);
        rentalStore.searchUserinDBbyID(2);
        System.out.println();
        rentalStore.searchUserinDBbyLastName("Acheson");
        //rentalStore.deleteUser("Will", "Acheson");
        
        System.out.println();
        
        /*rentalStore.addRental(2, 6);
        rentalStore.addRental(2, 11);
        rentalStore.addRental(1, 3);*/
        
        rentalStore.showAllRentals();
        rentalStore.getRentalHistory(2);
        

        System.out.println("\nDone running");
        
        new Account_SignIn(rentalStore).setVisible(true);
    }
}
