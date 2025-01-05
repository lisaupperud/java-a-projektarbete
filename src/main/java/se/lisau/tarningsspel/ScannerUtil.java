package se.lisau.tarningsspel;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner sc = new Scanner(System.in);

    private ScannerUtil() {

    }

    public static String getUserInput() {
        return sc.nextLine().toLowerCase();
    }

    public static int getIntInput() {
        return sc.nextInt();
    }

    public static void closeScanner() {
        sc.close();
    }

}
