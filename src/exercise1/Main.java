package exercise1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Restaurant> restaurants = new HashSet<>();

        // Same name and score -> Will add just one
        restaurants.add(new Restaurant("McDonalds", 8));
        restaurants.add(new Restaurant("McDonalds", 8));

        // Same name, different score -> will add it
        restaurants.add(new Restaurant("McDonalds", 9));

        // Different restaurant -> will add it
        restaurants.add(new Restaurant("Burger King", 7));

        System.out.println("Restaurants: " + restaurants);
    }
}
