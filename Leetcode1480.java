// Running Sum of 1d Array


// Optimized Approach - TC: O(n),   SC: O(n)
import java.util.*;

public class Leetcode1480 {

    public static int[] sum_1dArray(int nums[]) {

        int n = nums.length;
        int sum = 0;

        int runningSum[] = new int[n];

        for(int i = 0; i < n; i++) {

            sum = sum + nums[i];

            runningSum[i] = sum;
        }

        System.out.println("Original Array: " + Arrays.toString(nums));

        return runningSum;
    }

    public static void main(String args[]) {

        int nums[] = {3, 1, 2, 10, 1};

        System.out.println("Sum of Array  : " + Arrays.toString(sum_1dArray(nums)));
    }
}
