package videorentalstore;

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
        System.out.print("\n");
        rentalStore.findMoviesByDirector("Lucas");
        System.out.print("\n");
        rentalStore.browseMoviesByTitles();
        System.out.print("\n");
        rentalStore.browseMoviesByGenre("Adventure");
        System.out.println();
        rentalStore.browseDirectors();
        //TODO include actors, user ratings searches/browse options
        System.out.println("\nDone running");
        //TODO insert more movies into the database. Lethal Weapon, LotR, w/e
    }
}
