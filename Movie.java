/**
 * Filename:Movie.java
 * Description:
 * How to compile:javac Movie.java
 * How to run: java Movie
 * 
 */

import java.util.ArrayList;
public class Movie{


    //instance variables
    
    protected String title;
    protected int duration;   //this is length of movie in minutes
    private String description;
    protected String releaseDate;
    ArrayList<String>genres;
    ArrayList<String>languages;
    ArrayList<Crew>crew;
    ArrayList<Cast>cast;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(ArrayList<Cast> cast, ArrayList<Crew> crew, ArrayList<String> genres, ArrayList<String> languages, String title,String releaseDate, String description, int duration){

        // initialise instance variables
        this.title = title;
        this.releaseDate=releaseDate;
        this.description=description;
        this.duration = duration;
        cast = new ArrayList<Cast>();
        crew = new ArrayList<Crew>();
        genres = new ArrayList<String>();
        languages = new ArrayList<String>();
        
    }

public void setTitle(String title){
    this.title=title;

}
public String getTitle()
{
    return title;
}
public void setDuration(int duration){
    this.duration=duration;

}
public int getDuration(){
    return this.duration;
}
public void setReleaseDate(String releaseDate){
    this.releaseDate=releaseDate;

}
public String getReleaseDate(){
    return this.releaseDate;
}
public void setDescription(String description){
    this.description=description;

}
public String getDescription(){
    return this.description;
}
 
public ArrayList<String> getLanguages()
{
    return languages;
}  

public void addLanguage(String language)
{
    this.languages.add(language);
}
 /**
     * this methods displays the Movie information
     */
public void movieDetails(){
    System.out.println("Title of movie" + title);
    System.out.println("Movie description: " + description);
    System.out.println(duration+" Minutes");
    System.out.println("Stars of the movie " + title + ": ");

   //iterate through the whole array of actrors and print them
    int i = 0;
    for(i = 0; i < cast.size(); i++)
    {
        Cast currentStar = cast.get(i);
        System.out.print(currentStar.getName()+",");
    }
    
   //genre of movie
    System.out.println("Genre of movie: ");
    
    //print out each and every crew involved in the movie, e.g Director, producer
    System.out.println("Crew :");
    for(i = 0; i < crew.size(); i++)
    {
        Crew currentCrewMember = crew.get(i);
        System.out.println(currentCrewMember.getName()+",");
       
    }
    
    System.out.println("Rating: ");
    



}


   


}


