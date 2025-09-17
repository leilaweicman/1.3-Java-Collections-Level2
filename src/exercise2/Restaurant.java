package exercise2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant name must not be null or empty");
        }
        if (score < 0) {
            throw new IllegalArgumentException("Score must be greater or equal to 0");
        }
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " (score: " + score + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant restaurant)) return false;
        return score == restaurant.score && name.equals(restaurant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(other.score, this.score);
    }
}
