import java.util.ArrayList;

// Type of movie that includes scary creatures 
public class Horror extends Movie{
    // stores name of the scaryCreature in the movie
    private String scaryCreature;

    // Constructor to create a horror movie with all details
    public Horror(ArrayList<Cast> cast, ArrayList<Crew> crew, ArrayList<String> genres, ArrayList<String> languages, String title,String releaseDate, String description, int duration,String scaryCrreature){
        // call the movie constructor to set up details
      super(cast, crew, genres, languages, title, releaseDate, description, duration);
        // set the scaryCreature for this movie
      this.scaryCreature=scaryCrreature;
    }

    // output a message that shows the horror movie you are watching and show the scary creatures
    public  void printMessage(){
        System.out.println("You are now watching a horror movie.!!!!The scary creature is a" +scaryCreature);
    }
    
    
}
