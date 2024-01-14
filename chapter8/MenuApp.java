package HomeWork.chapter8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        try {
            int choice = getChoice();
            printChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid choice. Please choose a number between 1 and 5.");
        }
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                displayMenu();
                System.out.print("Enter your choice (1-5): ");
                int choice = scanner.nextInt();

                // Check if the choice is between 1 and 5
                if (choice < 1 || choice > 5) {
                    throw new IllegalArgumentException();
                }

                return choice;
            } catch (InputMismatchException e) {
                // User did not enter an integer
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            } catch (IllegalArgumentException e) {

                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
        }
    }

    public static void printChoice(int choice) {
        System.out.println("You chose option " + choice);
    }
}
