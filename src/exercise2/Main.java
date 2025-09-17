package exercise2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("McDonalds", 8));
        restaurants.add(new Restaurant("McDonalds", 9));
        restaurants.add(new Restaurant("McDonalds", 7));
        restaurants.add(new Restaurant("Burger King", 7));
        restaurants.add(new Restaurant("Burger King", 5));

        System.out.println("Restaurants: " + restaurants);
    }
}
