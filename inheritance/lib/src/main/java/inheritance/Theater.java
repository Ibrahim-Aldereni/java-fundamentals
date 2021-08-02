package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Location {
    List<String> movies;

    public Theater(String name) {
        this.name = name;
        this.reviews = new ArrayList<Review>();
        this.movies = new ArrayList<String>();
    }

    /*
    --  addReview now have polymorphism, here I have 2 implementations of it, one from the parent with one parameter
        and the other here with 2 parameters.
    -- You may ask how can I use (MovieReview) instance as parameter when I should use (Review) parameter?
       I did that by making the (MovieReview) extends the (Review), so (MovieReview) is a child of (Review) and the
       default parameter is the parent(Review) so the child can be used as well.
    */
    public void addReview(MovieReview review ,String movieSeen) {
        if(!reviews.contains(review)){ // prevent duplicates
            stars += review.stars;
            review.movieSeen= movieSeen;
            reviews.add(review);
        }
    }

    //addMovie and removeMovie
    public void addMovie(String movie){
        movies.add(movie);
    }

    public void removeMovie(String movie){
        movies.remove(movie);
    }

    @Override
    public String toString() {
        return "Theater{" + "name='" + name + '\'' + ", stars=" + stars + ", reviews=" + reviews + ", movies=" + movies + '}';
    }
}
