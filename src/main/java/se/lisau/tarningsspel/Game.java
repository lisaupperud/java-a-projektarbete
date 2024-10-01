package se.lisau.tarningsspel;

import java.util.Scanner;

public class Game {
    public void playGame(){         // method for the game
        Scanner sc = new Scanner(System.in);

        Methods m = new Methods();          // object of Method-class / to be able to use the methods in the class

        String[] playerName = m.menu();         // get the player names from menu / saves in an array

        Player player1 = new Player(playerName[0]);         // creating to objects of Player-class
        Player player2 = new Player(playerName[1]);         // tillsätter sparade användarnamn till spelare

        System.out.println("Welcome " + playerName[0] + " and " + playerName[1]);


        while (true) {          // while-loop for the game

            int firstRollPlayer1 = m.rollDice(playerName[0]);           // saves the value of rolls in int / calls for method rollDice
            int firstRollPlayer2 = m.rollDice(playerName[1]);
            int secondRollPlayer1 = m.rollDice(playerName[0]);
            int secondRollPlayer2 = m.rollDice(playerName[1]);

            int sumPlayer1 = m.calculateSum(firstRollPlayer1, secondRollPlayer1);           // calculate sums of rolls for each player and saves in int
            int sumPlayer2 = m.calculateSum(firstRollPlayer2, secondRollPlayer2);


            if (sumPlayer1 > sumPlayer2) {          // if player1 sum is bigger than player2 sum
                System.out.println(player1.getUserName() + " won with " + sumPlayer1 + " points!");
                System.out.println(player2.getUserName() + " lost with " + sumPlayer2 + " points!");
                PlayAgain();

            } else if (sumPlayer1 < sumPlayer2) {           // else if player2 sum is bigger than player1 sum
                System.out.println(player2.getUserName() + " won with " + sumPlayer2 + " points!");
                System.out.println(player1.getUserName() + " lost with " + sumPlayer1 + " points!");
                PlayAgain();
            } else {            // if there is a tie
                System.out.println("It's a tie!");
                PlayAgain();
            }
            break;
        }
    }
    public void PlayAgain() {           // method for play again or exit
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Play again?");
        System.out.println("2. Exit");
        int choice = sc.nextInt();
        switch (choice) {           // depending on players answer / play again or exit
            case 1:         // calls for method playGame
                playGame();
                break;
            case 2:
                System.out.println("Thank you for playing!");
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
