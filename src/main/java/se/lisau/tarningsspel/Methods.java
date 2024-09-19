package se.lisau.tarningsspel;
import java.util.Scanner;

//klass för meny för att anropa menyn
public class Methods {

    // metod som retunerar spelarna
    public static String[] menu(){
        // skapar scanner-objekt
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi and welcome to the Dice Game!");
        System.out.println("This is a two-player game where the player with the highest score wins.");
        System.out.println("Please enter the Player 1: ");
        String user1 = sc.nextLine();
        System.out.println("Please enter the Player 2: ");
        String user2 = sc.nextLine();

        // metoden returnerar spelarnamn
        return new String[] {user1, user2};
    }

    public static int calculateSum(int a, int b){
        return a + b;
    }
}
