import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Movies movies = new Movies();
        //add new movie to movies array
        movies.addMovie(new Movie("Sniper", 2022, "war", 6.2));
        movies.addMovie(new Movie("Through My Window", 2022, "drama", 5.4));
        movies.addMovie(new Movie("The Green Mile", 1999, "fantasy/drama", 8.6));
        movies.addMovie(new Movie("Saving Private Ryan", 1998, "war", 8.6));
        movies.addMovie(new Movie("The Godfather", 1972, "crime", 9.2));
        movies.addMovie(new Movie("Inception", 2010, "action", 8.8));
        movies.addMovie(new Movie("Central Intelligence", 2016, "comedy", 6.3));
        movies.addMovie(new Movie("Seven Pounds", 2008, "drama", 7.6));
        //Part 2.2 user dialogue
        do {
            int number = getNumber();
            if (number == 1) {
                addingMovie(movies);
            } else if (number == 2) {
                printAllMovie(movies);
            } else if (number == 3) {
                sort(movies);
            } else if (number == 4) {
                findByTitle(movies);
            } else if (number == 5) {
                findByGenre(movies);
            } else if (number == 6) {
                findByYear(movies);
            } else {
                System.out.println("Please write a correct number from 1 to 6");
            }
        } while (isContinuing());
        System.out.println("Thank you for using movie database");
    }

    private static boolean isContinuing() {
        boolean continuing = true;
        System.out.println("Do you want to continue interacting with movie database? y/n");
        String answ = scan.nextLine();
        if (answ.equalsIgnoreCase("n")) {
            continuing = false;
        }
        return continuing;
    }

    private static void findByYear(Movies movies) {
        System.out.println("Please write year of release of movie that you want to find");
        int userYear = scan.nextInt();
        scan.nextLine();
        if (!movies.findByYearOfRelease(userYear)) {
            System.out.println("There is no movie that was released in " + userYear);
        }
    }

    private static void sort(Movies movies) {
        movies.sort();
        movies.printAllMovies();
    }

    private static void printAllMovie(Movies movies) {
        movies.printAllMovies();
    }

    private static void addingMovie(Movies movies) {
        boolean addingMovie = true;
        do {
            System.out.println("Please enter all information about film\n title: ");
            String userTitle = scan.nextLine();
            System.out.println("year of release: ");
            int userYearOfRelease = scan.nextInt();
            scan.nextLine();
            System.out.println("genre: ");
            String userGenre = scan.nextLine();
            System.out.println("rating: ");
            double userRating = scan.nextDouble();
            scan.nextLine();
            Movie userMovie = new Movie(userTitle, userYearOfRelease, userGenre, userRating);
            movies.addMovie(userMovie);
            System.out.println("You successfully add new movie to movie collection\n Do you want to add one more movie? y/n");
            String answ = scan.nextLine();
            if (answ.equalsIgnoreCase("n")) {
                addingMovie = false;
            }
        } while (addingMovie);
    }

    private static int getNumber() {
        System.out.println("""
                Welcome to the movie database!
                Choose an option to proceed:
                1 - add movies to collection
                2 - print all movies
                3 - sort movies by rating
                4 - search movie by title
                5 - search movie by genre
                6 - search movie by year of release""");
        int number = scan.nextInt();
        scan.nextLine();
        return number;
    }

    private static void findByTitle(Movies movies) {
        System.out.println("Please write title of movie that you want to find");
        String userTittle = scan.nextLine();
        movies.findByTittle(userTittle);
    }

    private static void findByGenre(Movies movies) {
        System.out.println("Please write genre of movie that you want to find");
        String userGenre = scan.nextLine();
        movies.findByGenre(userGenre);
    }
}