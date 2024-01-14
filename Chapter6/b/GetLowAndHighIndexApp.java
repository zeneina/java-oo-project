package gr.aueb.cf.HomeWork.chapter6b;

import java.util.Scanner;
/**
 * Μέθοδο που  υπολογίζει και επιστρέφει τα low και high
 *  index ενός πίνακα
 *
 */
public class GetLowAndHighIndexApp {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 6, 7, 8, 8, 8, 9};
        int key = 0;
        int indexHigh = 0;
        int indexLow = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        key = in.nextInt();


        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] == arr[0]) && (arr[i] == key)) {
                indexLow = i;
            } else if ((arr[i] == key) && (arr[i - 1] != key)) {
                indexLow = i;
            }

            if ((arr[i] == (arr.length - 1)) && (arr[i] == key)) {
                indexHigh = i;
            } else if ((arr[i] == key) && (arr[i + 1] != key)) {
                indexHigh = i;
            }
        }

        System.out.printf("The index for the number %d is %d and the high index is %d", key, (indexLow + 1), (indexHigh +1));
    }
}