package exercise1;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant name must not be null or empty");
        }
        if (score <= 0) {
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
}
