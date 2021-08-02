package inheritance;

public class MovieReview extends Review{
    String movieSeen;

    public MovieReview(String author, String body, int stars) {
        super(author, body, stars);
    }

    @Override
    public String toString() {
        return "Review{" + "movieSeen='" + movieSeen + '\'' + ", author='" + author + '\'' + ", body='" + body + '\'' + ", stars=" + stars + '}';
    }
}


