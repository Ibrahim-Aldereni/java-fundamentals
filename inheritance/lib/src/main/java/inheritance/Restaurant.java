package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Location{
    public int priceCategory;

    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<Review>();
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
