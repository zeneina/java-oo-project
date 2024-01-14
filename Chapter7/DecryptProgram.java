package HomeWork.Chapter7;
import java.util.Scanner;

public class DecryptProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to decrypt: ");
        String input = scanner.nextLine();

        String decryptedString = decrypt(input);
        System.out.println("Decrypted string: " + decryptedString);
    }

    public static String decrypt(String input) {
        StringBuilder decrypted = new StringBuilder();

        for (char character : input.toCharArray()) {
            // Decrypt each character by replacing it with the previous ASCII character
            char decryptedChar = (char) (character - 1);
            decrypted.append(decryptedChar);
        }

        return decrypted.toString();
    }
}
