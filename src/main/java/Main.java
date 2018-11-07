public class Main {

    public static void main(String[] args) {

        MovieFactory movies = new MovieFactory("resources/movies.xml");
        //movies.printAllMovieNames();

        movies.genreCheck();

    }
}
