// Squares of a Sorted Array

// Better Approach - TC: O(nlogn), SC: (1)

import java.util.*;

public class Leetcode977 {

    public static int[] sortedSquares(int nums[]) {

        int n = nums.length;

        int sqr[] = new int[n];

        for(int i = 0; i < n; i++) {

            int num = nums[i];

            int square = num * num;
            sqr[i] = square;
        }

        Arrays.sort(sqr);

        return sqr;
    }
    public static void main(String[] args) {
        
        int nums[] = {-7, -3, 2, 3, 11};

        System.out.println("Squares of Sorted Array is: " + Arrays.toString(sortedSquares(nums)));
    }
    
}
