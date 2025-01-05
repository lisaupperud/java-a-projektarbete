package se.lisau.tarningsspel;

public class Player {

    private final String userName;      // attribute
    private int score;

    public Player(String userName, int score) {            // constructor to be able to create objects
        this.userName = userName;
        this.score = score;
    }

    // getters
    public String getUserName() {
        return userName;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int additionalScore) {     // method to increase player score
        this.score += additionalScore;
    }

    @Override       // toString
    public String toString() {
        return userName;
    }
}
