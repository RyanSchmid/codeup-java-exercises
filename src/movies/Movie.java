package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String movieCategory) {
            this.name = movieName;
            this.category = movieCategory;
        }

    // ### GETTERS ### //
    public String getMovieName(){
        return name;
    }

    public String getMovieCategory(){
        return category;
    }

    // ### SETTERS ### //

    public void setMovieName(String newName){
        this.name = newName;
    }

    public void setMovieCategory(String newCategory){
        this.category = newCategory;
    }

    public static void main(String[] args) {

    }


//     Create a class named Movie.
//     It should have private fields for name and category,
//     and a constructor that sets both of these.
//     Create methods to access these properties and
//     change them (getters and setters).



 }
