package inheritance;

import java.util.List;

public abstract class Location implements LocationInterface{
    public String name;
    public int stars;
    public List<Review> reviews;

    public void addReview(Review review) {
        if(!reviews.contains(review)){ // prevent duplicates
            stars += review.stars;
            reviews.add(review);
        }
    }

}
