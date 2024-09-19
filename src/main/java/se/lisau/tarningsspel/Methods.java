package se.lisau.tarningsspel;

import java.util.Random;
import java.util.Scanner;

//klass för meny för att anropa menyn
public class Methods {

    // metod som retunerar spelarna
    public static String[] menu() {
        // skapar scanner-objekt
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi and welcome to the Dice Game!");
        System.out.println("This is a two-player game where the player with the highest score wins.");
        System.out.println("Please enter Player 1: ");
        String user1 = sc.nextLine();
        System.out.println("Please enter Player 2: ");
        String user2 = sc.nextLine();

        // metoden returnerar spelarnamn
        return new String[]{user1, user2};
    }
    // metod som beräknar summan av kasten
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    public static int rollDice(String playerName){
        // skapar objekt av Random och Scanner
        // för att kunna använda metoderna
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        // ber user att trycka ENTER för att spela
        System.out.println("Press ENTER to roll the dice, " + playerName);
        scan.nextLine();

        int roll = rand.nextInt(6) + 1;
        System.out.println(playerName + " threw: " + roll);
        return roll;
    }
}
