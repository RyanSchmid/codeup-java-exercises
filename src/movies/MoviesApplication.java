package movies;

import util.Input;

public class MoviesApplication {

    private static void displayMovies(String filter) {
        Movie[] all = MoviesArray.findAll();
        if (filter.equalsIgnoreCase("all")) {
            for (Movie movie : all) System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
        } else {
            for (Movie movie : all) {
                if (movie.getMovieCategory().equalsIgnoreCase(filter))
                    System.out.println(movie.getMovieName() + " -- " + movie.getMovieCategory());
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        while (true) {
            System.out.println("Enter your choice");
            Input input = new Input();
            int choice = input.getInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    displayMovies("all");
                    break;
                case 2:
                    displayMovies("animated");
                    break;
                case 3:
                    displayMovies("drama");
                    break;
                case 4:
                    displayMovies("horror");
                    break;
                case 5:
                    displayMovies("scifi");
                    break;
            }
        }

    }
}


//    Create a class named MoviesApplication that has a main method.

//    Give the user a list of options for viewing all the movies or viewing movies by category.

//    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)

//    If a category is selected, only movies from that category should be displayed.

//    Your application should continue to run until the user chooses to exit.

