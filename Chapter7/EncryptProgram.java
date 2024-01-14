package HomeWork.Chapter7;
import java.util.Scanner;

public class EncryptProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to encrypt: ");
        String input = scanner.nextLine();

        String encryptedString = encrypt(input);
        System.out.println("Encrypted string: " + encryptedString);
    }

    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (char character : input.toCharArray()) {
            // Encrypt each character by replacing it with the next ASCII character
            char encryptedChar = (char) (character + 1);
            encrypted.append(encryptedChar);
        }

        return encrypted.toString();
    }
}
