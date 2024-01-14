package HomeWork.Chapter6.c;

/**
 * Ο κώδικας ζητά από τον χρήστη να εισάγει έξι ακεραίους
 * από 1 έως 49.  Θα πρέπει να ελεχθεί αν αυτή η εξάδα περνάει από τα παρακάτω φίλτρα:
 * Δεν έχει πάνω από 3 άρτιους
 * Δεν έχει πάνω από 3 περιττούς
 * Δεν έχει πάνω από 3 συνεχόμενους
 * Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
 * Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα.
 */


public class CheckFiltersApp {
    public static void main(String[] args) {
        int[] arr = {1-49};
      //1-49 (απο το 1 εως το 49

    }
    public static boolean moreThanThreeEvens(int[] arr) {
        if (arr == null) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 3 == 0) {
                evens++;
            }
        }
        return evens > 3;
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 3 != 0) {
                odds++;
            }
        }
        return odds > 3;
    }

    public static boolean moreThanThreeConsecutive(int[] arr) {
        if (arr == null) return false;
        int cons = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            if ((arr[i] == arr[i + 1] - 1) && (arr[i] == arr[i + 3] - 3)) {
                cons++;
            }

        }
        return cons >= 3;

    }

    public static boolean moreThanThreeSameEndings(int[] arr) {
        if (arr == null) return false;
        int[] ending = new int[10];
        boolean hasSameEndings = false;

        for (int item :ending) {
            ending[item %10]++;
        }
        for (int item : ending) {
            if (item >= 3) {
                hasSameEndings = true;
                break;
            }
        }
        return hasSameEndings;

    }


}

