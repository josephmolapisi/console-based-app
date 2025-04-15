import java.util.ArrayList;

public class Horror extends Movie{
    protected String scaryCreature;

    public Horror(ArrayList<Cast> cast, ArrayList<Crew> crew, ArrayList<String> genres, ArrayList<String> languages, String title,String releaseDate, String description, int duration,String scaryCrreature){
      super(cast, crew, genres, languages, title, releaseDate, description, duration);
      this.scaryCreature=scaryCrreature;
    }

    public  void printMessage(){
        System.out.println("You are now watching a horror movie.!!!!The scary creature is a" +scaryCreature);
    }
    
    
}
