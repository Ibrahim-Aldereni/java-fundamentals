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


