# console-based-app
Fictional scenario, showcasing how  OOP elements come together in practice.

In the first week of our assignment, we were able to create our domain class, Movie.java. The class contains all the attributes of a movie like it's name, cast, directors, genres, the date it was released, it's description, languages and it's rating.

We have initialized an ArrayList of actors, staff, genres and languages since there can be more than one of these in one movie. Our class contains relevant setter methods and getter methods to set and return each of the attributes and use them whenever necessary.

Inside our class we have defined a void method movieDetails() that returns all the information about a movie.

In the coming week, we will create another class that implements an interface with methods that perform some certain functionalities like storing multiple movies, adding a movie to watchlist, sorting the movies by name or by rating, deleting a movie and more. 

Since we already created our custom exceptions, the class will implement them and throw them. For example, if the entered movie already exists, we throw our DuplicateMovieException.

We have created a class HorrorMovie that extends movie, this is a way of showing how inheritance can be shown.

