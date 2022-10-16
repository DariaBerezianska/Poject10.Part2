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
    public boolean findByYearOfRelease(int year) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (movies[i].yearOfRelease == year) {
                printMovie(i);
                found = true;
            }
        }
        return found;
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
