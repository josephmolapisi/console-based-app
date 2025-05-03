/**
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class MovieApp{
    public static void main(String[] args){
        ArrayList<Movie>movies=new ArrayList<>();
        
        MovieUtility simulation= new MovieUtility();
        Movie myMovie=new Movie();
        MovieApp myApp=new MovieApp();
        SortAndSearch ss= new SortAndSearch();

        boolean isAdmin = false;
        if(args.length>0 && args[0].equalsIgnoreCase("admin")){
            isAdmin=true;

            System.out.println("******You are viewing this in Admin mode******");

        }

        Scanner sc=new Scanner(System.in);
        int choice;
        try{
            do{
                //Display the user menu 
                System.out.println("=====MOVIE DATABASE SIMULATION MENU=====");
                System.out.println("1.Add movie to watchlist");// this feature adds a new movie to the database
                System.out.println("2.Search movie");//allow the user to search for a movie by title
                System.out.println("3.Update Movie Details");//this feature edits existing information about the movie
                System.out.println("4.Delete a Movie");//remove a movie from the list
                System.out.println("5.Sort movies");//sort movies by name or rating
                System.out.println("6.View all movies");//display the entire list of movies
                
                System.out.println("7.Exit");
                System.out.println("========================================");
                if(isAdmin){
                    //a feature only accessible in adminmode
                    System.out.println("8.Show movie details");

                }

                System.out.println("Choose option: ");
                choice=sc.nextInt();
                sc.nextLine();

                switch(choice){

                    case 1:
                    System.out.println("You chose to add a movie to your watchlist.Add all the inforamtion about the movie to proceed.");
    
                    System.out.println("Enter the title of the movie");
                    String movieName=sc.nextLine();
                   
               

                    System.out.println("Enter the date of release of the movie in the form 2025-04-20");
                    String dateReleased=sc.nextLine();
                   

                    System.out.println("Write a brief description of what the movie is about.");
                    String description=sc.nextLine();
                  

                    System.out.println("Enter duration of the movie, in minutes.");
                    int duration=sc.nextInt();

                    System.out.println("Enter the rating of the movie.");
                    int rating=sc.nextInt();

                    Movie newMovie= new Movie(movieName, dateReleased, description, duration, rating);


                    //this block of code allows the user to enter number of genres in the movie by utilising the while loop
                    System.out.println("Enter the number of genres in your movie");
                    int genreCount=sc.nextInt();
                    sc.nextLine();

                    int i=1;
                   
                    while(i<=genreCount){
                        System.out.println("Enter genre");
                        String newMovieGenre=sc.next();
                        newMovie.addGenre(newMovieGenre);

                        i++;
                       

                    }
                    System.out.println("Genres successfully added");

                    //this block of code is for the languages in the movie
                    System.out.println("Enter the number of languages in the movie");
                    int languageCount=sc.nextInt();

                    int j=1;
                  
                    while(j<=languageCount){
                        System.out.println("Enter language");
                        String movieLanguage=sc.next();
                        newMovie.addLanguage(movieLanguage);
                        j++;
                        

                    }
                    System.out.println("Languages successfully added.");

                    //this block of code allows the user to add the staff ot the movie eg, Director,Producer, etc of the movie

                    System.out.println("Enter the number of crew in the movie");
                    int staffCounter=sc.nextInt();

                    int m=1;
                   
                    while(m<=staffCounter){
                        System.out.println("Enter crew member's name");
                        String crewMemberName=sc.next();
                        System.out.println("Enter crew member's role");
                        String crewMemberRole=sc.next();

                        Crew member=new Crew(crewMemberName,crewMemberRole);
                        newMovie.addCrew(member);
                        m++;

                    }
                    System.out.println("Crew members successfully added.");

                    //this block of codes adds actors to the movie
                    System.out.println("Enter the number of actors in the movie");
                    int actorsCount=sc.nextInt();
                    sc.nextLine();

                    int n=1;
                  
                    while(n<=actorsCount){
                        System.out.println("Enter actor's name");
                        String actorName=sc.nextLine();
                        Cast actor= new Cast(actorName);
                        newMovie.addCast(actor);


                        
                        n++;

                    }
                    System.out.println("Cast successfully added.");

                    simulation.addMovie(newMovie);
                    movies.add(newMovie);
                    System.out.println("Movie successfully added.");


                    break;

                    case 2:

                    System.out.println("Search for a movie:");
                    String movieSearched=sc.next();

                    Movie foundMovie=ss.linearSearch(movies,movieSearched);
                    foundMovie.movieDetails(movieSearched);
                    break;

                    case 3:

                    System.out.println("Enter details of a movie to update");

                    System.out.println("1.Title of the movie");
                    String tempMovie=sc.nextLine();

                    System.out.println("2.Release Date");
                    String dateOfRelease=sc.nextLine();

                    System.out.println("3.Description");
                    String descrptn=sc.nextLine();

                    System.out.println("4..Duration");
                    int movieLength=sc.nextInt();

                    System.out.println("5.Rating");
                    int movieRating=sc.nextInt();

                    Movie updatesMovie=new Movie(tempMovie, dateOfRelease, descrptn, movieLength, movieRating);

                    simulation.updateMovieDetails(updatesMovie);

                    break;

                    case 4:
                    System.out.println();
                    System.out.println("Enter the name of the movie u want to remove: ");
                    String movieToRemove=sc.next();

                    simulation.deleteMovie(movieToRemove);
                    //movies.remove(movieToRemove);
                    System.out.println(movieToRemove+ " has been removed from Watchlist.");
                    break;

                    case 5:
                    
                    ss.sortMoviesByRating(movies);
                    System.out.println("Movies successfully sorted from highest rated to lowest rated.!!!");

                    break;

                    case 6:
                    if(movies.isEmpty()){
                        System.out.println("There is nothing in the watchlist");

                    }
                    else{
                    
                    simulation.displayMovies();
                    }

                    break;
                    case 7:
                    System.out.println("Exiting application...");
                    break;

                    case 8:
                    if(isAdmin){
                        ss.sortMoviesByName(movies);
                        simulation.displayMovies();


                        


                    }
                    break;
                    default:

                    System.out.println("Invalid option. Please select one of the above options!!!.");

                }



            }
            while(choice!=7);
            sc.close();
            System.out.println("MOVIE DATABASE SIMULATION MENU CLOSED. Have a great day!");


        }
        catch (MovieNotFoundException e) {
            System.out.println("Error: " + e.getMessage()); // Handle the exception gracefully
            
        }
        catch (DuplicateMovieException e) {
            System.out.println("Error: " + e.getMessage()); // Handle the exception gracefully
            
        }
        catch (InvalidRatingException e) {
            System.out.println("Error: " + e.getMessage()); // Handle the exception gracefully
            
        }
    
    
    



    }

}