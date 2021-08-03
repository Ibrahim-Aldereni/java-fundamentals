package inheritance;

public class MovieReview extends Review{
    String movieSeen;

    public MovieReview(String author, String body, int stars, String movieSeen) {
        super(author, body, stars);
        this.movieSeen = movieSeen;
    }

    @Override
    public String toString() {
        return "Review{" + "movieSeen='" + movieSeen + '\'' + ", author='" + author + '\'' + ", body='" + body + '\'' + ", stars=" + stars + '}';
    }
}


