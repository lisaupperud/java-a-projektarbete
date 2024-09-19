package se.lisau.tarningsspel;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // hämtar spelarnamn från menyn
        String[] playerName = Methods.menu();

        // skapar objekt av Random-klassen
        Random random = new Random();

        // objekt av Scanner-klassen
        Scanner scan = new Scanner(System.in);

        //skapa två playerobjekt
        Player player1 = new Player(playerName[0]);
        Player player2 = new Player(playerName[1]);

        // variabler tärningskast
        int rollPlayer1;
        int rollPlayer2;

        System.out.println("Welcome " + playerName[0] + " and " + playerName[1]);

        System.out.println(playerName[0] + " begins!");
        System.out.println("Press ENTER to roll the dice, " + playerName[0]);
        scan.nextLine();
        rollPlayer1 = random.nextInt(6) + 1;
        System.out.println("Player 1 threw: " + rollPlayer1);
        int firstRollPlayer1 = rollPlayer1;

        System.out.println("Press ENTER to roll the dice, " + playerName[1]);
        scan.nextLine();
        rollPlayer2 = random.nextInt(6) + 1;
        System.out.println("Player 2 threw: " + rollPlayer2);
        int firstRollPlayer2 = rollPlayer2;

        System.out.println("Press ENTER to roll the dice again, " + playerName[0]);
        scan.nextLine();
        rollPlayer1 = random.nextInt(6) + 1;
        System.out.println("Player 1 threw: " + rollPlayer1);
        int secondRollPlayer1 = rollPlayer1;

        System.out.println("Press ENTER to roll the dice again, " + playerName[1]);
        scan.nextLine();
        rollPlayer2 = random.nextInt(6) + 1;
        System.out.println("Player 2 threw: " + rollPlayer2);
        int secondRollPlayer2 = rollPlayer2;

        // beräknar summan med calculateSum
        int sumPlayer1 = Methods.calculateSum(firstRollPlayer1, secondRollPlayer1);
        int sumPlayer2 = Methods.calculateSum(firstRollPlayer2, secondRollPlayer2);

        // if-sats
        // om av player1 är större än player2
        if (sumPlayer1 > sumPlayer2) {
            System.out.println(player1.getUserName() + " won with " +  sumPlayer1 + " points!");
        // annars om player 2 är större än player2
        } else if (sumPlayer1 < sumPlayer2) {
            System.out.println(player2.getUserName() + " won with " + sumPlayer2 + " points!");
        }
        else {
            System.out.println("It's a tie!");
        }
    }
}
