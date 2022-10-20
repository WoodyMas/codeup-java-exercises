package Movies;
import util.Input;

public class MoviesApplication {
    public static void getAllMoviesFromCategory(String category, Movie[] movies){
        for (Movie mov: movies){
//            String category = mov.getCategory();
            String name = mov.getName();
            if (category.equals(mov.getCategory())){
                System.out.printf("%s -- %s%n", name, category);
            }
        }
    }

    public static Movie[] addMovie(Movie newMovie, Movie[] movies){
        Movie[] varA;
        varA = new Movie[movies.length+1];
        for (int i = 0; i < movies.length; i++){
            varA[i] = movies[i];
        }
        varA[varA.length-1] = newMovie;

        return varA;
    }

    public static void main(String[] args) {
        Input input = new Input();
        Movie[] movies = MoviesArray.findAll();
        String userChoice = "";

        while(!userChoice.equals("0")){
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println("6 - add a movie to the list");

            userChoice = input.getString("Enter your choice: ");

            switch (userChoice){
                case "0":
                    break;
                case "1": // view all movies
                    for (Movie mov: movies) {
                        String name = mov.getName();
                        String category = mov.getCategory();
                        System.out.printf("%s -- %s%n", name, category);
                    }
                    break;
                case "2": // view movies in the animated category
                    for (Movie mov: movies){
                        String category = mov.getCategory();
                        String name = mov.getName();
                        if (category.equalsIgnoreCase("animated")){
                            System.out.printf("%s -- %s%n", name, category);
                        }
                    }
                    break;
                case "3": // view movies in the drama category
                    getAllMoviesFromCategory("drama", movies);
                    break;
                case "4": // view movies in the horror category
                    getAllMoviesFromCategory("horror", movies);
                    break;
                case "5": // view movies in the sci-fi category
                    getAllMoviesFromCategory("scifi", movies);
                    break;
                case "6": // add a movie to the list
                    String title = input.getString("Enter the name of the movie:");
                    String category = input.getString("Enter the category of the movie");
                    Movie newMovie = new Movie(title, category);
                    movies = addMovie(newMovie, movies);
                    break;
                default:
                    System.out.println("Be BETTER! FOLLOW DIRECTIONS!");
                    break;

            }
        }
    }
}
