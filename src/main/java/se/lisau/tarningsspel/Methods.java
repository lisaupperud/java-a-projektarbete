package se.lisau.tarningsspel;

import java.util.Random;
import java.util.Scanner;

public class Methods {          // class which contains methods


    public String[] menu() {        // method that contains menu and returns player names

        Scanner sc = new Scanner(System.in);            // initialising Scanner object

        // menu
        System.out.println("Hi and welcome to the Dice Game!");
        System.out.println("This is a two-player game where the player with the highest score wins.");
        System.out.println("Please enter Player 1: ");
        String userName1 = sc.nextLine();
        System.out.println("Please enter Player 2: ");
        String userName2 = sc.nextLine();

        return new String[]{userName1, userName2};
    }
    public int calculateSum(int a, int b) {         // method to calculate the sum of throws
        return a + b;
    }
    public int rollDice(String playerName){         // method for rolling dice
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Press ENTER to roll the dice, " + playerName);          // asking the player to press enter to roll
        scan.nextLine();

        int roll = rand.nextInt(6) + 1;
        System.out.println(playerName + " threw: " + roll);
        return roll;
    }
}
