package gr.aueb.cf.HomeWork.chapter5;

import java.util.Scanner;

/**
 * Θέλουμε ένα σύστημα που ο χρήστης θα δίνει
 * Τον (n) αριθμό για αστεράκια
 * Το πρόγραμμα θα πρέπει να τρέχει μέχρι ο
 * χρήστης να επιλέξει την Επιλογή 6
 */

public class StarApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;
        int n = '*';
        int choice = 0;


        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.print("1.n Αστεράκια οριζόντια");
        System.out.print("2.n Αστεράκια κάθετα");
        System.out.println("3. n Γραμμές με Αστεράκια");
        System.out.println("4. 1-n Γραμμές Αστεράκια");
        System.out.println("5. n-1 Γραμμές Αστεράκια");
        System.out.println("6. Έξοδος απο το πρόγραμμα");
        System.out.println("Δώσε επιλογή: ");


        if (choice < 1 || choice > 6) {
            System.out.print("Λάθος επιλογή");
        }
        if (choice == 6) {
            System.out.print("Έξοδος");
        }


        switch (choice) {
            case 1:
                System.out.println("Επιλέξτε ένα από τα παρακάτω");
                break;
            case 2:
                System.out.print("1.n Αστεράκια οριζόντια");
                break;
            case 3: System.out.print("2.n Αστεράκια κάθετα");
                    break;
            case 4: System.out.println("3. n Γραμμές με Αστεράκια");
                    break;
            case 5:  System.out.println("4. 1-n Γραμμές Αστεράκια");
                    break;
            case 6:  System.out.println("5. n-1 Γραμμές Αστεράκια");
                    break;
            case 7:System.out.println("6. Έξοδος απο το πρόγραμμα");
                     break;
            default:
                System.out.println("Δώσε επιλογή: ");
                break;

        } while (choice != 6);
    }
    public static void printMenu() {


        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println();
        System.out.println("1. Οριζόντια Αστεράκια");
        System.out.println("2. Κάθετα Αστεράκια");
        System.out.println("3. nxm Αστεράκια");
        System.out.println("4. Ascending Αστεράκια");
        System.out.println("5. Descending Αστεράκια");
        System.out.println("6. Έξοδος");
}
public static void printStarsVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }

    public static void printStarsHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println();;
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println();
            ;
        }

        System.out.println("Thanks for using");
    }

}













