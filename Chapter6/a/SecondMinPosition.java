package HomeWork.Chapter6.a;

/**
 * Ανάπτυξη προγράμματος που βρίσκει το
 * 2ο μικρότερο στοιχείο ενός πίνακα.
 */
public class SecondMinPosition {
    public static void main(String[] args) {

        int[] arr = {6, 9, 10, 4, 2, 3, 22, 8, 7};
        int secondminPosition;
        int secondminPosition2;

        secondminPosition = getSecondMinPosition(arr);
       secondminPosition2 = findSecondMin(arr);
        if (secondminPosition == -1) System.exit(1);
        if (secondminPosition2 == -1) System.exit(1);

        System.out.printf("SecMinPos: %d, SecMinValue: %d/n", (secondminPosition + 1), arr[secondminPosition]);
        System.out.printf("SecMinPos: %d, SecMinValue: %d", (secondminPosition2 + 1), arr[secondminPosition2]);
    }

    public static int getSecondMinPosition(int[] arr) {
        int min = 0;
        int secondMin = 1;
        int minValue = 0;
        int secondMinValue = 0;

        if (arr == null) return -1;
        if (arr.length < 2) return -1;

        minValue = Integer.MAX_VALUE;
        secondMinValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < minValue) && (arr[i] < secondMinValue)) {
                secondMin = min;
                secondMinValue = minValue;
                min = i;
                minValue = arr[i];
            } else if ((arr[i] > minValue) && (arr[i] < secondMinValue)) {
                secondMin = i;
                secondMinValue = arr[i];
            }
        }

        return secondMin;
    }

    public static int findSecondMin(int[] arr) {
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < secondMin) && (arr[i] != min)) {
                minPosition = i;
                secondMin = arr[minPosition];
            }
        }

        return minPosition;
    }
}

