//For your collection create:
//
//private property count to store number of elements.
//private array to store objects.
//add(newObj) method to add new items.
//printOne(int i) method to print detailed information about an item and print() method to print whole list of objects.
//find(String s) method to search and print elements. Use corresponding string field of item to perform search.
//sort() method to perform bubble sort of elements on the base of numeric property of the items.
//other method for search objects by additional properties (such as year or another string properties or both simultaneously).
public class Movies {
    private Movie[] movies;
    private int count;

    public Movies() {
        movies = new Movie[100];
        count = 0;
    }

    //add method to add new items
    public void addMovie(Movie m) {
        movies[count] = m;
        count++;
    }

    // print method to print one movie by index
    public void printMovie(int i) {
        movies[i].printDetails();
    }

    // print method to print all movies
    public void printAllMovies() {
        for (int i = 0; i < count; i++) {
            printMovie(i);
        }
    }

    // find method to find movie by tittle
    public void findByTittle(String tittle) {
        for (int i = 0; i < count; i++) {
            if (movies[i].title.contains(tittle)) {
                printMovie(i);
            }
        }
    }

    // find method to find movie by genre
    public void findByGenre(String genre) {
        for (int i = 0; i < count; i++) {
            if (movies[i].genre.contains(genre)) {
                printMovie(i);
            }
        }
    }

    // find method to find movie by year of release
    public void findByYearOfRelease(int year) {
        for (int i = 0; i < count; i++) {
            if (movies[i].yearOfRelease == year) {
                printMovie(i);
            }
        }
    }

    // sort method to sort movies by rating
    public void sort() {
        boolean swapped = true;
        int n = count - 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n; i++) {
                if (movies[i].filmRating > movies[i + 1].filmRating) {
                    swapped = true;
                    Movie temp = movies[i];
                    movies[i] = movies[i + 1];
                    movies[i + 1] = temp;
                }
            }
            n--;
        }
    }
}
