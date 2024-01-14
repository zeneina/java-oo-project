package HomeWork.chapter9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {


        try (Scanner scanner = new Scanner(System.in);
             PrintWriter primOutWriter = new PrintWriter(new FileWriter("C:\\tmp\\log.txt", true));

             PrintWriter logWriter = new PrintWriter(new FileWriter("C:\\tmp\\log.txt", true))) {

            while (true) {
                // Εισαγωγή στοιχείων μαθητή
                System.out.print("Εισάγετε το όνομα του μαθητή (ή exit για έξοδο): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Εισάγετε το επώνυμο του μαθητή: ");
                String surname = scanner.nextLine();

                System.out.print("Εισάγετε τον πρώτο βαθμό του μαθητή: ");
                double grade1 = scanner.nextDouble();

                System.out.print("Εισάγετε τον δεύτερο βαθμό του μαθητή: ");
                double grade2 = scanner.nextDouble();

                // Υπολογισμός μέσου όρου
                double average = (grade1 + grade2) / 2;

                // Εγγραφή στο αρχείο primOut.txt
                primOutWriter.println(name + " " + surname + " " + String.format("%.2f", average));

                // Εγγραφή στο log αρχείο
                logWriter.println("Επιτυχής εισαγωγή για τον μαθητή " + name + " " + surname);

                // Καθαρισμός του buffer του scanner
                scanner.nextLine();
            }
        } catch (IOException e) {
            // Εγγραφή στο log αρχείο σε περίπτωση σφάλματος
            try (PrintWriter logWriter = new PrintWriter(new FileWriter("C:\\tmp\\log.txt", true))) {
                logWriter.println("Σφάλμα: " + e.getMessage());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}


