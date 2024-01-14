package HomeWork.chapter3;

import java.util.Scanner;

/**
 * Θέλουμε ένα συστημα να αποφαίνεται αν το έτος είναι δισεκτο ή όχι
 * Αν οι μέρες είναι >365 τότε το έτος είναι δίσεκτο
 * Ένα έτος θεωρείται δίσεκτο αν
 * 1) διαιρείται ακριβώς με το 4 αλλα όχι με το 100
 * 2) διαιρείται ακριβώς με το 400
 * 3) αν διαιρείται και με το 4 και με το 100 και με το 400
 */

public class LeapYearsApp {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int year = 0;
    boolean isLeap=false;

    System.out.println("The Year is Leap;");
    isLeap= scanner.nextBoolean();

        if ((year % 400 != 0) && ((year % 4 != 0) || (year % 100 == 0))) {
            System.out.println("Το έτος είναι δίσεκτο!");
            isLeap = true;
        }

         isLeap = ((year % 400 != 0) && ((year % 4 != 0) || (year % 100 == 0)));

        System.out.println("Year: " + year + " is leap: " + isLeap);

}
}
