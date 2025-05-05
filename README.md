# console-based-app
Fictional scenario, showcasing how  OOP elements come together in practice.

In the first week of our assignment, we were able to create our domain class, Movie.java. The class contains all the attributes of a movie like it's name, cast, directors, genres, the date it was released, it's description, languages and it's rating.

We have initialized an ArrayList of actors, staff, genres and languages since there can be more than one of these in one movie. Our class contains relevant setter methods and getter methods to set and return each of the attributes and use them whenever necessary.

Inside our class we have defined a void method movieDetails() that returns all the information about a movie.

In the coming week, we will create another class that implements an interface with methods that perform some certain functionalities like storing multiple movies, adding a movie to watchlist, sorting the movies by name or by rating, deleting a movie and more. 

Since we already created our custom exceptions, the class will implement them and throw them. For example, if the entered movie already exists, we throw our DuplicateMovieException.

We have created a class HorrorMovie that extends movie, this is a way of showing how inheritance can be shown.




As week 2 of our Assignment comes to end, this is what we were able to achieve. We created an interface with our methods that throw relevant exceptions.
i.The addMovie (Movie movie)method throws a DuplicateMovieException each time you enter a movie with a name that already exists.
ii. searchMovie(String title) takes a title of the movie as parameter and compares the name to each of the movies available and throws a MovieNotFoundException if there does not exist a movie with a name that matches the title.
iii. displayMovies() is a void method that prints a movie and the year it was released.
iv. deleteMovie(Movie movie)  method makes use  of the search method and throws MovieNotFoundException whenever a movie does not exist in the list.

We then created a class called MovieUtility.java that implements the interface .

We finally created a SortAndSearch class  that sorts movies by rating, from highest rated to lowest rated. It also sorts movies by name but this is a feature only available to admin since we were tasked to sort with numericals.

A linearSearch and binarySearch methods were created to return a movie, given some conditions. In the coming week we will see how each of these come together in the main method and see how it will interact with the user.



Week 3
Overview

The MovieApp class serves as the core of a movie database simulation, allowing users to add, search, update, delete, sort, and view movies. It features an interactive menu-driven console application where users make selections based on numbered options.
Additionally, if the program is launched with the "admin" argument, Admin Mode is enabled, unlocking extra functionality.


The MovieApp class is designed to simulate a movie database, allowing users to interact with the system through a console-based menu. At the start of execution, the program checks if an admin argument has been provided, enabling a special mode with additional functionality. It then initializes various objects, including a list to store movies and utility classes for handling operations such as adding, updating, searching, and sorting movies. A Scanner object is used to gather user input throughout the program. The main menu is displayed within a do-while loop, prompting users to select an option. Depending on the choice entered, the program either adds a movie to the watchlist, searches for a movie by title, updates movie details, deletes a movie, sorts the movie list, or displays all available movies. If the user is in admin mode, an extra feature for displaying detailed movie information is provided. The process of adding a movie includes collecting several attributes such as title, release date, description, duration, rating, genres, languages, crew members, and actors. Each input is carefully handled to avoid skipping issues, with proper use of nextLine() after numerical inputs to consume leftover newline characters. 


The program also incorporates exception handling to manage errors gracefully, catching cases such as missing movies, duplicate entries, or invalid ratings. The loop continues to execute until the user selects the exit option, ensuring all resources are closed properly before termination. This design allows for seamless interaction, efficient data management, and a structured approach to handling movie-related operations in a simulated database environment.






