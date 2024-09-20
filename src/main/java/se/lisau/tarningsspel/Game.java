package se.lisau.tarningsspel;

import java.util.Scanner;

public class Game {
    public void Game(){

        Scanner sc = new Scanner(System.in);
        Methods m = new Methods();
        // hämtar spelarnamn från menyn
        String[] playerName = m.menu();

        //skapa två player objekt
        // lägger till namnen i playerName arrayen
        Player player1 = new Player(playerName[0]);
        Player player2 = new Player(playerName[1]);

        // välkomnar spelarna
        System.out.println("Welcome " + playerName[0] + " and " + playerName[1]);

        while (true) {

            // sparar värdet av kasten i int
            // kallar på metoden rollDice
            int firstRollPlayer1 = m.rollDice(playerName[0]);
            int firstRollPlayer2 = m.rollDice(playerName[1]);
            int secondRollPlayer1 = m.rollDice(playerName[0]);
            int secondRollPlayer2 = m.rollDice(playerName[1]);

            // beräknar summan med calculateSum
            int sumPlayer1 = m.calculateSum(firstRollPlayer1, secondRollPlayer1);
            int sumPlayer2 = m.calculateSum(firstRollPlayer2, secondRollPlayer2);

            // if-sats
            // om av player1 är större än player2
            if (sumPlayer1 > sumPlayer2) {
                System.out.println(player1.getUserName() + " won with " + sumPlayer1 + " points!");
                System.out.println(player2.getUserName() + " lost with " + sumPlayer2 + " points!");
                PlayAgain();

                // annars om player 2 är större än player2
            } else if (sumPlayer1 < sumPlayer2) {
                System.out.println(player2.getUserName() + " won with " + sumPlayer2 + " points!");
                System.out.println(player1.getUserName() + " lost with " + sumPlayer1 + " points!");
                PlayAgain();

            } else {
                System.out.println("It's a tie!");
                PlayAgain();
            }
            break;
        }
    }
    public void PlayAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Play again?");
        System.out.println("2. Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Game();
                break;
            case 2:
                System.out.println("Thank you for playing!");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
