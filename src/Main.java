public class Main {
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
        System.out.println("====== Unsorted movies ======");
        movies.printAllMovies();
        System.out.println("====== Sorted movies by rating ======");
        movies.sort();
        movies.printAllMovies();
        System.out.println("====== Find movie by tittle ======");
        movies.findByTittle("Sniper");
        System.out.println("====== Find movie by year of release ======");
        movies.findByYearOfRelease(2022);
        System.out.println("====== Find movie by genre ======");
        movies.findByGenre("drama");
        System.out.println("====== Print one movie by index ======");
        movies.printMovie(5);

    }
}