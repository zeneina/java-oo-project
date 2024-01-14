package HomeWork.Chapter10.project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumSumSubarray {
    public MaximumSumSubarray() {
    }

    public static int maxSubArray(int[] nums) {
        if (nums != null && nums.length != 0) {
            int localMax = nums[0];
            int globalMax = nums[0];

            for(int i = 1; i < nums.length; ++i) {
                localMax = Math.max(nums[i], localMax + nums[i]);
                globalMax = Math.max(globalMax, localMax);
            }

            return globalMax;
        } else {
            return 0;
        }
    }

    private static int[] readArrayFromFile(String filePath) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; ++i) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        return arr;
    }

    public static void main(String[] args) {
        try {
            int[] arr = readArrayFromFile("C:\\Users\\ina_z\\IdeaProjects\\CFTested\\src\\gr\\aueb\\cf\\HomeWork\\chapter10\\project\\maxfile.txt");
            int result = maxSubArray(arr);
            System.out.println("Maximum sum subarray: " + result);
        } catch (FileNotFoundException var3) {
            System.err.println("File not found!");
        }

    }
}
