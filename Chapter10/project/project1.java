package HomeWork.Chapter10.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class project1 {

    public static void main(String[] args) throws IOException {
        String inputFile = null;
        int[] numbers = readNumbersFromFile((String)inputFile);
        Scanner input = new Scanner(System.in);
        System.out.print("Δώσε το όνομα του αρχείου εισόδου: ");
        String outputFile = input.nextLine();
        Arrays.sort(numbers);
        System.out.println("Οι τελικές εξάδες εκτυπώθηκαν στο αρχείο: " + outputFile);
    }

    public static boolean isEven(int[] arr) {
        int count = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            if (num % 2 == 0) {
                ++count;
            }
        }

        return count <= 4;
    }

    public static boolean isOdd(int[] arr) {
        int count = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            if (num % 2 == 1) {
                ++count;
            }
        }

        return count <= 4;
    }

    public static boolean isContiguous(int[] arr) {
        int count = 0;

        for(int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] + 1 == arr[i + 1]) {
                ++count;
            }
        }

        return count <= 2;
    }

    public static boolean isSameEnding(int[] arr) {
        int[] endings = new int[10];
        int[] var2 = arr;
        int var3 = arr.length;

        int var4;
        int count;
        for(var4 = 0; var4 < var3; ++var4) {
            count = var2[var4];
            int ending = count % 10;
            int var10002 = endings[ending]++;
        }

        var2 = endings;
        var3 = endings.length;

        for(var4 = 0; var4 < var3; ++var4) {
            count = var2[var4];
            if (count > 3) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSameTen(int[] arr) {
        int[] tens = new int[5];
        int[] var2 = arr;
        int var3 = arr.length;

        int var4;
        int count;
        for(var4 = 0; var4 < var3; ++var4) {
            count = var2[var4];
            int ten = count / 10;
            int var10002 = tens[ten]++;
        }

        var2 = tens;
        var3 = tens.length;

        for(var4 = 0; var4 < var3; ++var4) {
            count = var2[var4];
            if (count > 3) {
                return false;
            }
        }

        return true;
    }

    public static void printArray(int[] arr, PrintWriter out) {
        for(int i = 0; i < arr.length; ++i) {
            out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    private static int[] readNumbersFromFile(String filename) throws IOException {
        List<Integer> numbersList = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\tmp\\project1.txt"));

        String line;
        try {
            while((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                numbersList.add(number);
            }
        } catch (Throwable var6) {
            try {
                reader.close();
            } catch (Throwable var5) {
                var6.addSuppressed(var5);
            }

            throw var6;
        }

        reader.close();
        int[] numbers = new int[numbersList.size()];

        for(int i = 0; i < numbersList.size(); ++i) {
            numbers[i] = (Integer)numbersList.get(i);
        }

        return numbers;
    }
}
