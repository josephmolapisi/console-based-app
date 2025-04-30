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
     private ArrayList<String>genres;
     private ArrayList<String>languages;
     private ArrayList<Crew>crew;
     private ArrayList<Cast>cast;
 
 
     //empty constructor
     public Movie(){
     
             this.genres = new ArrayList<>();
             this.languages = new ArrayList<>();
             this.cast = new ArrayList<>();
             this.crew = new ArrayList<>();
     
         
     }
 
     /**
      * Constructor for objects of class Movie
      */
     public Movie(String title,String releaseDate, String description, int duration,int rating)throws InvalidRatingException{
 
         // initialise instance variables
         this.title = title;
         this.releaseDate=releaseDate;
         this.description=description;
         this.duration = duration;
 
         //check if rating is below 5 or above 10, if it's below five, then rating is too low for movie to be considered
         if(rating<5){
             throw new InvalidRatingException("Invalid rating.Rating must be above average and equals to or less than 10");
 
         }
 
         this.rating=rating;
          this.genres = new ArrayList<>();
         this.languages = new ArrayList<>();
          this.cast = new ArrayList<>();
         this.crew = new ArrayList<>();
       
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
 public void addCast(Cast castMember) {
     cast.add(castMember);
 }
 
 public void addCrew(Crew crewMember) {
     crew.add(crewMember);
 }
 
  /**
      * this methods displays the Movie information
      */
     public void movieDetails(String title){
         System.out.println("Title of movie: " + title);
         System.out.println("Movie description: " + description);
         System.out.println("Duration: "+duration+" Minutes");
         System.out.println("Released: "+releaseDate);
     
        //iterate through the whole array of actrors and print them
         System.out.println("Cast: ");
         for(Cast currentStar:cast){
             System.out.print(currentStar.getName()+",");
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
 
 
 