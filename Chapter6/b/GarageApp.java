package gr.aueb.cf.HomeWork.chapter6b;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Δυσδιάστατος πίνακας που περιέχει τα στοιχεία άφιξης και
 * αναχώρησης αυτοκινήτων.
 * Ανάπτυξη εφαρμογής που διαβάζει και εκτυπώνει τον μέγιστο αριθμό αυτοκινήτων
 * που είναι σταθμευμένα το ίδιο χρονικό διάστημα
 */
public class GarageApp {
    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int[][] times = new int[arr.length * 2][2];
        int index = 0;

        // Populate the new array with arrival times (flag 1) and departure times (flag 0)
        for (int[] car : arr) {
            times[index][0] = car[0];
            times[index][1] = 1; // Arrival flag
            index++;

            times[index][0] = car[1];
            times[index][1] = 0; // Departure flag
            index++;
        }

        // Sort the times array based on the first column (time)
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));

        int maxCars = 0;
        int currentCars = 0;

        // υπολογισμός μέγιστου αριθμού αυτοκινήτων
        for (int[] time : times) {
            if (time[1] == 1) {
                // Arrival
                currentCars++;
            } else {
                // Departure
                currentCars--;
            }

            maxCars = Math.max(maxCars, currentCars);
        }

        System.out.println("Maximum number of cars parked at the same time: " + maxCars);
    }
}