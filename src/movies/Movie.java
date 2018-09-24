package movies;

public class Movie {
    String title;
    String category;

    public Movie(String movieName, String movieCategory) {
            this.title = movieName;
            this.category = movieCategory;
        }
    }

    // ### GETTERS ### //
    public getMovieName(){
        return title;
    }

    public getMovieCategory(){
        return category;
    }

    // ### SETTERS ### //

    public setMovieName(String newName){
        this.title = newName;
    }

    public setMovieCategory(String newCategory){
        this.category = newCategory;
    }

    public static void main(String[] args) {

    }


    // Create a class named Movie.
    // It should have private fields for name and category,
    // and a constructor that sets both of these.
    // Create methods to access these properties and
    // change them (getters and setters).



}
