package movies;
//import java.util.*;
import util.Input;


public class MoviesApplication {

    private static void getMovies(String genre){
        Movie[] movies = MoviesArray.findAll();
        if(genre.equals("all")){
            for(int i = 0; i<movies.length; i++)
                System.out.println(movies[i].getName() + "  ||  " + movies[i].getCategory());

        } else {
            for(Movie movie: movies){
                if(movie.getCategory().equals(genre))
                    System.out.println(movie.getName() + "  ||  " + movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        Input in = new Input();
        Boolean answer;

        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n" +
                    "1 - list all movies\n" +
                    "2 - list animated movies\n" +
                    "3 - list dramas\n" +
                    "4 - list horror movies\n" +
                    "5 - list SciFi Movies\n" +
                    "6 - list musicals\n");
            System.out.println("Enter your choice: ");
            int input = in.getInt();


            switch (input) {
                case 1: //all
                    getMovies("all");
                    break;
                case 2: //animated
                    getMovies("animated");
                    break;
                case 3: //drama
                    getMovies("drama");
                    break;
                case 4: //horror
                    getMovies("horror");
                    break;
                case 5: //scifi
                    getMovies("scifi");
                    break;
                case 6: //music
                    getMovies("musical");
            }

            System.out.println("\nSearch again?");
            answer = in.yesNo();
        }while(answer);

        System.out.println("Ending Application");
    }

}
