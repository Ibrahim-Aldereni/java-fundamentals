package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public int stars;
    public int priceCategory; // if 3 then show 3 $$$
    public List<Review> reviews;

    // constructor
    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<Review>();
    }

    public void addReview(Review review) {
       if(!reviews.contains(review)){ // prevent duplicates
           stars += review.stars;
           reviews.add(review);
       }
    }

    @Override
    public String toString() {
        // covert priceCategory to dollar signs
        String dollar = "";
        for (int i = 0; i < priceCategory; i++) {
            dollar += "$";
        }

        return "Restaurant{" + "name='" + name + '\'' + ", stars=" + stars + ", priceCategory=" + dollar + ", " +
                "reviews=" + reviews + '}';
    }


}
