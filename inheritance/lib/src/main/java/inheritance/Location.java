package inheritance;

import java.util.List;

public abstract class Location implements LocationInterface {
    public String name;
    public double stars;
    public List<Review> reviews;

    public void addReview(Review review) {
        if (!reviews.contains(review)) { // prevent duplicates
            // set limits 0-5
            if (review.stars > 5) {
                review.stars = 5;
            }else if(review.stars < 0){
                review.stars = 0;
            }

            reviews.add(review);

            // loop through to add the sum of stars
            int sum = 0;
            for (Review rev : reviews) {
                sum += rev.stars;
            }

            // calcuate the avg
            stars = sum / reviews.size();
        }
    }
}
