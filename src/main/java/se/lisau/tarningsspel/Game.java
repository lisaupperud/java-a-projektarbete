package se.lisau.tarningsspel;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // hämtar spelarnamn från menyn
        String[] playerName = Methods.menu();

        //skapa två player objekt
        // lägger till namnen i playerName arrayen
        Player player1 = new Player(playerName[0]);
        Player player2 = new Player(playerName[1]);

        // välkomnar spelarna
        System.out.println("Welcome " + playerName[0] + " and " + playerName[1]);

        System.out.println("Utanför while");
        while (true) {
            System.out.println("Innanför while");
            // sparar värdet av kasten i int
            // kallar på metoden rollDice
            int firstRollPlayer1 = Methods.rollDice(playerName[0]);
            int firstRollPlayer2 = Methods.rollDice(playerName[1]);
            int secondRollPlayer1 = Methods.rollDice(playerName[0]);
            int secondRollPlayer2 = Methods.rollDice(playerName[1]);

            // beräknar summan med calculateSum
            int sumPlayer1 = Methods.calculateSum(firstRollPlayer1, secondRollPlayer1);
            int sumPlayer2 = Methods.calculateSum(firstRollPlayer2, secondRollPlayer2);

            // if-sats
            // om av player1 är större än player2
            if (sumPlayer1 > sumPlayer2) {
                System.out.println(player1.getUserName() + " won with " + sumPlayer1 + " points!");
                System.out.println(player2.getUserName() + " lost with " + sumPlayer2 + " points!");

                // annars om player 2 är större än player2
            } else if (sumPlayer1 < sumPlayer2) {
                System.out.println(player2.getUserName() + " won with " + sumPlayer2 + " points!");
                System.out.println(player1.getUserName() + " lost with " + sumPlayer1 + " points!");

            } else {
                System.out.println("It's a tie!");
            }
        }
    }
}
