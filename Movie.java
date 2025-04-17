/**
 * Filename:Movie.java
 * Description: A domain class containing all attributes of a movie
 * How to compile:javac Movie.java
 * How to run: java Movie
 * 
 */

import java.util.ArrayList;
public class Movie{


    //instance variables
    
    private String title;
    private int duration;   //this is length of movie in minutes
    private String description;
    private String releaseDate;
    private int rating;
    ArrayList<String>genres;
    ArrayList<String>languages;
    ArrayList<Crew>crew;
    ArrayList<Cast>cast;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title,String releaseDate, String description, int duration,int rating){

        // initialise instance variables
        this.title = title;
        this.releaseDate=releaseDate;
        this.description=description;
        this.duration = duration;
        this.rating=rating;
        cast = new ArrayList<Cast>();
        crew = new ArrayList<Crew>();
        genres = new ArrayList<String>();
        languages = new ArrayList<String>();
        
    }

    // setter for movie title 
public void setTitle(String title){
    this.title=title;

}
    // getter for movie title
public String getTitle()
{
    return title;
}
    // Setter for duration 
public void setDuration(int duration){
    this.duration=duration;

}

// Getter for duration
public int getDuration(){
    return this.duration;
}

    // Setter for realese date 
public void setReleaseDate(String releaseDate){
    this.releaseDate=releaseDate;

}

    // getter for release date
public String getReleaseDate(){
    return this.releaseDate;
}

    // setter for description
public void setDescription(String description){
    this.description=description;

}

    // getter for description
public String getDescription(){
    return this.description;
}

    // setter for rating
    public void setRating(int rating){
        this.rating=rating;
        
    }

    // getter for rating
    public int getRating(){
        return this.rating;
    }
 //return the list of languages of the movie
public ArrayList<String> getLanguages()
{
    return languages;
}  

public void addLanguage(String language)
{
    this.languages.add(language);
}
public void addGenre(String genre){
    genres.add(genre);
}
//return the genres of the movie
public ArrayList<String> getGenres(){
    return genres;
}
 /**
     * this methods displays the Movie information
     */
public void movieDetails(){
    System.out.println("Title of movie" + title);
    System.out.println("Movie description: " + description);
    System.out.println(duration+" Minutes");
    System.out.println("Released: "+releaseDate);

   //iterate through the whole array of actrors and print them
    
    for(Cast currentStar:cast){
        System.out.print("Cast: "+currentStar.getName()+",");
    }
    
   //genres of movie
   System.out.println("Genres: ");
    for(String s:genres){
    System.out.print(s +",");
    
   }
    
     //print out each and every crew involved in the movie, e.g Director, producer
    System.out.println("Directors :");

    for(Crew staff:crew){
        if(staff.getRole().equalsIgnoreCase("director")){
            System.out.print(staff.getName()+",");

        }

    }
    // output the rating for the movie 
    System.out.println("Rating: "+ rating);
    



}


   


}


