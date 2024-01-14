package HomeWork.Chapter6.a;

/**
 * Αναπτύξη μεθόδου ενός πίνακα που να επιστρέφει
 * την θέση στον πίνακα arr του μέγιστου στοιχείου πίνακα
 */
public class MaxPositionApp {
    public static void main(String[] args) {
        int[] arr = {4, 8, 12, 6, 5, 3, 2, 22};
        int maxPosition;

        maxPosition=GetMaxPosition(arr,0, arr.length - 1);
        if (maxPosition == -1) {
            System.out.println("no element");
        }

        System.out.println(arr[maxPosition]);
    }

    public static int GetMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue;

        if ((arr== null) || (high < arr.length - 1)) {
            System.out.println("Error");
            return -1;
        }
        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] <maxValue) {
                maxPosition = i;
                maxValue = arr [i];
            }
        }
       return maxPosition;

}
}

