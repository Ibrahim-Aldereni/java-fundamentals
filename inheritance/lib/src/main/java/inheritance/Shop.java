package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Location {
    String desc;
    int dollarSigns;

    public Shop(String name, String desc, int dollarSigns) {
        this.name = name;
        this.desc = desc;
        this.dollarSigns = dollarSigns;
        this.reviews = new ArrayList<Review>();
    }

    @Override
    public String toString() {
        // covert dollarSigns to dollar signs
        String dollar = "";
        for (int i = 0; i < dollarSigns; i++) {
            dollar += "$";
        }
        return "Shop{" + "name='" + name + '\'' + ", stars=" + stars + ", dollarSigns=" + dollar + ", desc='" + desc + '\'' +  ", reviews=" + reviews + '}';
    }
}
