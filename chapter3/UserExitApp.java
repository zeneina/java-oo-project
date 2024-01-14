package HomeWork.chapter3;

import java.util.Scanner;

/**
 * εμφανίζει ένα μενού μέχρι ο
 * χρήστης να δώσει τον αριθμό 5
 */
public class UserExitApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1. Εισαγωγή Χρήστη");
            System.out.println("2. Διαγραφή Χρήστη");
            System.out.println("3. Ένημέρωση Χρήστη");
            System.out.println("4. Αναζήτηση Χρήστη");
            System.out.println("5. Έξοδος Χρήστη");

            choice = scanner.nextInt();


            if (choice <= 0 || choice >= 5) {
                System.out.println("Λάθος επιλογή");
                continue;
            }if (choice == 1) {
                System.out.println("εισαγωγή χρήστη");
                break;
            }if (choice == 2) {
                System.out.println("Διαγραφή χρήστη");
                break;
            }if (choice == 3) {
                System.out.println("Ενημέρωση χρήστη");
                break;
            }if (choice == 4) {
                System.out.println("Αναζήτηση χρήστη");
        }else { // choice == 5
                System.out.println("έξοδος");}

        } while (choice != 5);

        System.out.println("Goodbye");
    }
}






















