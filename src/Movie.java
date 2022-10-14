public class Movie {
    public String title;
    public String genre;
    public int yearOfRelease;
    public double filmRating;

    public Movie(String title, int yearOfRelease, String genre, double filmRating) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.filmRating = filmRating;
    }

    public void printDetails() {
        System.out.println("Title: " + title
                + ", genre: " + genre
                + ", year of release: " + yearOfRelease
                + ", rating of this movie: " + filmRating + "/10"
        );
    }
}
