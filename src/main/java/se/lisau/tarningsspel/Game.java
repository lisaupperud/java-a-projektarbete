package se.lisau.tarningsspel;

import java.util.Random;


public class Game { // class which contains game logic
    private Player player1;
    private Player player2;
    private final Random random = new Random();
    private boolean gameDone = false;       // to break while-loop

    public Game() {
        // to start game
    }

    private void startMessage() {        // contains start message
        System.out.println("Hi and welcome to the Dice Game!");
        System.out.println("This is a two-player game where the player with the highest score wins.");
        System.out.println("Please enter Player 1: ");
        String userName1 = ScannerUtil.getUserInput();
        this.player1 = new Player(userName1, 0);    // create player1
        System.out.println("Please enter Player 2: ");
        String userName2 = ScannerUtil.getUserInput();
        this.player2 = new Player(userName2, 0);    // create player2

    }

    private void rollDice(Player player) {         // method for rolling dice

        System.out.println("Press ENTER to roll the dice, " + player);
        ScannerUtil.getUserInput();

        int roll = random.nextInt(6) + 1;         // random number
        System.out.println(player + " threw: " + roll);
        player.addScore(roll);       // update player score
        System.out.println(player + " score: " + player.getScore());
    }

    public void playGame() {         // method for the game
        startMessage();

        System.out.println("Welcome " + player1 + " and " + player2);
        System.out.println("Let's play!");

        while (!gameDone) {      // while-loop for the game

            rollDice(player1);
            rollDice(player2);
            rollDice(player1);
            rollDice(player2);
            determineWinner();

        }

    }

    private void determineWinner() {        // determines winner
        if (player1.getScore() > player2.getScore()) {          // if player1 sum is bigger than player2 sum
            System.out.println(player1.getUserName() + " won with " + player1.getScore() + " points!");
            System.out.println(player2.getUserName() + " lost with " + player2.getScore() + " points!");
            PlayAgain();

        } else if (player2.getScore() > player1.getScore()) {           // else if player2 sum is bigger than player1 sum
            System.out.println(player2.getUserName() + " won with " + player2.getScore() + " points!");
            System.out.println(player1.getUserName() + " lost with " + player1.getScore() + " points!");
            PlayAgain();
        } else {            // if there is a tie
            System.out.println("It's a tie!");
            PlayAgain();
        }
    }

    private void PlayAgain() {           // method for play again or exit
        System.out.println("1. Play again?");
        System.out.println("2. Exit");
        int choice = ScannerUtil.getIntInput();
        switch (choice) {
            case 1 -> playGame();       // if choice = 1 --> play game again
            case 2 -> gameDone = true;      // if choice = 2 --> exit program
            default -> System.out.println("Invalid choice");

        }
    }

}
